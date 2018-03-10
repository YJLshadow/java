package com.service.YJL;

import com.entity.Tb_BankCardEntity;
import com.entity.Tb_ProductEntity;

import java.util.List;

public interface IProductService {
    /**
     * 增加
     * @param productEntity
     */
    public void addTb_Product(Tb_ProductEntity productEntity);

    public List<Tb_ProductEntity> getall();

    public List<Tb_BankCardEntity> selectWhere(String start,String end,String id,String bankCard);


    public Tb_BankCardEntity getbyid(String cardId);



    public void updateTb_BankCard(Tb_BankCardEntity bankCardEntity);



    public void deleteTb_BankCard(String bankdId);


    public int getMax(String id,String bankCard);
}
