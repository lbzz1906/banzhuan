package com.sys.dao;

import com.sys.pojo.*;
import org.apache.ibatis.annotations.Param;

public interface WalletMapper {

    int deleteByPrimaryKey(Integer walletId);

    int insert(Wallet record);

    int insertSelective(Wallet record);

    Wallet selectByPrimaryKey(Integer walletId);

    int updateByPrimaryKeySelective(Wallet record);

    int updateByPrimaryKey(Wallet record);

    int updateMoney(@Param("money") float m, @Param("username")String name);
}