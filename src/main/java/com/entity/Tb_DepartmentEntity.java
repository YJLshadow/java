package com.entity;

public class Tb_DepartmentEntity {

    private Integer departmentId;
    private String departmentName;
    private String departmentRemark;

    public Tb_DepartmentEntity() {
    }

    public Tb_DepartmentEntity(String departmentName, String departmentRemark) {
        this.departmentName = departmentName;
        this.departmentRemark = departmentRemark;
    }

    public Tb_DepartmentEntity(Integer departmentId, String departmentName, String departmentRemark) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentRemark = departmentRemark;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentRemark() {
        return departmentRemark;
    }

    public void setDepartmentRemark(String departmentRemark) {
        this.departmentRemark = departmentRemark;
    }

    @Override
    public String toString() {
        return "Tb_DepartmentEntity{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentRemark='" + departmentRemark + '\'' +
                '}';
    }
}
