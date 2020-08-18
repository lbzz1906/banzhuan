package com.sys.service;

import org.apache.ibatis.annotations.Param;

public interface ManagerService {
    boolean managerCheck(String usersname,String password);
}
