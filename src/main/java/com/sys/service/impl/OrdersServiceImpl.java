package com.sys.service.impl;

import com.sys.dao.OrdersMapper;
import com.sys.pojo.Orders;
import com.sys.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    public boolean insert(Orders orders){
        boolean flag=false;
        int num=ordersMapper.insert(orders);
        if (num > 0) {
            flag=true;
        }
        return flag;
    }

    @Override
    public Orders getOrdersByTime(String time) {
        Orders orders=ordersMapper.getOrdersByTime(time);
        return orders;
    }
}
