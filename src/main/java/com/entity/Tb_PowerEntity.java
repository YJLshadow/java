package com.entity;

public class Tb_PowerEntity {

    private Integer powerId;
    private String powerName;
    private Integer pId;
    private String action;
    private String icon;
    private String closeIcon;
    private Integer powerType;

    public Tb_PowerEntity() {
    }

    public Tb_PowerEntity(String powerName, Integer pId, String action, String icon, String closeIcon, Integer powerType) {
        this.powerName = powerName;
        this.pId = pId;
        this.action = action;
        this.icon = icon;
        this.closeIcon = closeIcon;
        this.powerType = powerType;
    }

    public Tb_PowerEntity(Integer powerId, String powerName, Integer pId, String action, String icon, String closeIcon, Integer powerType) {
        this.powerId = powerId;
        this.powerName = powerName;
        this.pId = pId;
        this.action = action;
        this.icon = icon;
        this.closeIcon = closeIcon;
        this.powerType = powerType;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCloseIcon() {
        return closeIcon;
    }

    public void setCloseIcon(String closeIcon) {
        this.closeIcon = closeIcon;
    }

    public Integer getPowerType() {
        return powerType;
    }

    public void setPowerType(Integer powerType) {
        this.powerType = powerType;
    }

    @Override
    public String toString() {
        return "Tb_PowerEntity{" +
                "powerId=" + powerId +
                ", powerName='" + powerName + '\'' +
                ", pId=" + pId +
                ", action='" + action + '\'' +
                ", icon='" + icon + '\'' +
                ", closeIcon='" + closeIcon + '\'' +
                ", powerType=" + powerType +
                '}';
    }
}
