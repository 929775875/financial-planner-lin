package com.niudingfeng.financialplannerlin.api;

import com.niudingfeng.financialplannerlin.dto.Response;
import com.niudingfeng.financialplannerlin.pojo.UsrFeedback;
import com.niudingfeng.financialplannerlin.service.MimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName MimeApi
 * @Description 我的
 * @Author lin
 * @Date 2018/9/5 14:39
 * @Version 1.0
 **/
@RestController
public class MimeApi {
    @Autowired
    private MimeService mimeService;

    /**
     * @deprecated 上传用户反馈信息
     * @param message 用户传来的反馈信息
     * @return
     */
    @RequestMapping(value = "/app/crm/actions/feedback",method = RequestMethod.POST)
    public Response submitFeedback(String message){
        boolean b = mimeService.insertFeedback(message);
        if(b){
            return new Response().success();
        }else{
            return new Response().failure();
        }
    }

    /**
     * @deprecated 返回所有用户反馈信息
     * @return
     */
    @RequestMapping(value = "/app/crm/feedbacks")
    public Response getFeedbacks(){
        List<UsrFeedback> list = mimeService.selectFeedbacks();
        Response response = new Response();
        Response success = response.success(list);
        return success;
    }
}
