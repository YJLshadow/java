package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.Tb_BankCardEntity;
import com.entity.Tb_BankEntity;
import com.service.IBankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "bankCard")
@Controller
public class BankCardController {

    @Autowired
    IBankCardService iBankCardService;

    @ResponseBody
    @RequestMapping(value = "selectWhere")
    public Map<String,Object> selectWhere(HttpServletRequest request){
        Map<String, Object> map = null ;
        try {
            request.setCharacterEncoding("utf-8");
            String bankCard = request.getParameter("bankCard");
            String userId = request.getParameter("userId");
            String bankId = request.getParameter("bankId");
            String index = request.getParameter("index");
            List<Tb_BankCardEntity> bankCardEntities= iBankCardService.selectWhere(index, (bankId==null?"":bankId),(userId==null?"":userId),(bankCard==null?"":bankCard));
            map = new HashMap<String, Object>();
            int maxPage=iBankCardService.getMax(bankId,userId,bankCard);
            map.put("totals", maxPage);
            map.put("rowsList",bankCardEntities);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        System.out.println("qwertyui"+map.toString());
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "getById")
    public Tb_BankCardEntity getById(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String id = request.getParameter("cardId");
        Tb_BankCardEntity bankCardEntity = iBankCardService.getbyid(id);
        return bankCardEntity;
    }

    @ResponseBody
    @RequestMapping(value = "addTb_BankCard")
    public String addTb_BankCard(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Tb_BankCardEntity bankCardEntity = JSON.parseObject(request.getParameter("bankCardEntity"),Tb_BankCardEntity.class);
        String message = "";
        try {
            iBankCardService.addTb_BankCard(bankCardEntity);
            message = "增加成功！";
        }catch (Exception e){
            message = "增加失败！";

        }
        return message;
    }

    @ResponseBody
    @RequestMapping(value = "deleteTb_BankCard")
    public String deleteTb_BankCard(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String id = request.getParameter("cardId");
        String result = "";
        try {
            iBankCardService.deleteTb_BankCard(id);
            result = "删除成功！";
        }catch (Exception e){
            result = "删除失败！";
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "updateTb_BankCard")
    public String updateTb_BankCard(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Tb_BankCardEntity bankCardEntity = JSON.parseObject(request.getParameter("bankCardEntity"),Tb_BankCardEntity.class);
        String message = "";
        try {
            iBankCardService.updateTb_BankCard(bankCardEntity);
            message = "修改成功！";
        }catch (Exception e){
            message = "修改失败！";
        }
        return message;
    }


}
