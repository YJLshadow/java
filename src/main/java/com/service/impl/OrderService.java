package com.service.impl;

import com.dao.IOrderDao;
import com.entity.Tb_OrderEntity;
import com.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Autowired
    IOrderDao iOrderDao;

    public void addTb_Order(Tb_OrderEntity orderEntity) {
        iOrderDao.addTb_Order(orderEntity);
    }

    public List<Tb_OrderEntity> getall() {
        return null;
    }

    public List<Tb_OrderEntity> selectWhere(String index, String userId, String staffId, String orderType) {
        int end=8;
        int start=1;
        if(index!=null){
            start =(Integer.parseInt(index)-1) * end;
        }
        List<Tb_OrderEntity> orderEntities=iOrderDao.selectWhere(start,end,Integer.parseInt(userId),Integer.parseInt(staffId),Integer.parseInt(orderType));
        return orderEntities;
    }

    public Tb_OrderEntity getbyid(String orderId) {
        Tb_OrderEntity orderEntity=iOrderDao.getbyid(Integer.parseInt(orderId));
        return orderEntity;
    }

    public void updateTb_Order(Tb_OrderEntity orderEntity) {
        iOrderDao.updateTb_Order(orderEntity);
    }

    public void deleteTb_Order(String orderId) {
        iOrderDao.deleteTb_Order(Integer.parseInt(orderId));
    }

    public int getMax(String userId, String staffId, String orderType) {
        int end=8;
        int maxPage=iOrderDao.getMax(Integer.parseInt(userId),Integer.parseInt(staffId),Integer.parseInt(orderType))/end;
        if(iOrderDao.getMax(Integer.parseInt(userId),Integer.parseInt(staffId),Integer.parseInt(orderType))%end!=0){
            maxPage=maxPage+1;
        }
        return maxPage;
    }
}
