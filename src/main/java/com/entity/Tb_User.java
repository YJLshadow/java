package com.entity;

import java.util.Date;

public class Tb_User {

    private Integer userId;
    private String tel;
    private String password;
    private String name;
    private Integer gender;
    private Date birth;
    private String userCard;
    private String address;
    private String head;
    private String email;
    private Double assets;
    private Integer staffId;

    public Tb_User() {
    }

    public Tb_User(String tel, String password, String name, Integer gender, Date birth, String userCard, String address, String head, String email, Double assets, Integer staffId) {
        this.tel = tel;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.userCard = userCard;
        this.address = address;
        this.head = head;
        this.email = email;
        this.assets = assets;
        this.staffId = staffId;
    }

    public Tb_User(Integer userId, String tel, String password, String name, Integer gender, Date birth, String userCard, String address, String head, String email, Double assets, Integer staffId) {
        this.userId = userId;
        this.tel = tel;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.userCard = userCard;
        this.address = address;
        this.head = head;
        this.email = email;
        this.assets = assets;
        this.staffId = staffId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getAssets() {
        return assets;
    }

    public void setAssets(Double assets) {
        this.assets = assets;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "Tb_User{" +
                "userId=" + userId +
                ", tel='" + tel + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                ", userCard='" + userCard + '\'' +
                ", address='" + address + '\'' +
                ", head='" + head + '\'' +
                ", email='" + email + '\'' +
                ", assets=" + assets +
                ", staffId=" + staffId +
                '}';
    }
}
