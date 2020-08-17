package com.sys.controller;

import com.sys.pojo.Shops;
import com.sys.pojo.Turnover;
import com.sys.pojo.Users;
import com.sys.pojo.Wallet;
import com.sys.service.ShopsService;
import com.sys.service.TurnoverService;
import com.sys.service.UsersService;
import com.sys.service.WalletService;
import com.sys.service.impl.ShopsServiceImpl;
import com.sys.service.impl.TurnoverServiceImpl;
import com.sys.service.impl.UsersServiceImpl;
import com.sys.service.impl.WalletServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TurnoverController {
    @Autowired
    TurnoverService turnoverService=new TurnoverServiceImpl();
    @Autowired
    WalletService walletService=new WalletServiceImpl();
    @Autowired
    UsersService usersService=new UsersServiceImpl();
    @Autowired
    ShopsService shopsService=new ShopsServiceImpl();

    @RequestMapping("/addTurnover")
    @ResponseBody
    public boolean insert(String shopname,String username,float goodprice){
        Date date=new Date();
        Users users =new Users();
        List<Shops> lists=new ArrayList<>();
        lists=shopsService.getShops(shopname);
        Shops shops=lists.get(0);
        boolean flag=false;
        try {
            List<Users> list=usersService.getUserByUsersname(username);
            users=list.get(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        flag=walletService.updateMoney(goodprice*(-1),username);
        flag=walletService.updateMoney(goodprice,shops.getUsersName());
        Turnover turnover=new Turnover();
        turnover.setTurnoverMoney(goodprice);
        turnover.setTurnoverTime(Long.toString(date.getTime()));
        turnover.setUsersId(users.getUsersId());
        turnover.setUseUsersId(shops.getUsersId());
        flag=turnoverService.insert(turnover);
        return flag;
    }
}
