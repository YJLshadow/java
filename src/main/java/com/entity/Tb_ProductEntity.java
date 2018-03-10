package com.entity;

import lombok.Data;

@Data
public class Tb_ProductEntity {

    private String productCode;//产品编码
    private String productName;//产品名
    private Integer typeId;//铲平
    private String applyCrowd;
    private String deadline;
    private Integer issuerId;
    private String insuranceType;
    private Double premium;
    private String insuranceBody;
    private Double startMoney;
    private Integer yield;
    private String scale;
    private String eamingsAllocation;
    private String image;
    private Integer productState;

    public Tb_ProductEntity() {
    }

    public Tb_ProductEntity(String productName, Integer typeId, String applyCrowd, String deadline, Integer issuerId, String insuranceType, Double premium, String insuranceBody, Double startMoney, Integer yield, String scale, String eamingsAllocation, String image, Integer productState) {
        this.productName = productName;
        this.typeId = typeId;
        this.applyCrowd = applyCrowd;
        this.deadline = deadline;
        this.issuerId = issuerId;
        this.insuranceType = insuranceType;
        this.premium = premium;
        this.insuranceBody = insuranceBody;
        this.startMoney = startMoney;
        this.yield = yield;
        this.scale = scale;
        this.eamingsAllocation = eamingsAllocation;
        this.image = image;
        this.productState = productState;
    }

    public Tb_ProductEntity(String productCode, String productName, Integer typeId, String applyCrowd, String deadline, Integer issuerId, String insuranceType, Double premium, String insuranceBody, Double startMoney, Integer yield, String scale, String eamingsAllocation, String image, Integer productState) {
        this.productCode = productCode;
        this.productName = productName;
        this.typeId = typeId;
        this.applyCrowd = applyCrowd;
        this.deadline = deadline;
        this.issuerId = issuerId;
        this.insuranceType = insuranceType;
        this.premium = premium;
        this.insuranceBody = insuranceBody;
        this.startMoney = startMoney;
        this.yield = yield;
        this.scale = scale;
        this.eamingsAllocation = eamingsAllocation;
        this.image = image;
        this.productState = productState;
    }
    @Override
    public String toString() {
        return "Tb_ProductEntity{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", typeId=" + typeId +
                ", applyCrowd='" + applyCrowd + '\'' +
                ", deadline='" + deadline + '\'' +
                ", issuerId=" + issuerId +
                ", insuranceType='" + insuranceType + '\'' +
                ", premium=" + premium +
                ", insuranceBody='" + insuranceBody + '\'' +
                ", startMoney=" + startMoney +
                ", yield=" + yield +
                ", scale='" + scale + '\'' +
                ", eamingsAllocation='" + eamingsAllocation + '\'' +
                ", image='" + image + '\'' +
                ", productState=" + productState +
                '}';
    }
}
