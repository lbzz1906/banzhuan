package com.sys.dao;

import com.sys.pojo.*;
import org.apache.ibatis.annotations.Param;

public interface ManagerMapper {

    int deleteByPrimaryKey(Integer managerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Integer managerId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);

    int managerCheck(@Param("usn")String usersname,@Param("psw") String password);
}