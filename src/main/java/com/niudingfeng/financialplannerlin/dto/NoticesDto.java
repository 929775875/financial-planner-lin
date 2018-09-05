package com.niudingfeng.financialplannerlin.dto;

import java.io.Serializable;

/**
 * @ClassName NoticesDto
 * @Description 公司公告
 * @Author lin
 * @Date 2018/9/5 14:23
 * @Version 1.0
 **/
public class NoticesDto implements Serializable{
    private Integer noticeId;//公告id
    private String title;//公告标题
    private String author;//公告作者
    private String department;//所属部门
    private String time;//发布时间

    public NoticesDto() {
    }

    public NoticesDto(Integer noticeId, String title, String author, String department, String time) {
        this.noticeId = noticeId;
        this.title = title;
        this.author = author;
        this.department = department;
        this.time = time;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "NoticesDto{" +
                "noticeId=" + noticeId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", department='" + department + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
