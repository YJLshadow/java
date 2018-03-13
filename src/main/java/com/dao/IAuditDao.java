package com.dao;

import com.entity.Tb_AuditEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAuditDao {

    public void addTb_Audit(Tb_AuditEntity auditEntity);

    public List<Tb_AuditEntity> getall();

    public List<Tb_AuditEntity> selectWhere(Integer start, Integer end, Integer staffId, Integer orderId);


    public Tb_AuditEntity getbyid(Integer auditId);


    public void updateTb_Audit(Tb_AuditEntity auditEntity);


    public int getMax(Integer staffId, Integer orderId);




}
