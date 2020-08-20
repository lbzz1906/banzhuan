package com.sys.service;

import com.sys.pojo.Wallet;
import org.apache.ibatis.annotations.Param;

public interface WalletService {

    boolean insert(Wallet wallet);

    boolean updateByPrimaryKeySelective(Wallet wallet);

    boolean updateMoney(float m,String name);

}
