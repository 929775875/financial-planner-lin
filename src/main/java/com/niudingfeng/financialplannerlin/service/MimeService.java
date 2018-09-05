package com.niudingfeng.financialplannerlin.service;

import com.niudingfeng.financialplannerlin.pojo.UsrFeedback;

import java.util.List;

/**
 * @ClassName MimeService
 * @Description TODO
 * @Author lin
 * @Date 2018/9/5 14:49
 * @Version 1.0
 **/
public interface MimeService {
    public boolean insertFeedback(String message);

    List<UsrFeedback> selectFeedbacks();
}
