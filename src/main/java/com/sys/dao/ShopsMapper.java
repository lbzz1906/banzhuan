package com.sys.dao;

import com.sys.pojo.*;

import java.util.List;

public interface ShopsMapper {

    int deleteByPrimaryKey(Integer shopsId);

    int insert(Shops record);

    int insertSelective(Shops record);

    Shops selectByPrimaryKey(Integer shopsId);

    int updateByPrimaryKeySelective(Shops record);

    int updateByPrimaryKey(Shops record);

    List<Shops> getShopByUsersname(String username);

    List<Shops> getShopByShopsname(String shopname);
}