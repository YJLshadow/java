package com.entity;

import java.util.Date;

public class Tb_ComplaintsEntity {

    private Integer complaintsId;
    private Integer userId;
    private String complaintsTitle;
    private String complaintsBody;
    private Date complaints;

    public Tb_ComplaintsEntity() {
    }

    public Tb_ComplaintsEntity(Integer userId, String complaintsTitle, String complaintsBody, Date complaints) {
        this.userId = userId;
        this.complaintsTitle = complaintsTitle;
        this.complaintsBody = complaintsBody;
        this.complaints = complaints;
    }

    public Tb_ComplaintsEntity(Integer complaintsId, Integer userId, String complaintsTitle, String complaintsBody, Date complaints) {
        this.complaintsId = complaintsId;
        this.userId = userId;
        this.complaintsTitle = complaintsTitle;
        this.complaintsBody = complaintsBody;
        this.complaints = complaints;
    }

    public Integer getComplaintsId() {
        return complaintsId;
    }

    public void setComplaintsId(Integer complaintsId) {
        this.complaintsId = complaintsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getComplaintsTitle() {
        return complaintsTitle;
    }

    public void setComplaintsTitle(String complaintsTitle) {
        this.complaintsTitle = complaintsTitle;
    }

    public String getComplaintsBody() {
        return complaintsBody;
    }

    public void setComplaintsBody(String complaintsBody) {
        this.complaintsBody = complaintsBody;
    }

    public Date getComplaints() {
        return complaints;
    }

    public void setComplaints(Date complaints) {
        this.complaints = complaints;
    }

    @Override
    public String toString() {
        return "Tb_ComplaintsEntity{" +
                "complaintsId=" + complaintsId +
                ", userId=" + userId +
                ", complaintsTitle='" + complaintsTitle + '\'' +
                ", complaintsBody='" + complaintsBody + '\'' +
                ", complaints=" + complaints +
                '}';
    }
}
