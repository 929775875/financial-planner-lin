package com.niudingfeng.financialplannerlin.dto;

import java.io.Serializable;

/**
 * @ClassName ProductInfoDto
 * @Description 投资资讯
 * @Author lin
 * @Date 2018/9/5 14:27
 * @Version 1.0
 **/
public class ProductInfoDto implements Serializable{
    private Integer infoId;//资讯id
    private String title;//资讯标题
    private String time;//发布时间
    private String text;//资讯部分内容

    public ProductInfoDto() {
    }

    public ProductInfoDto(Integer infoId, String title, String time, String text) {
        this.infoId = infoId;
        this.title = title;
        this.time = time;
        this.text = text;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ProductInfoDto{" +
                "infoId=" + infoId +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
