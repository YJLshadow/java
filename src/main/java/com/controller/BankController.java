package com.controller;

import com.entity.Tb_BankEntity;
import com.service.IBankService;
import org.jcp.xml.dsig.internal.MacOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;

@RequestMapping(value = "bank")
@Controller
public class BankController {

    @Autowired
    IBankService iBankService;


    @ResponseBody
    @RequestMapping(value = "selectWhere")
    public Map<String,Object> selectWhere(HttpServletRequest request) throws UnsupportedEncodingException {
        Map<String, Object> map = null ;
        request.setCharacterEncoding("utf-8");
        String bankName = request.getParameter("bankName");
        String index = request.getParameter("index");
        List<Tb_BankEntity> bankEntityList= iBankService.selectWhere(index, bankName);
        map = new HashMap<String, Object>();
        int maxPage=iBankService.getMax(bankName);
        map.put("totals", maxPage);
        map.put("rowsList",bankEntityList);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "getById")
    public Tb_BankEntity getById(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String id = request.getParameter("bankId");
        Tb_BankEntity bankEntity = iBankService.getbyid(id);
        return bankEntity;
    }

    @ResponseBody
    @RequestMapping(value = "addTb_Bank")
    public String addTb_Bank(HttpServletRequest request, HttpServletResponse response){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Tb_BankEntity bankEntity = JSON.parseObject(request.getParameter("bankEntity"),Tb_BankEntity.class);
        bankEntity.setBankDate(new Date());
        response.setCharacterEncoding("utf-8");
        String message = "";
        try {
            iBankService.addTb_Bank(bankEntity);
            message = "增加成功！";
        }catch (Exception e){
            message = "增加失败！";

        }
        return message;
    }

    @ResponseBody
    @RequestMapping(value = "deleteTb_Bank")
    public String deleteTb_Bank(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String id = request.getParameter("bankId");
        String message = "";
        try {
            iBankService.deleteTb_Bank(id);
            message = "删除成功！";
        }catch (Exception e){
            message = "删除失败！";
        }
        return message;
    }

    @ResponseBody
    @RequestMapping(value = "updateTb_Bank")
    public String updateTb_Bank(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Tb_BankEntity bankEntity = JSON.parseObject(request.getParameter("bankEntity"),Tb_BankEntity.class);
        String message = "";
        try {
            iBankService.updateTb_Bank(bankEntity);
            message = "修改成功！";
        }catch (Exception e){
            message = "修改失败！";
        }
        return message;
    }

}
