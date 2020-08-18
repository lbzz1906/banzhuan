package com.sys.controller;

import com.sys.service.ManagerService;
import com.sys.service.impl.ManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ManagerController {
    @Autowired
    ManagerService managerService=new ManagerServiceImpl();
    @RequestMapping("/managerCheck")
    @ResponseBody
    public boolean managerCheck(String username,String password){
        boolean flag=false;
        flag=managerService.managerCheck(username,password);
        return flag;
    }
}
