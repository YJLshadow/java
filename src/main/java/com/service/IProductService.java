package com.service;

import com.entity.Tb_BankCardEntity;
import com.entity.Tb_ProductEntity;

import java.util.List;

public interface IProductService {
    /**
     * 增加产品
     * @param productEntity
     */
    public void addTb_Product(Tb_ProductEntity productEntity);

    /**
     * 查询全部
     * @return
     */
    public List<Tb_ProductEntity> getAll();


    public List<Tb_ProductEntity> selectWhere(String start,String end,String id,String bankCard);


    public Tb_ProductEntity getById(String cardId);



    public void updateTb_Product(Tb_BankCardEntity bankCardEntity);


    /**
     * 根据id删除
     * @param productCode
     */
    public void deleteTb_Product(String productCode);


    public int getMax(String id,String bankCard);
}
