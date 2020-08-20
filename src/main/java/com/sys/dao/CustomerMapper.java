package com.sys.dao;


import com.sys.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;

public interface CustomerMapper {

    int deleteByPrimaryKey(Integer customerId)throws SQLException;

    int insert(Customer record);

    int insertSelective(Customer record)throws SQLException;

    Customer selectByPrimaryKey(Integer customerId)throws SQLException;

    int updateByPrimaryKeySelective(Customer record)throws SQLException;

    int updateByPrimaryKey(Customer record)throws SQLException;

    String getCustomersAddress(int userid);

    int addCustomersAddress(@Param("addr") String address,@Param("uid")int userid);
}