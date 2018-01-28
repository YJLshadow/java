package com.entity;

import java.util.Date;

public class Tb_OrderEntity {

    private Integer orderID;
    private Integer userId;
    private String productCode;
    private Double order;
    private Date orderData;
    private Integer orderState;
    private Integer orderFrom;
    private Integer staffId;
    private Integer orderType;

    public Tb_OrderEntity() {
    }

    public Tb_OrderEntity(Integer userId, String productCode, Double order, Date orderData, Integer orderState, Integer orderFrom, Integer staffId, Integer orderType) {
        this.userId = userId;
        this.productCode = productCode;
        this.order = order;
        this.orderData = orderData;
        this.orderState = orderState;
        this.orderFrom = orderFrom;
        this.staffId = staffId;
        this.orderType = orderType;
    }

    public Tb_OrderEntity(Integer orderID, Integer userId, String productCode, Double order, Date orderData, Integer orderState, Integer orderFrom, Integer staffId, Integer orderType) {
        this.orderID = orderID;
        this.userId = userId;
        this.productCode = productCode;
        this.order = order;
        this.orderData = orderData;
        this.orderState = orderState;
        this.orderFrom = orderFrom;
        this.staffId = staffId;
        this.orderType = orderType;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getOrder() {
        return order;
    }

    public void setOrder(Double order) {
        this.order = order;
    }

    public Date getOrderData() {
        return orderData;
    }

    public void setOrderData(Date orderData) {
        this.orderData = orderData;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(Integer orderFrom) {
        this.orderFrom = orderFrom;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return "Tb_OrderEntity{" +
                "orderID=" + orderID +
                ", userId=" + userId +
                ", productCode='" + productCode + '\'' +
                ", order=" + order +
                ", orderData=" + orderData +
                ", orderState=" + orderState +
                ", orderFrom=" + orderFrom +
                ", staffId=" + staffId +
                ", orderType=" + orderType +
                '}';
    }
}
