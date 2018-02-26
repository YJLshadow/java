package com.entity;

import java.util.Date;

public class Tb_UserMessageEntity {

    private Integer messageId;
    private Integer userId;
    private String messageTitle;
    private String messageBody;
    private Date messageData;
    private Integer messageType;

    public Tb_UserMessageEntity() {
    }

    public Tb_UserMessageEntity(Integer userId, String messageTitle, String messageBody, Date messageData, Integer messageType) {
        this.userId = userId;
        this.messageTitle = messageTitle;
        this.messageBody = messageBody;
        this.messageData = messageData;
        this.messageType = messageType;
    }

    public Tb_UserMessageEntity(Integer messageId, Integer userId, String messageTitle, String messageBody, Date messageData, Integer messageType) {
        this.messageId = messageId;
        this.userId = userId;
        this.messageTitle = messageTitle;
        this.messageBody = messageBody;
        this.messageData = messageData;
        this.messageType = messageType;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public Date getMessageData() {
        return messageData;
    }

    public void setMessageData(Date messageData) {
        this.messageData = messageData;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    @Override
    public String toString() {
        return "Tb_UserMessageEntity{" +
                "messageId=" + messageId +
                ", userId=" + userId +
                ", messageTitle='" + messageTitle + '\'' +
                ", messageBody='" + messageBody + '\'' +
                ", messageData=" + messageData +
                ", messageType=" + messageType +
                '}';
    }
}
