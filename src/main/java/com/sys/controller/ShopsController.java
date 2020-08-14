package com.sys.controller;

import com.sys.pojo.Shops;
import com.sys.service.ShopsService;
import com.sys.service.impl.ShopsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShopsController {
    @Autowired
    ShopsService shopsService=new ShopsServiceImpl();

    @RequestMapping("/addShops")
    @ResponseBody
    public boolean addShops(Shops shops){
        boolean flag=false;
        flag=shopsService.insert(shops);
        return flag;
    }

    @RequestMapping("/updateShops")
    @ResponseBody
    public boolean updateShops(Shops shops){
        boolean flag=false;
        flag=shopsService.updateByPrimaryKeySelective(shops);
        return flag;
    }
}
