package com.dao;

import com.entity.Tb_AuditEntity;
import com.entity.Tb_OrderEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IOrderDao {

    public void addTb_Order(Tb_OrderEntity orderEntity);

    public List<Tb_OrderEntity> getall();

    public List<Tb_OrderEntity> selectWhere(Integer start, Integer end, Integer userId, Integer staffId, Integer orderType);


    public Tb_OrderEntity getbyid(Integer orderId);


    public void updateTb_Order(Tb_OrderEntity orderEntity);

    public void deleteTb_Order(Integer orderId);

    public int getMax(Integer userId, Integer staffId, Integer orderType);




}
