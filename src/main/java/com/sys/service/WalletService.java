package com.sys.service;

import com.sys.pojo.Wallet;

public interface WalletService {
    boolean insert(Wallet wallet);
    boolean updateByPrimaryKeySelective(Wallet wallet);
}
