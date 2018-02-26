package com.entity;

public class Tb_InformationValueEntity {

    private Integer valueId;
    private Integer informationId;
    private String valueBody;

    public Tb_InformationValueEntity() {
    }

    public Tb_InformationValueEntity(Integer informationId, String valueBody) {
        this.informationId = informationId;
        this.valueBody = valueBody;
    }

    public Tb_InformationValueEntity(Integer valueId, Integer informationId, String valueBody) {
        this.valueId = valueId;
        this.informationId = informationId;
        this.valueBody = valueBody;
    }

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public String getValueBody() {
        return valueBody;
    }

    public void setValueBody(String valueBody) {
        this.valueBody = valueBody;
    }

    @Override
    public String toString() {
        return "Tb_InformationValueEntity{" +
                "valueId=" + valueId +
                ", informationId=" + informationId +
                ", valueBody='" + valueBody + '\'' +
                '}';
    }
}
