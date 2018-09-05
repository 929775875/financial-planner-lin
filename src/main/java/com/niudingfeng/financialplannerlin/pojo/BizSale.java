package com.niudingfeng.financialplannerlin.pojo;

import java.math.BigDecimal;

public class BizSale {
    private String saleId;

    private String customerId;

    private String productId;

    private String limitId;

    private BigDecimal contractAmo;

    private String contractNo;

    private BigDecimal jkMoney;

    private String payType;

    private String payDate;

    private String payingBank;

    private String payingAcount;

    private String userId;

    private String userNumber;

    private String submitFlag;

    private String updateTime;

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId == null ? null : saleId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getLimitId() {
        return limitId;
    }

    public void setLimitId(String limitId) {
        this.limitId = limitId == null ? null : limitId.trim();
    }

    public BigDecimal getContractAmo() {
        return contractAmo;
    }

    public void setContractAmo(BigDecimal contractAmo) {
        this.contractAmo = contractAmo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public BigDecimal getJkMoney() {
        return jkMoney;
    }

    public void setJkMoney(BigDecimal jkMoney) {
        this.jkMoney = jkMoney;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate == null ? null : payDate.trim();
    }

    public String getPayingBank() {
        return payingBank;
    }

    public void setPayingBank(String payingBank) {
        this.payingBank = payingBank == null ? null : payingBank.trim();
    }

    public String getPayingAcount() {
        return payingAcount;
    }

    public void setPayingAcount(String payingAcount) {
        this.payingAcount = payingAcount == null ? null : payingAcount.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public String getSubmitFlag() {
        return submitFlag;
    }

    public void setSubmitFlag(String submitFlag) {
        this.submitFlag = submitFlag == null ? null : submitFlag.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}