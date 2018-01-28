package com.entity;

public class Tb_BankCardEntity {

    private Integer cardId;
    private Integer bankCardId;
    private Integer userId;
    private Integer bankId;
    private String bankCard;

    public Tb_BankCardEntity() {
    }

    public Tb_BankCardEntity(Integer bankCardId, Integer userId, Integer bankId, String bankCard) {
        this.bankCardId = bankCardId;
        this.userId = userId;
        this.bankId = bankId;
        this.bankCard = bankCard;
    }

    public Tb_BankCardEntity(Integer cardId, Integer bankCardId, Integer userId, Integer bankId, String bankCard) {
        this.cardId = cardId;
        this.bankCardId = bankCardId;
        this.userId = userId;
        this.bankId = bankId;
        this.bankCard = bankCard;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Integer bankCardId) {
        this.bankCardId = bankCardId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public String toString() {
        return "Tb_BankCardEntity{" +
                "cardId=" + cardId +
                ", bankCardId=" + bankCardId +
                ", userId=" + userId +
                ", bankId=" + bankId +
                ", bankCard='" + bankCard + '\'' +
                '}';
    }
}
