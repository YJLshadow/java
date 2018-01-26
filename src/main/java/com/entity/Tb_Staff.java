package com.entity;

public class Tb_Staff {

    private Integer staffId;
    private String staffName;
    private Integer gender;
    private String staffCard;
    private String staffAddress;
    private Integer education;
    private String loginPassword;
    private String staffRemark;
    private String headerImage;

    public Tb_Staff() {
    }

    public Tb_Staff(String staffName, Integer gender, String staffCard, String staffAddress, Integer education, String loginPassword, String staffRemark, String headerImage) {
        this.staffName = staffName;
        this.gender = gender;
        this.staffCard = staffCard;
        this.staffAddress = staffAddress;
        this.education = education;
        this.loginPassword = loginPassword;
        this.staffRemark = staffRemark;
        this.headerImage = headerImage;
    }

    public Tb_Staff(Integer staffId, String staffName, Integer gender, String staffCard, String staffAddress, Integer education, String loginPassword, String staffRemark, String headerImage) {
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

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getStaffCard() {
        return staffCard;
    }

    public void setStaffCard(String staffCard) {
        this.staffCard = staffCard;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getStaffRemark() {
        return staffRemark;
    }

    public void setStaffRemark(String staffRemark) {
        this.staffRemark = staffRemark;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    @Override
    public String toString() {
        return "Tb_Staff{" +
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
