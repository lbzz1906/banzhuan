package com.sys.controller;

import com.sys.pojo.Wallet;
import com.sys.service.WalletService;
import com.sys.service.impl.WalletServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WalletController {
    @Autowired
    WalletService walletService=new WalletServiceImpl();
    @RequestMapping("/updateWallet")
    @ResponseBody
    public boolean updateWallet(Wallet wallet){
        boolean flag=false;
        flag=walletService.updateByPrimaryKeySelective(wallet);
        return flag;
    }

    @RequestMapping("/updateMoney")
    @ResponseBody
    public boolean updateMoney(float money,String username){
        boolean flag=false;
        flag=walletService.updateMoney(money,username);
        return flag;
    }
}
