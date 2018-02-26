package com.entity;

public class Tb_ProductInformationEntity {

    private Integer informationId;
    private String informationName;
    private String productCode;
    private String remarks;

    public Tb_ProductInformationEntity() {
    }

    public Tb_ProductInformationEntity(String informationName, String productCode, String remarks) {
        this.informationName = informationName;
        this.productCode = productCode;
        this.remarks = remarks;
    }

    public Tb_ProductInformationEntity(Integer informationId, String informationName, String productCode, String remarks) {
        this.informationId = informationId;
        this.informationName = informationName;
        this.productCode = productCode;
        this.remarks = remarks;
    }

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public String getInformationName() {
        return informationName;
    }

    public void setInformationName(String informationName) {
        this.informationName = informationName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Tb_ProductInformationEntity{" +
                "informationId=" + informationId +
                ", informationName='" + informationName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
