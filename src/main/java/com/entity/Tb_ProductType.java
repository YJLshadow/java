package com.entity;

public class Tb_ProductType {

    private Integer typeId;
    private String typeName;

    public Tb_ProductType() {
    }

    public Tb_ProductType(String typeName) {
        this.typeName = typeName;
    }

    public Tb_ProductType(Integer typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Tb_ProductType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
