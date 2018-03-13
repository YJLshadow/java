package com.service.impl;

import com.dao.IAuditDao;
import com.entity.Tb_AuditEntity;
import com.service.IAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditService implements IAuditService {

    @Autowired
    IAuditDao iAuditDao;

    public void addTb_Audit(Tb_AuditEntity auditEntity) {
        iAuditDao.addTb_Audit(auditEntity);
    }

    public List<Tb_AuditEntity> getall() {
        return null;
    }

    public List<Tb_AuditEntity> selectWhere(String index, String staffId, String orderId) {
        int end=8;
        int start=1;
        if(index!=null){
            start =(Integer.parseInt(index)-1) * end;
        }
        List<Tb_AuditEntity> auditEntities=iAuditDao.selectWhere(start,end,Integer.parseInt(staffId),Integer.parseInt(orderId));
        return auditEntities;
    }

    public Tb_AuditEntity getbyid(String auditId) {
        Tb_AuditEntity auditEntity=iAuditDao.getbyid(Integer.parseInt(auditId));
        return auditEntity;
    }

    public void updateAudit(Tb_AuditEntity auditEntity) {
        iAuditDao.updateTb_Audit(auditEntity);
    }

    public int getMax(String staffId, String orderId) {
        int end=8;
        int maxPage=iAuditDao.getMax(Integer.parseInt(staffId),Integer.parseInt(orderId))/end;
        if(iAuditDao.getMax(Integer.parseInt(staffId),Integer.parseInt(orderId))%end!=0){
            maxPage=maxPage+1;
        }
        return maxPage;
    }
}
