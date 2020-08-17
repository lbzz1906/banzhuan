package com.sys.controller;

import com.sys.pojo.*;
import com.sys.service.*;
import com.sys.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class OrdersController {
    @Autowired
    OrdersService ordersService=new OrdersServiceImpl();
    @Autowired
    TurnoverService turnoverService=new TurnoverServiceImpl();
    @Autowired
    WalletService walletService=new WalletServiceImpl();
    @Autowired
    UsersService usersService=new UsersServiceImpl();
    @Autowired
    ShopsService shopsService=new ShopsServiceImpl();
    @Autowired
    CustomerService customerService=new CustomerServiceImpl();

    String ordertime=new String();

    @RequestMapping("/addOrderAndTurnover")
    @ResponseBody
    public boolean insert(Orders orders){
       boolean flag=false;
        Date date=new Date(System.currentTimeMillis());
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=sim.format(date.getTime());
        Users users =new Users();
        List<Shops> lists=new ArrayList<>();
        lists=shopsService.getShops(orders.getShopsName());
        Shops shops=lists.get(0);
        try {
            List<Users> list=usersService.getUserByUsersname(orders.getOrdersConsigneeName());
            users=list.get(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String customerAddress=customerService.getCustomerAddress(users.getUsersId());
        //修改双方钱包余额
        float money=orders.getOrdersTotalMoney();
        String customername=orders.getOrdersConsigneeName();
        String salername=shops.getUsersName();
        boolean flag1=walletService.updateMoney(-1*money,customername);
        boolean flag2=walletService.updateMoney(money,salername);
        //添加一条资金往来信息
        Turnover turnover=new Turnover();
        turnover.setTurnoverMoney(orders.getOrdersTotalMoney());
        turnover.setTurnoverTime(time);
        turnover.setUsersId(users.getUsersId());
        turnover.setUseUsersId(shops.getUsersId());
        boolean flag3=turnoverService.insert(turnover);
        //添加一条订单
        orders.setOrdersEntryTime(time);
        orders.setOrdersConsigneePhone(users.getUsersPhone());
        orders.setOrdersConsigneeAddress(customerAddress);
       flag=ordersService.insert(orders);
       ordertime=time;
       return flag&&flag1&&flag2&&flag3;
    }

    @RequestMapping("/getOrdersByOrdersId")
    @ResponseBody
    public Orders getOrdersByOrdersId(){
        Orders orders=ordersService.getOrdersByTime(ordertime);
        return orders;
    }
}
