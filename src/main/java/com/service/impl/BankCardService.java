package com.service.impl;

import com.dao.IBankCardDao;
import com.entity.Tb_BankCardEntity;
import com.service.IBankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankCardService implements IBankCardService {

    @Autowired
    IBankCardDao iBankCardDao;

    public void addTb_BankCard(Tb_BankCardEntity bankCardEntity) {

    }

    public List<Tb_BankCardEntity> getall() {
        return null;
    }

    public List<Tb_BankCardEntity> selectWhere(String start, String end, String id, String bankCard) {
        return null;
    }

    public Tb_BankCardEntity getbyid(String cardId) {
        return null;
    }

    public void updateTb_BankCard(Tb_BankCardEntity bankCardEntity) {

    }

    public void deleteTb_BankCard(String bankdId) {

    }

    public int getMax(String id, String bankCard) {
        return 0;
    }
}
