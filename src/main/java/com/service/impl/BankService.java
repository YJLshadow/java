package com.service.impl;

import com.dao.IBankDao;
import com.entity.Tb_BankEntity;
import com.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankService implements IBankService{

    @Autowired
    IBankDao iBankDao;

    public void addTb_Bank(Tb_BankEntity bankEntity) {
        iBankDao.addTb_Bank(bankEntity);
    }

    public List<Tb_BankEntity> getall() {
        return null;
    }

    public List<Tb_BankEntity> selectWhere(String index, String bankName) {
        int end=8;
        int start=1;
        if(index!=null){
            start =(Integer.parseInt(index)-1) * end;
        }
        List<Tb_BankEntity> bankEntities=iBankDao.selectWhere(start,end,bankName);
        return bankEntities;
    }

    public Tb_BankEntity getbyid(String bankId) {
        Tb_BankEntity bankEntity=iBankDao.getbyid(Integer.parseInt(bankId));
        return bankEntity;
    }

    public void updateTb_Bank(Tb_BankEntity bankEntity) {
        iBankDao.updateTb_Bank(bankEntity);
    }

    public void deleteTb_Bank(String bankdId) {
        iBankDao.deleteTb_Bank(Integer.parseInt(bankdId));
    }

    public int getMax(String bankName) {
        int end=8;
        int maxPage=iBankDao.getMax(bankName)/end;
        if(iBankDao.getMax(bankName)%end!=0){
            maxPage=maxPage+1;
        }
        return maxPage;
    }
}
