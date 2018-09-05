package com.niudingfeng.financialplannerlin.mapper;

import com.niudingfeng.financialplannerlin.pojo.BizSale;
import com.niudingfeng.financialplannerlin.pojo.BizSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizSaleMapper {
    int countByExample(BizSaleExample example);

    int deleteByExample(BizSaleExample example);

    int deleteByPrimaryKey(String saleId);

    int insert(BizSale record);

    int insertSelective(BizSale record);

    List<BizSale> selectByExample(BizSaleExample example);

    BizSale selectByPrimaryKey(String saleId);

    int updateByExampleSelective(@Param("record") BizSale record, @Param("example") BizSaleExample example);

    int updateByExample(@Param("record") BizSale record, @Param("example") BizSaleExample example);

    int updateByPrimaryKeySelective(BizSale record);

    int updateByPrimaryKey(BizSale record);
}