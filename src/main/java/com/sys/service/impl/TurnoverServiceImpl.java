package com.sys.service.impl;

import com.sys.dao.TurnoverMapper;
import com.sys.pojo.Turnover;
import com.sys.service.TurnoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoverServiceImpl implements TurnoverService {
    @Autowired
    private TurnoverMapper turnoverMapper;
    public boolean insert(Turnover turnover){
        boolean flag=false;
        int num=turnoverMapper.insert(turnover);
        if(num>0){
            flag=true;
        }
        return flag;
    }
}