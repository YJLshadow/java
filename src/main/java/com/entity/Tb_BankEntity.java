package com.entity;

import java.util.Date;

public class Tb_BankEntity {

    private Integer bankId;
    private String bankName;
    private String bankRemark;
    private Date bankDate;

    public Tb_BankEntity() {
    }

    public Tb_BankEntity(String bankName, String bankRemark, Date bankDate) {
        this.bankName = bankName;
        this.bankRemark = bankRemark;
        this.bankDate = bankDate;
    }

    public Tb_BankEntity(Integer bankId, String bankName, String bankRemark, Date bankDate) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.bankRemark = bankRemark;
        this.bankDate = bankDate;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankRemark() {
        return bankRemark;
    }

    public void setBankRemark(String bankRemark) {
        this.bankRemark = bankRemark;
    }

    public Date getBankDate() {
        return bankDate;
    }

    public void setBankDate(Date bankDate) {
        this.bankDate = bankDate;
    }

    @Override
    public String toString() {
        return "Tb_BankEntity{" +
                "bankId=" + bankId +
                ", bankName='" + bankName + '\'' +
                ", bankRemark='" + bankRemark + '\'' +
                ", bankDate=" + bankDate +
                '}';
    }
}
