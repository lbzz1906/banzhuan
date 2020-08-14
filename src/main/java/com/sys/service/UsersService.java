package com.sys.service;

import com.sys.pojo.Customer;
import com.sys.pojo.Users;

import java.sql.SQLException;
import java.util.List;

public interface UsersService {
    boolean loginCheck(String username,String password)throws SQLException;
    boolean insert(Users users)throws SQLException;
    List<Users> getUserByUsersname(String username)throws SQLException;
    boolean updateByPrimaryKeySelective(Users users)throws SQLException;
}
