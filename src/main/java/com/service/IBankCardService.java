package com.service;

import com.entity.Tb_BankCardEntity;

import java.util.List;

public interface IBankCardService {

    public void addTb_BankCard(Tb_BankCardEntity bankCardEntity);


    public List<Tb_BankCardEntity> getall();

    public List<Tb_BankCardEntity> selectWhere(String index, String bankId, String userId, String bankCard);


    public Tb_BankCardEntity getbyid(String cardId);



    public void updateTb_BankCard(Tb_BankCardEntity bankCardEntity);



    public void deleteTb_BankCard(String cardId);


    public int getMax(String bankId, String userId, String bankCard);

}
