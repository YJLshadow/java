package com.entity;

import java.util.Date;

public class Tb_Audit {

    private Integer auditId;
    private Integer staffId;
    private Integer orderID;
    private String auditopinion;
    private Date auditDate;

    public Tb_Audit() {
    }

    public Tb_Audit(Integer staffId, Integer orderID, String auditopinion, Date auditDate) {
        this.staffId = staffId;
        this.orderID = orderID;
        this.auditopinion = auditopinion;
        this.auditDate = auditDate;
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getAuditopinion() {
        return auditopinion;
    }

    public void setAuditopinion(String auditopinion) {
        this.auditopinion = auditopinion;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    @Override
    public String toString() {
        return "Tb_Audit{" +
                "auditId=" + auditId +
                ", staffId=" + staffId +
                ", orderID=" + orderID +
                ", auditopinion='" + auditopinion + '\'' +
                ", auditDate=" + auditDate +
                '}';
    }
}
