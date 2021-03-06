package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.Tb_BankEntity;
import com.entity.Tb_CompanyEntity;
import com.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "company")
@Controller
public class CompanyController {

    @Autowired
    ICompanyService iCompanyService;

    @ResponseBody
    @RequestMapping(value = "selectWhere")
    public Map<String,Object> selectWhere(HttpServletRequest request){
        Map<String, Object> map = null ;
        try {
            request.setCharacterEncoding("utf-8");
            String companyName = request.getParameter("companyName");
            String index = request.getParameter("index");
            List<Tb_CompanyEntity> companyEntities= iCompanyService.selectWhere(index, (companyName==null?"":companyName));
            map = new HashMap<String, Object>();
            int maxPage=iCompanyService.getMax(companyName);
            map.put("totals", maxPage);
            map.put("rowsList",companyEntities);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        System.out.println("111112345678987654"+map.toString());
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "getById")
    public Tb_CompanyEntity getById(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String id = request.getParameter("companyId");
        Tb_CompanyEntity companyEntity = iCompanyService.getbyid(id);
        return companyEntity;
    }

    @ResponseBody
    @RequestMapping(value = "addTb_Company")
    public String addTb_Company(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Tb_CompanyEntity companyEntity = JSON.parseObject(request.getParameter("companyEntity"),Tb_CompanyEntity.class);
        String message = "";
        try {
            iCompanyService.addTb_Company(companyEntity);
            message = "增加成功！";
        }catch (Exception e){
            message = "增加失败！";

        }
        return message;
    }

    @ResponseBody
    @RequestMapping(value = "deleteTb_Company")
    public String deleteTb_Company(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String id = request.getParameter("companyId");
        String result = "";
        try {
            iCompanyService.deleteTb_Company(id);
            result = "删除成功！";
        }catch (Exception e){
            result = "删除失败！";
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "updateTb_Company")
    public String updateTb_Company(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Tb_CompanyEntity companyEntity = JSON.parseObject(request.getParameter("companyEntity"),Tb_CompanyEntity.class);
        String message = "";
        try {
            iCompanyService.updateTb_Company(companyEntity);
            message = "修改成功！";
        }catch (Exception e){
            message = "修改失败！";
        }
        return message;
    }



}
