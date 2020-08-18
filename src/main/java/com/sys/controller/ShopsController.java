package com.sys.controller;

import com.sys.pojo.Shops;
import com.sys.pojo.Users;
import com.sys.service.ShopsService;
import com.sys.service.UsersService;
import com.sys.service.impl.ShopsServiceImpl;
import com.sys.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;

@Controller
public class ShopsController {
    @Autowired
    ShopsService shopsService=new ShopsServiceImpl();
    @Autowired
    UsersService usersService=new UsersServiceImpl();

    @RequestMapping("/addShops")
    @ResponseBody
    public boolean addShops(Shops shops){
        int id=0;
        try {
            Users users=usersService.getUserByUsersname(shops.getUsersName()).get(0);
            id=users.getUsersId();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        boolean flag=false;
        shops.setUsersId(id);
        flag=shopsService.insert(shops);
        return flag;
    }

    @RequestMapping("/updateShops")
    @ResponseBody
    public boolean updateShops(Shops shops){
        boolean flag=false;
        Shops shops1=shopsService.getShops(shops.getUsersName()).get(0);
        if(shops.getShopsName().equals(shops1.getShopsName())){
            shops.setShopsName(null);
        }
        int id=shopsService.getShops(shops.getUsersName()).get(0).getShopsId();
        shops.setShopsId(shops1.getShopsId());
        flag=shopsService.updateByPrimaryKeySelective(shops);
        return flag;
    }

    @RequestMapping("/getShops")
    @ResponseBody
    public Shops getShops(String username){
        List<Shops> list=shopsService.getShops(username);
        if(list.size()==0){
            return new Shops();
        }else {
         return list.get(0);
        }
    }
}
