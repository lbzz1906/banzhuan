package com.sys.controller;

import com.sys.pojo.Turnover;
import com.sys.pojo.Wallet;
import com.sys.service.TurnoverService;
import com.sys.service.WalletService;
import com.sys.service.impl.TurnoverServiceImpl;
import com.sys.service.impl.WalletServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TurnoverController {
    @Autowired
    TurnoverService turnoverService=new TurnoverServiceImpl();
    @Autowired
    WalletService walletService=new WalletServiceImpl();

    @RequestMapping("/addTurnover")
    @ResponseBody
    public boolean insert(Turnover turnover){
        boolean flag=false;
        flag=walletService.updateMoney(123);
        flag=turnoverService.insert(turnover);
        return flag;
    }
}
