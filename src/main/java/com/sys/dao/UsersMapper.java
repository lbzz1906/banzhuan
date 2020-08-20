package com.sys.dao;

import com.sys.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface UsersMapper {

    int deleteByPrimaryKey(Integer usersId)throws SQLException;

    int insert(Users record)throws SQLException;

    int insertSelective(Users record)throws SQLException;

    Users selectByPrimaryKey(Integer usersId)throws SQLException;

    int updateByPrimaryKeySelective(Users record)throws SQLException;

    int updateByPrimaryKey(Users record)throws SQLException;

    int loginCheck(@Param("inname")String username,@Param("inword")String password)throws SQLException;

    List<Users> getUserByUsersname(String username)throws SQLException;
}