package com.niudingfeng.financialplannerlin.mapper;

import com.niudingfeng.financialplannerlin.pojo.UsrFeedback;
import com.niudingfeng.financialplannerlin.pojo.UsrFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrFeedbackMapper {
    int countByExample(UsrFeedbackExample example);

    int deleteByExample(UsrFeedbackExample example);

    int deleteByPrimaryKey(String feedbackId);

    int insert(UsrFeedback record);

    int insertSelective(UsrFeedback record);

    List<UsrFeedback> selectByExample(UsrFeedbackExample example);

    UsrFeedback selectByPrimaryKey(String feedbackId);

    int updateByExampleSelective(@Param("record") UsrFeedback record, @Param("example") UsrFeedbackExample example);

    int updateByExample(@Param("record") UsrFeedback record, @Param("example") UsrFeedbackExample example);

    int updateByPrimaryKeySelective(UsrFeedback record);

    int updateByPrimaryKey(UsrFeedback record);
}