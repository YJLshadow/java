package com.service;

import com.entity.Tb_BankCardEntity;
import com.entity.Tb_OrderEntity;

import java.util.List;

public interface IOrderService {

    public void addTb_Order(Tb_OrderEntity orderEntity);


    public List<Tb_OrderEntity> getall();

    public List<Tb_OrderEntity> selectWhere(String index, String userId, String staffId, String orderType);


    public Tb_OrderEntity getbyid(String orderId);


    public void updateTb_Order(Tb_OrderEntity orderEntity);


    public void deleteTb_Order(String orderId);


    public int getMax(String userId, String staffId, String orderType);

}
