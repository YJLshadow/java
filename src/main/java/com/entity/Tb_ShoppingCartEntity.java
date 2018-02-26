package com.entity;

import java.util.Date;

public class Tb_ShoppingCartEntity {

    private Integer scId;
    private Integer userId;
    private String productCode;
    private Date scData;

    public Tb_ShoppingCartEntity() {
    }

    public Tb_ShoppingCartEntity(Integer userId, String productCode, Date scData) {
        this.userId = userId;
        this.productCode = productCode;
        this.scData = scData;
    }

    public Tb_ShoppingCartEntity(Integer scId, Integer userId, String productCode, Date scData) {
        this.scId = scId;
        this.userId = userId;
        this.productCode = productCode;
        this.scData = scData;
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
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

    public Date getScData() {
        return scData;
    }

    public void setScData(Date scData) {
        this.scData = scData;
    }

    @Override
    public String toString() {
        return "Tb_ShoppingCartEntity{" +
                "scId=" + scId +
                ", userId=" + userId +
                ", productCode='" + productCode + '\'' +
                ", scData=" + scData +
                '}';
    }
}
