package com.entity;

import java.util.Date;

public class Tb_Company {

    private Integer companyId;
    private String companyName;
    private Date companyDate;
    private String companyRemark;

    public Tb_Company() {
    }

    public Tb_Company(String companyName, Date companyDate, String companyRemark) {
        this.companyName = companyName;
        this.companyDate = companyDate;
        this.companyRemark = companyRemark;
    }

    public Tb_Company(Integer companyId, String companyName, Date companyDate, String companyRemark) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyDate = companyDate;
        this.companyRemark = companyRemark;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCompanyDate() {
        return companyDate;
    }

    public void setCompanyDate(Date companyDate) {
        this.companyDate = companyDate;
    }

    public String getCompanyRemark() {
        return companyRemark;
    }

    public void setCompanyRemark(String companyRemark) {
        this.companyRemark = companyRemark;
    }

    @Override
    public String toString() {
        return "Tb_Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyDate=" + companyDate +
                ", companyRemark='" + companyRemark + '\'' +
                '}';
    }
}
