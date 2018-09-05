package com.niudingfeng.financialplannerlin.pojo;

public class UsrFavorite extends UsrFavoriteKey {
    private String collectTime;

    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime == null ? null : collectTime.trim();
    }
}