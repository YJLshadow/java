package com.service;

import com.entity.Tb_BankEntity;

import java.util.List;

public interface IBankService {

    public void addTb_Bank(Tb_BankEntity bankEntity);


    public List<Tb_BankEntity> getall();

    public List<Tb_BankEntity> selectWhere(String start,String end,String bankName);


    public Tb_BankEntity getbyid(String bankId);



    public void updateTb_Bank(Tb_BankEntity bankEntity);



    public void deleteTb_Bank(String bankdId);

    public int getMax(String bankName);


}
