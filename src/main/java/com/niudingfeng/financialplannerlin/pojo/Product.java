package com.niudingfeng.financialplannerlin.pojo;

import java.math.BigDecimal;

public class Product {
    private String productId;

    private String productName;

    private String presaleDay;

    private String limitId;

    private String expectRate;

    private BigDecimal productSize;

    private BigDecimal startingPoint;

    private BigDecimal startingMoney;

    private Integer yyyCopies;

    private BigDecimal yyyMoney;

    private String description;

    private String updateTime;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getPresaleDay() {
        return presaleDay;
    }

    public void setPresaleDay(String presaleDay) {
        this.presaleDay = presaleDay == null ? null : presaleDay.trim();
    }

    public String getLimitId() {
        return limitId;
    }

    public void setLimitId(String limitId) {
        this.limitId = limitId == null ? null : limitId.trim();
    }

    public String getExpectRate() {
        return expectRate;
    }

    public void setExpectRate(String expectRate) {
        this.expectRate = expectRate == null ? null : expectRate.trim();
    }

    public BigDecimal getProductSize() {
        return productSize;
    }

    public void setProductSize(BigDecimal productSize) {
        this.productSize = productSize;
    }

    public BigDecimal getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(BigDecimal startingPoint) {
        this.startingPoint = startingPoint;
    }

    public BigDecimal getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(BigDecimal startingMoney) {
        this.startingMoney = startingMoney;
    }

    public Integer getYyyCopies() {
        return yyyCopies;
    }

    public void setYyyCopies(Integer yyyCopies) {
        this.yyyCopies = yyyCopies;
    }

    public BigDecimal getYyyMoney() {
        return yyyMoney;
    }

    public void setYyyMoney(BigDecimal yyyMoney) {
        this.yyyMoney = yyyMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}