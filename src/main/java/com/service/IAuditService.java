package com.service;

import com.entity.Tb_AuditEntity;

import java.util.List;


public interface IAuditService {

    public void addTb_Audit(Tb_AuditEntity auditEntity);


    public List<Tb_AuditEntity> getall();

    public List<Tb_AuditEntity> selectWhere(String index, String staffId, String orderId);


    public Tb_AuditEntity getbyid(String auditId);


    public void updateAudit(Tb_AuditEntity auditEntity);


    public int getMax(String staffId, String orderId);


}
