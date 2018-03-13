package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.Tb_BankCardEntity;
import com.entity.Tb_OrderEntity;
import com.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "order")
@Controller
public class OrderController {

    @Autowired
    IOrderService iOrderService;

    @ResponseBody
    @RequestMapping(value = "selectWhere")
    public Map<String,Object> selectWhere(HttpServletRequest request){
        Map<String, Object> map = null ;
        try {
            request.setCharacterEncoding("utf-8");
            String userId = request.getParameter("userId");
            String staffId = request.getParameter("staffId");
            String orderType = request.getParameter("orderType");
            String index = request.getParameter("index");
            List<Tb_OrderEntity> orderEntities= iOrderService.selectWhere(index, (userId==null?"":userId),(staffId==null?"":staffId),(orderType==null?"":orderType));
            map = new HashMap<String, Object>();
            int maxPage=iOrderService.getMax(userId,staffId,orderType);
            map.put("totals", maxPage);
            map.put("rowsList",orderEntities);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        System.out.println("qwezxcvbnmnbvsdfgrtyui"+map.toString());
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "getById")
    public Tb_OrderEntity getById(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String id = request.getParameter("orderId");
        Tb_OrderEntity orderEntity = iOrderService.getbyid(id);
        return orderEntity;
    }

    @ResponseBody
    @RequestMapping(value = "addTb_Order")
    public String addTb_BankCard(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Tb_OrderEntity orderEntity = JSON.parseObject(request.getParameter("orderEntity"),Tb_OrderEntity.class);
        String message = "";
        try {
            iOrderService.addTb_Order(orderEntity);
            message = "增加成功！";
        }catch (Exception e){
            message = "增加失败！";

        }
        return message;
    }

    @ResponseBody
    @RequestMapping(value = "deleteTb_Order")
    public String deleteTb_Order(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String id = request.getParameter("orderId");
        String result = "";
        try {
            iOrderService.deleteTb_Order(id);
            result = "删除成功！";
        }catch (Exception e){
            result = "删除失败！";
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "updateTb_Order")
    public String updateTb_Order(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Tb_OrderEntity orderEntity = JSON.parseObject(request.getParameter("orderEntity"),Tb_OrderEntity.class);
        String message = "";
        try {
            iOrderService.updateTb_Order(orderEntity);
            message = "修改成功！";
        }catch (Exception e){
            message = "修改失败！";
        }
        return message;
    }




}
