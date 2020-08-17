package com.sys.service.impl;

import com.sys.dao.UsersMapper;
import com.sys.pojo.Users;
import com.sys.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private  UsersMapper usersMapper;

  @Override
    public boolean loginCheck(String username,String password)throws SQLException {
        boolean flag=false;
        int num= usersMapper.loginCheck(username,password);
        if(num!=0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean insert(Users users)throws SQLException{
        boolean flag=false;
        int num=usersMapper.insert(users);

        if(num!=0){
            flag=true;
        }
        return flag;
    }

    @Override
    public List<Users> getUserByUsersname(String username)throws SQLException{
        List<Users> list = usersMapper.getUserByUsersname(username);
      return list;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Users users) {
        boolean flag=false;
        int num= 0;
        try {
            num = usersMapper.updateByPrimaryKeySelective(users);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(num>0){
            flag=true;
        }
        return flag;
    }


}
