package com.dao;

import com.entity.Tb_BankEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBankDao {


    public void addTb_Bank(Tb_BankEntity bankEntity);


    public List<Tb_BankEntity> getall();

    public List<Tb_BankEntity> selectWhere(Integer start,Integer end,String bankName);


    public Tb_BankEntity getbyid(Integer bankId);



    public void updateTb_Bank(Tb_BankEntity bankEntity);



    public void deleteTb_Bank(Integer bankdId);


    public int getMax(String bankName);



}
