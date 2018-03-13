package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.Tb_AuditEntity;
import com.entity.Tb_BankCardEntity;
import com.service.IAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "audit")
@Controller
public class AuditController {

    @Autowired
    IAuditService iAuditService;


    @ResponseBody
    @RequestMapping(value = "selectWhere")
    public Map<String,Object> selectWhere(HttpServletRequest request){
        Map<String, Object> map = null ;
        try {
            request.setCharacterEncoding("utf-8");
            String staffId = request.getParameter("staffId");
            String orderId = request.getParameter("orderId");
            String index = request.getParameter("index");
            List<Tb_AuditEntity> auditEntities= iAuditService.selectWhere(index, (staffId==null?"":staffId),(orderId==null?"":orderId));
            map = new HashMap<String, Object>();
            int maxPage=iAuditService.getMax(staffId,orderId);
            map.put("totals", maxPage);
            map.put("rowsList",auditEntities);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        System.out.println("qwertyui"+map.toString());
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "getById")
    public Tb_AuditEntity getById(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String id = request.getParameter("cardId");
        Tb_AuditEntity auditEntity = iAuditService.getbyid(id);
        return auditEntity;
    }

    @ResponseBody
    @RequestMapping(value = "addTb_Audit")
    public String addTb_Audit(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Tb_AuditEntity auditEntity = JSON.parseObject(request.getParameter("auditEntity"),Tb_AuditEntity.class);
        String message = "";
        try {
            iAuditService.addTb_Audit(auditEntity);
            message = "增加成功！";
        }catch (Exception e){
            message = "增加失败！";
        }
        return message;
    }


    @ResponseBody
    @RequestMapping(value = "updateTb_Audit")
    public String updateTb_Audit(HttpServletRequest request){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Tb_AuditEntity auditEntity = JSON.parseObject(request.getParameter("auditEntity"),Tb_AuditEntity.class);
        String message = "";
        try {
            iAuditService.updateAudit(auditEntity);
            message = "修改成功！";
        }catch (Exception e){
            message = "修改失败！";
        }
        return message;
    }


}
