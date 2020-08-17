package com.sys.service;

import com.sys.pojo.Orders;

public interface OrdersService {
    boolean insert(Orders orders);
    Orders getOrdersByTime(String time);
}
