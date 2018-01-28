package com.entity;

public class Position_PowerEntity {

    private Integer positionId;
    private Integer powerId;

    public Position_PowerEntity() {
    }

    public Position_PowerEntity(Integer powerId) {
        this.powerId = powerId;
    }

    public Position_PowerEntity(Integer positionId, Integer powerId) {
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
        return "Position_PowerEntity{" +
                "positionId=" + positionId +
                ", powerId=" + powerId +
                '}';
    }
}
