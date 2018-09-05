package com.niudingfeng.financialplannerlin.mapper;

import com.niudingfeng.financialplannerlin.pojo.ProFile;
import com.niudingfeng.financialplannerlin.pojo.ProFileExample;
import com.niudingfeng.financialplannerlin.pojo.ProFileKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProFileMapper {
    int countByExample(ProFileExample example);

    int deleteByExample(ProFileExample example);

    int deleteByPrimaryKey(ProFileKey key);

    int insert(ProFile record);

    int insertSelective(ProFile record);

    List<ProFile> selectByExample(ProFileExample example);

    ProFile selectByPrimaryKey(ProFileKey key);

    int updateByExampleSelective(@Param("record") ProFile record, @Param("example") ProFileExample example);

    int updateByExample(@Param("record") ProFile record, @Param("example") ProFileExample example);

    int updateByPrimaryKeySelective(ProFile record);

    int updateByPrimaryKey(ProFile record);
}