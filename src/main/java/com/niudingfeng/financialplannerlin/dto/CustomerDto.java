package com.niudingfeng.financialplannerlin.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName CustomerDto
 * @Description 客户信息
 * @Author lin
 * @Date 2018/9/5 11:21
 * @Version 1.0
 **/
public class CustomerDto implements Serializable{
    private Integer customerId;//客户id
    private String customeName;//客户名字
    private String mobile;//客户电话
    private String birth;//客户生日
    private List<String> productName;//产品名称

    public CustomerDto() {
    }

    public CustomerDto(Integer customerId, String customeName, String mobile, String birth, List<String> productName) {
        this.customerId = customerId;
        this.customeName = customeName;
        this.mobile = mobile;
        this.birth = birth;
        this.productName = productName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomeName() {
        return customeName;
    }

    public void setCustomeName(String customeName) {
        this.customeName = customeName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public List<String> getProductName() {
        return productName;
    }

    public void setProductName(List<String> productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "customerId=" + customerId +
                ", customeName='" + customeName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", birth='" + birth + '\'' +
                ", productName=" + productName +
                '}';
    }
}
