package com.niudingfeng.financialplannerlin.mapper;

import com.niudingfeng.financialplannerlin.pojo.UsrLogin;
import com.niudingfeng.financialplannerlin.pojo.UsrLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrLoginMapper {
    int countByExample(UsrLoginExample example);

    int deleteByExample(UsrLoginExample example);

    int deleteByPrimaryKey(String loginId);

    int insert(UsrLogin record);

    int insertSelective(UsrLogin record);

    List<UsrLogin> selectByExample(UsrLoginExample example);

    UsrLogin selectByPrimaryKey(String loginId);

    int updateByExampleSelective(@Param("record") UsrLogin record, @Param("example") UsrLoginExample example);

    int updateByExample(@Param("record") UsrLogin record, @Param("example") UsrLoginExample example);

    int updateByPrimaryKeySelective(UsrLogin record);

    int updateByPrimaryKey(UsrLogin record);
}