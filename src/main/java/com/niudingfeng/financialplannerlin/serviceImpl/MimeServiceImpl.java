package com.niudingfeng.financialplannerlin.serviceImpl;

import com.niudingfeng.financialplannerlin.mapper.UsrFeedbackMapper;
import com.niudingfeng.financialplannerlin.pojo.UsrFeedback;
import com.niudingfeng.financialplannerlin.pojo.UsrFeedbackExample;
import com.niudingfeng.financialplannerlin.service.MimeService;
import com.niudingfeng.financialplannerlin.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MimeServiceImpl
 * @Description TODO
 * @Author lin
 * @Date 2018/9/5 14:57
 * @Version 1.0
 **/
@Service
public class MimeServiceImpl implements MimeService{
    @Autowired
    private UsrFeedbackMapper feedbackMapper;
    @Override
    public boolean insertFeedback(String message) {
        String userId = "1";//userId需要通过token获取
        UsrFeedback usrFeedback = new UsrFeedback();
        usrFeedback.setFeedbackId(Util.getUUID());
        usrFeedback.setFeedbackTime(Util.getStringDate());
        usrFeedback.setMessage(message);
        usrFeedback.setUserId(userId);
        int insert = feedbackMapper.insert(usrFeedback);
        if(insert>0){
            return true;
        }
        return false;
    }

    @Override
    public List<UsrFeedback> selectFeedbacks() {
        List<UsrFeedback> list = feedbackMapper.selectByExample(null);
        return list;
    }
}
