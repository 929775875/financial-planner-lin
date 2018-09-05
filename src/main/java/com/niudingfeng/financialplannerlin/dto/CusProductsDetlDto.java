package com.niudingfeng.financialplannerlin.dto;

import com.niudingfeng.financialplannerlin.pojo.Product;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName CusProductsDetlDto
 * @Description 客户详情信息
 * @Author lin
 * @Date 2018/9/5 11:29
 * @Version 1.0
 **/
public class CusProductsDetlDto implements Serializable{
    private Integer customerId;//客户id
    private String customerName;//客户名字
    private String mobile;//客户电话
    List<ProductDto> undue;//未过期产品
    List<ProductDto> pastdue;//过期产品

    public CusProductsDetlDto() {
    }

    public CusProductsDetlDto(Integer customerId, String customerName, String mobile, List<ProductDto> undue, List<ProductDto> pastdue) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobile = mobile;
        this.undue = undue;
        this.pastdue = pastdue;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<ProductDto> getUndue() {
        return undue;
    }

    public void setUndue(List<ProductDto> undue) {
        this.undue = undue;
    }

    public List<ProductDto> getPastdue() {
        return pastdue;
    }

    public void setPastdue(List<ProductDto> pastdue) {
        this.pastdue = pastdue;
    }

    @Override
    public String toString() {
        return "CusProductsDetlDto{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", undue=" + undue +
                ", pastdue=" + pastdue +
                '}';
    }
}
