package com.sys.dao;

import com.sys.pojo.*;

public interface TurnoverMapper {

    int deleteByPrimaryKey(Integer turnoverId);

    int insert(Turnover record);

    int insertSelective(Turnover record);

    Turnover selectByPrimaryKey(Integer turnoverId);

    int updateByPrimaryKeySelective(Turnover record);

    int updateByPrimaryKey(Turnover record);
}