package com.dao;

import com.entity.Tb_BankCardEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IBankCardDao {

    public void addTb_BankCard(Tb_BankCardEntity bankCardEntity);


    public List<Tb_BankCardEntity> getall();

    public List<Tb_BankCardEntity> selectWhere(Integer start, Integer end, Integer bankId, Integer userId, String bankCard);


    public Tb_BankCardEntity getbyid(Integer cardId);



    public void updateTb_BankCard(Tb_BankCardEntity bankCardEntity);



    public void deleteTb_BankCard(Integer cardId);


    public int getMax(Integer bankId, Integer userId, String bankCard);

}
