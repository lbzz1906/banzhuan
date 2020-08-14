package com.sys.service;

import com.sys.pojo.Shops;

public interface ShopsService {
    boolean insert(Shops shops);
    boolean updateByPrimaryKeySelective(Shops shops);
}
