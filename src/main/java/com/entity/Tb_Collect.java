package com.entity;

import java.util.Date;

public class Tb_Collect {

    private Integer collectId;
    private Integer userId;
    private String productCode;
    private Date orderData;

    public Tb_Collect() {
    }

    public Tb_Collect(Integer userId, String productCode, Date orderData) {
        this.userId = userId;
        this.productCode = productCode;
        this.orderData = orderData;
    }

    public Tb_Collect(Integer collectId, Integer userId, String productCode, Date orderData) {
        this.collectId = collectId;
        this.userId = userId;
        this.productCode = productCode;
        this.orderData = orderData;
    }

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
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

    public Date getOrderData() {
        return orderData;
    }

    public void setOrderData(Date orderData) {
        this.orderData = orderData;
    }

    @Override
    public String toString() {
        return "Tb_Collect{" +
                "collectId=" + collectId +
                ", userId=" + userId +
                ", productCode='" + productCode + '\'' +
                ", orderData=" + orderData +
                '}';
    }
}
