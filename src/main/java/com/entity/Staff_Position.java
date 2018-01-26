package com.entity;

public class Staff_Position {

    private Integer staffId;
    private Integer positionId;

    public Staff_Position() {
    }

    public Staff_Position(Integer positionId) {
        this.positionId = positionId;
    }

    public Staff_Position(Integer staffId, Integer positionId) {
        this.staffId = staffId;
        this.positionId = positionId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    @Override
    public String toString() {
        return "Staff_Position{" +
                "staffId=" + staffId +
                ", positionId=" + positionId +
                '}';
    }
}
