package com.sys.controller;

import com.sys.pojo.Orders;
import com.sys.service.OrdersService;
import com.sys.service.impl.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrdersController {
    @Autowired
    OrdersService ordersService=new OrdersServiceImpl();

    @RequestMapping("/addOrders")
    @ResponseBody
    public boolean insert(Orders orders){
       boolean flag=false;
       flag=ordersService.insert(orders);
       return flag;
    }
}
