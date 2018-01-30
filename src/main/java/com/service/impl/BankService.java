package com.service.impl;

import com.dao.IBankDao;
import com.entity.Tb_BankEntity;
import com.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService implements IBankService{

    @Autowired
    IBankDao iBankDao;

    public void addTb_Bank(Tb_BankEntity bankEntity) {

    }

    public List<Tb_BankEntity> getall() {
        return null;
    }

    public List<Tb_BankEntity> selectWhere(String start, String end, String bankName) {
        return null;
    }

    public Tb_BankEntity getbyid(String bankId) {
        return null;
    }

    public void updateTb_Bank(Tb_BankEntity bankEntity) {

    }

    public void deleteTb_Bank(String bankdId) {

    }

    public int getMax(String bankName) {
        return 0;
    }
}
