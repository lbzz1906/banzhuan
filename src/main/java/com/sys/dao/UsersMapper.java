package com.sys.dao;

import com.sys.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface UsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int deleteByPrimaryKey(Integer usersId)throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int insert(Users record)throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int insertSelective(Users record)throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    Users selectByPrimaryKey(Integer usersId)throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int updateByPrimaryKeySelective(Users record)throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int updateByPrimaryKey(Users record)throws SQLException;

    int loginCheck(@Param("inname")String username,@Param("inword")String password)throws SQLException;
    List<Users> getUserByUsersname(String username)throws SQLException;
}