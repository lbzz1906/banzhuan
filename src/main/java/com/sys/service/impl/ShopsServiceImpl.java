package com.sys.service.impl;

import com.sys.dao.ShopsMapper;
import com.sys.pojo.Shops;
import com.sys.service.ShopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopsServiceImpl implements ShopsService {
    @Autowired
    private ShopsMapper shopsMapper;

    @Override
    public boolean insert(Shops shops) {
        boolean flag=false;
        int num=shopsMapper.insert(shops);
        if(num>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public List<Shops> getShops(String username) {
        List<Shops> list=shopsMapper.getShopByUsersname(username);
        return list;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Shops shops) {
        boolean flag=false;
        int num=shopsMapper.updateByPrimaryKeySelective(shops);
        if(num>0){
            flag=true;
        }
        return flag;
    }
}
