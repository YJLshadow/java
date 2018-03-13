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
        iBankCardDao.addTb_BankCard(bankCardEntity);
    }

    public List<Tb_BankCardEntity> getall() {
        return null;
    }

    public List<Tb_BankCardEntity> selectWhere(String index, String bankId,String userId, String bankCard) {
        int end=8;
        int start=1;
        if(index!=null){
            start =(Integer.parseInt(index)-1) * end;
        }
        List<Tb_BankCardEntity> bankCardEntities=iBankCardDao.selectWhere(start,end,Integer.parseInt(bankId),Integer.parseInt(userId),bankCard);
        return bankCardEntities;
    }

    public Tb_BankCardEntity getbyid(String cardId) {
        Tb_BankCardEntity bankCardEntity=iBankCardDao.getbyid(Integer.parseInt(cardId));
        return bankCardEntity;
    }

    public void updateTb_BankCard(Tb_BankCardEntity bankCardEntity) {
        iBankCardDao.updateTb_BankCard(bankCardEntity);
    }

    public void deleteTb_BankCard(String cardId) {
        iBankCardDao.deleteTb_BankCard(Integer.parseInt(cardId));
    }

    public int getMax(String bankId,String userId, String bankCard) {
        int end=8;
        int maxPage=iBankCardDao.getMax(Integer.parseInt(bankId),Integer.parseInt(userId),bankCard)/end;
        if(iBankCardDao.getMax(Integer.parseInt(bankId),Integer.parseInt(userId),bankCard)%end!=0){
            maxPage=maxPage+1;
        }
        return maxPage;
    }
}
