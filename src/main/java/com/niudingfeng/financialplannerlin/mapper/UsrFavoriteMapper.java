package com.niudingfeng.financialplannerlin.mapper;

import com.niudingfeng.financialplannerlin.pojo.UsrFavorite;
import com.niudingfeng.financialplannerlin.pojo.UsrFavoriteExample;
import com.niudingfeng.financialplannerlin.pojo.UsrFavoriteKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrFavoriteMapper {
    int countByExample(UsrFavoriteExample example);

    int deleteByExample(UsrFavoriteExample example);

    int deleteByPrimaryKey(UsrFavoriteKey key);

    int insert(UsrFavorite record);

    int insertSelective(UsrFavorite record);

    List<UsrFavorite> selectByExample(UsrFavoriteExample example);

    UsrFavorite selectByPrimaryKey(UsrFavoriteKey key);

    int updateByExampleSelective(@Param("record") UsrFavorite record, @Param("example") UsrFavoriteExample example);

    int updateByExample(@Param("record") UsrFavorite record, @Param("example") UsrFavoriteExample example);

    int updateByPrimaryKeySelective(UsrFavorite record);

    int updateByPrimaryKey(UsrFavorite record);
}