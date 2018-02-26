package com.entity;

public class Tb_ProductEntity {

    private String productCode;
    private String productName;
    private Integer typeId;
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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getApplyCrowd() {
        return applyCrowd;
    }

    public void setApplyCrowd(String applyCrowd) {
        this.applyCrowd = applyCrowd;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Integer getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Integer issuerId) {
        this.issuerId = issuerId;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public Double getPremium() {
        return premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
    }

    public String getInsuranceBody() {
        return insuranceBody;
    }

    public void setInsuranceBody(String insuranceBody) {
        this.insuranceBody = insuranceBody;
    }

    public Double getStartMoney() {
        return startMoney;
    }

    public void setStartMoney(Double startMoney) {
        this.startMoney = startMoney;
    }

    public Integer getYield() {
        return yield;
    }

    public void setYield(Integer yield) {
        this.yield = yield;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getEamingsAllocation() {
        return eamingsAllocation;
    }

    public void setEamingsAllocation(String eamingsAllocation) {
        this.eamingsAllocation = eamingsAllocation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getProductState() {
        return productState;
    }

    public void setProductState(Integer productState) {
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
