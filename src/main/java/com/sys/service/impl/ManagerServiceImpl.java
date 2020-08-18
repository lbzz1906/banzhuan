package com.sys.service.impl;

import com.sys.dao.ManagerMapper;
import com.sys.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;
    @Override
    public boolean managerCheck(String usersname, String password) {
        boolean flag=false;
        int num=managerMapper.managerCheck(usersname,password);
        if(num==1){
            flag=true;
        }
        return flag;
    }
}
