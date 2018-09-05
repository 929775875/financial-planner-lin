package com.niudingfeng.financialplannerlin.mapper;

import com.niudingfeng.financialplannerlin.pojo.BizAppoin;
import com.niudingfeng.financialplannerlin.pojo.BizAppoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizAppoinMapper {
    int countByExample(BizAppoinExample example);

    int deleteByExample(BizAppoinExample example);

    int deleteByPrimaryKey(String appoinId);

    int insert(BizAppoin record);

    int insertSelective(BizAppoin record);

    List<BizAppoin> selectByExample(BizAppoinExample example);

    BizAppoin selectByPrimaryKey(String appoinId);

    int updateByExampleSelective(@Param("record") BizAppoin record, @Param("example") BizAppoinExample example);

    int updateByExample(@Param("record") BizAppoin record, @Param("example") BizAppoinExample example);

    int updateByPrimaryKeySelective(BizAppoin record);

    int updateByPrimaryKey(BizAppoin record);
}