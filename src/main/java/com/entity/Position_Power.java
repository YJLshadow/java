package com.entity;

public class Position_Power {

    private Integer positionId;
    private Integer powerId;

    public Position_Power() {
    }

    public Position_Power(Integer powerId) {
        this.powerId = powerId;
    }

    public Position_Power(Integer positionId, Integer powerId) {
        this.positionId = positionId;
        this.powerId = powerId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    @Override
    public String toString() {
        return "Position_Power{" +
                "positionId=" + positionId +
                ", powerId=" + powerId +
                '}';
    }
}
