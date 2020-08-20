package com.sys.service;

import com.sys.pojo.Shops;

import java.util.List;

public interface ShopsService {
    boolean insert(Shops shops);

    List<Shops> getShops(String username);

    List<Shops> getShopsByShopsname(String shopname);

    boolean updateByPrimaryKeySelective(Shops shops);
}
