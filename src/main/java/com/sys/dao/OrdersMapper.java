package com.sys.dao;

import com.sys.pojo.*;

public interface OrdersMapper {

    int deleteByPrimaryKey(Integer ordersId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer ordersId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    Orders getOrdersByTime(String time);
}