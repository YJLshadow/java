package com.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Tb_StaffEntity implements Serializable{

    private Integer staffId;
    private String staffName;
    private Integer gender;
    private String staffCard;
    private String staffAddress;
    private Integer education;
    private String loginPassword;
    private String staffRemark;
    private String headerImage;

    public Tb_StaffEntity() {
    }

    public Tb_StaffEntity(String staffName, Integer gender, String staffCard, String staffAddress, Integer education, String loginPassword, String staffRemark, String headerImage) {
        this.staffName = staffName;
        this.gender = gender;
        this.staffCard = staffCard;
        this.staffAddress = staffAddress;
        this.education = education;
        this.loginPassword = loginPassword;
        this.staffRemark = staffRemark;
        this.headerImage = headerImage;
    }

    public Tb_StaffEntity(Integer staffId, String staffName, Integer gender, String staffCard, String staffAddress, Integer education, String loginPassword, String staffRemark, String headerImage) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.gender = gender;
        this.staffCard = staffCard;
        this.staffAddress = staffAddress;
        this.education = education;
        this.loginPassword = loginPassword;
        this.staffRemark = staffRemark;
        this.headerImage = headerImage;
    }


    @Override
    public String toString() {
        return "Tb_StaffEntity{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", gender=" + gender +
                ", staffCard='" + staffCard + '\'' +
                ", staffAddress='" + staffAddress + '\'' +
                ", education=" + education +
                ", loginPassword='" + loginPassword + '\'' +
                ", staffRemark='" + staffRemark + '\'' +
                ", headerImage='" + headerImage + '\'' +
                '}';
    }
}
