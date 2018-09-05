package com.niudingfeng.financialplannerlin.mapper;

import com.niudingfeng.financialplannerlin.pojo.BizCustomer;
import com.niudingfeng.financialplannerlin.pojo.BizCustomerExample;
import com.niudingfeng.financialplannerlin.pojo.BizCustomerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizCustomerMapper {
    int countByExample(BizCustomerExample example);

    int deleteByExample(BizCustomerExample example);

    int deleteByPrimaryKey(BizCustomerKey key);

    int insert(BizCustomer record);

    int insertSelective(BizCustomer record);

    List<BizCustomer> selectByExample(BizCustomerExample example);

    BizCustomer selectByPrimaryKey(BizCustomerKey key);

    int updateByExampleSelective(@Param("record") BizCustomer record, @Param("example") BizCustomerExample example);

    int updateByExample(@Param("record") BizCustomer record, @Param("example") BizCustomerExample example);

    int updateByPrimaryKeySelective(BizCustomer record);

    int updateByPrimaryKey(BizCustomer record);
}