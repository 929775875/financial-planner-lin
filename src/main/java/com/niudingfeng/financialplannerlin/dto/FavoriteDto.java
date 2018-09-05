package com.niudingfeng.financialplannerlin.dto;

import java.io.Serializable;

/**
 * @ClassName FavoriteDto
 * @Description 收藏
 * @Author lin
 * @Date 2018/9/5 14:15
 * @Version 1.0
 **/
public class FavoriteDto implements Serializable{
    private Integer productId;//产品id
    private String productName;//产品名称
    private String expectRate;//预期收益率
    private String raisingTime;//募集时间
    private String term;//期限

    public FavoriteDto() {
    }

    public FavoriteDto(Integer productId, String productName, String expectRate, String raisingTime, String term) {
        this.productId = productId;
        this.productName = productName;
        this.expectRate = expectRate;
        this.raisingTime = raisingTime;
        this.term = term;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getExpectRate() {
        return expectRate;
    }

    public void setExpectRate(String expectRate) {
        this.expectRate = expectRate;
    }

    public String getRaisingTime() {
        return raisingTime;
    }

    public void setRaisingTime(String raisingTime) {
        this.raisingTime = raisingTime;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "FavoriteDto{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", expectRate='" + expectRate + '\'' +
                ", raisingTime='" + raisingTime + '\'' +
                ", term='" + term + '\'' +
                '}';
    }
}
