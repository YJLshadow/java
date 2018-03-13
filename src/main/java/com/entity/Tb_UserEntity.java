package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Tb_UserEntity implements Serializable {

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

    public Tb_UserEntity() {
    }

    public Tb_UserEntity(String tel, String password, String name, Integer gender, Date birth, String userCard, String address, String head, String email, Double assets, Integer staffId) {
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

    public Tb_UserEntity(Integer userId, String tel, String password, String name, Integer gender, Date birth, String userCard, String address, String head, String email, Double assets, Integer staffId) {
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


    @Override
    public String toString() {
        return "Tb_UserEntity{" +
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
