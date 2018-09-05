package com.niudingfeng.financialplannerlin.pojo;

import java.math.BigDecimal;

public class BizAppoin {
    private String appoinId;

    private String productId;

    private String customerMobile;

    private BigDecimal appoinAmo;

    private String userId;

    private String userNumber;

    private String updateTime;

    public String getAppoinId() {
        return appoinId;
    }

    public void setAppoinId(String appoinId) {
        this.appoinId = appoinId == null ? null : appoinId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile == null ? null : customerMobile.trim();
    }

    public BigDecimal getAppoinAmo() {
        return appoinAmo;
    }

    public void setAppoinAmo(BigDecimal appoinAmo) {
        this.appoinAmo = appoinAmo;
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}