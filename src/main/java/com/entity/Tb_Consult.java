package com.entity;

import java.util.Date;

public class Tb_Consult {

    private Integer consultId;
    private Integer userId;
    private String consultTitle;
    private String consultBody;
    private Date consultData;

    public Tb_Consult() {
    }

    public Tb_Consult(Integer userId, String consultTitle, String consultBody, Date consultData) {
        this.userId = userId;
        this.consultTitle = consultTitle;
        this.consultBody = consultBody;
        this.consultData = consultData;
    }

    public Tb_Consult(Integer consultId, Integer userId, String consultTitle, String consultBody, Date consultData) {
        this.consultId = consultId;
        this.userId = userId;
        this.consultTitle = consultTitle;
        this.consultBody = consultBody;
        this.consultData = consultData;
    }

    public Integer getConsultId() {
        return consultId;
    }

    public void setConsultId(Integer consultId) {
        this.consultId = consultId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConsultTitle() {
        return consultTitle;
    }

    public void setConsultTitle(String consultTitle) {
        this.consultTitle = consultTitle;
    }

    public String getConsultBody() {
        return consultBody;
    }

    public void setConsultBody(String consultBody) {
        this.consultBody = consultBody;
    }

    public Date getConsultData() {
        return consultData;
    }

    public void setConsultData(Date consultData) {
        this.consultData = consultData;
    }

    @Override
    public String toString() {
        return "Tb_Consult{" +
                "consultId=" + consultId +
                ", userId=" + userId +
                ", consultTitle='" + consultTitle + '\'' +
                ", consultBody='" + consultBody + '\'' +
                ", consultData=" + consultData +
                '}';
    }
}
