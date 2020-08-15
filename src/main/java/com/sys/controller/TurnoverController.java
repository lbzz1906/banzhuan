package com.sys.controller;

import com.sys.pojo.Turnover;
import com.sys.service.TurnoverService;
import com.sys.service.impl.TurnoverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TurnoverController {
    @Autowired
    TurnoverService turnoverService=new TurnoverServiceImpl();

    @RequestMapping("/addTurnover")
    @ResponseBody
    public boolean insert(Turnover turnover){
        boolean flag=false;

        flag=turnoverService.insert(turnover);
        return flag;
    }
}
