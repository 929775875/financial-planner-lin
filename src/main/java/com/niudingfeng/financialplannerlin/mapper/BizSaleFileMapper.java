package com.niudingfeng.financialplannerlin.mapper;

import com.niudingfeng.financialplannerlin.pojo.BizSaleFile;
import com.niudingfeng.financialplannerlin.pojo.BizSaleFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizSaleFileMapper {
    int countByExample(BizSaleFileExample example);

    int deleteByExample(BizSaleFileExample example);

    int deleteByPrimaryKey(String fileId);

    int insert(BizSaleFile record);

    int insertSelective(BizSaleFile record);

    List<BizSaleFile> selectByExample(BizSaleFileExample example);

    BizSaleFile selectByPrimaryKey(String fileId);

    int updateByExampleSelective(@Param("record") BizSaleFile record, @Param("example") BizSaleFileExample example);

    int updateByExample(@Param("record") BizSaleFile record, @Param("example") BizSaleFileExample example);

    int updateByPrimaryKeySelective(BizSaleFile record);

    int updateByPrimaryKey(BizSaleFile record);
}