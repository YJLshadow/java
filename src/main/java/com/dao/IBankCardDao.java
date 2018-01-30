package com.dao;

import com.entity.Tb_BankCardEntity;

import java.util.List;

public interface IBankCardDao {

    public void addTb_BankCard(Tb_BankCardEntity bankCardEntity);


    public List<Tb_BankCardEntity> getall();

    public List<Tb_BankCardEntity> selectWhere(Integer start,Integer end,Integer id,String bankCard);


    public Tb_BankCardEntity getbyid(Integer cardId);



    public void updateTb_BankCard(Tb_BankCardEntity bankCardEntity);



    public void deleteTb_BankCard(Integer bankdId);


    public int getMax(Integer id,String bankCard);

}
