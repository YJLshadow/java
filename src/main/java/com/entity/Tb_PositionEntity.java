package com.entity;

public class Tb_PositionEntity {

    private Integer positionId;
    private String positionName;
    private Integer departmentId;
    private String departmentRemark;

    public Tb_PositionEntity() {
    }

    public Tb_PositionEntity(String positionName, Integer departmentId, String departmentRemark) {
        this.positionName = positionName;
        this.departmentId = departmentId;
        this.departmentRemark = departmentRemark;
    }

    public Tb_PositionEntity(Integer positionId, String positionName, Integer departmentId, String departmentRemark) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.departmentId = departmentId;
        this.departmentRemark = departmentRemark;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentRemark() {
        return departmentRemark;
    }

    public void setDepartmentRemark(String departmentRemark) {
        this.departmentRemark = departmentRemark;
    }

    @Override
    public String toString() {
        return "Tb_PositionEntity{" +
                "positionId=" + positionId +
                ", positionName='" + positionName + '\'' +
                ", departmentId=" + departmentId +
                ", departmentRemark='" + departmentRemark + '\'' +
                '}';
    }
}
