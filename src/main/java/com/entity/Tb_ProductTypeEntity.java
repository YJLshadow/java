package com.entity;

public class Tb_ProductTypeEntity {

    private Integer typeId;
    private String typeName;

    public Tb_ProductTypeEntity() {
    }

    public Tb_ProductTypeEntity(String typeName) {
        this.typeName = typeName;
    }

    public Tb_ProductTypeEntity(Integer typeId, String typeName) {
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
        return "Tb_ProductTypeEntity{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
