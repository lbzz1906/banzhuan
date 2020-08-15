package com.sys.service.impl;

import com.sys.dao.WalletMapper;
import com.sys.pojo.Wallet;
import com.sys.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {
    @Autowired
    private WalletMapper walletMapper;

    public boolean insert(Wallet wallet){
        boolean flag=false;
        int num=walletMapper.insert(wallet);
        if(num>0){
            flag=true;
        }
        return flag;
    }

    public boolean updateByPrimaryKeySelective(Wallet wallet){
        boolean flag=false;
        int num=walletMapper.updateByPrimaryKeySelective(wallet);
        if(num>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean updateMoney(float money) {
        boolean flag=false;
        int num=walletMapper.updateMoney(money);
        if(num>0){
            flag=true;
        }
        return flag;
    }
}
