package com.niudingfeng.financialplannerlin.mapper;

import com.niudingfeng.financialplannerlin.pojo.SysConf;
import com.niudingfeng.financialplannerlin.pojo.SysConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysConfMapper {
    int countByExample(SysConfExample example);

    int deleteByExample(SysConfExample example);

    int insert(SysConf record);

    int insertSelective(SysConf record);

    List<SysConf> selectByExample(SysConfExample example);

    int updateByExampleSelective(@Param("record") SysConf record, @Param("example") SysConfExample example);

    int updateByExample(@Param("record") SysConf record, @Param("example") SysConfExample example);
}