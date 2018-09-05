package com.niudingfeng.financialplannerlin.dto;

import java.io.Serializable;

/**
 * @ClassName InvestmentReportDto
 * @Description 投资报告
 * @Author lin
 * @Date 2018/9/5 14:33
 * @Version 1.0
 **/
public class InvestmentReportDto implements Serializable{
    private Integer reportId;//报告id
    private String title;//报告标题
    private String time;//发布时间
    private String text;//发布部分内容

    public InvestmentReportDto() {
    }

    public InvestmentReportDto(Integer reportId, String title, String time, String text) {
        this.reportId = reportId;
        this.title = title;
        this.time = time;
        this.text = text;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
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
        return "InvestmentReportDto{" +
                "reportId=" + reportId +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
