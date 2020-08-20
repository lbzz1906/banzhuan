package com.sys.dao;


import com.sys.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {

    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> getGoodsByGoodsName(String goodsname);

    List<Goods> getAllGoods();

    List<Goods> getGoodsByUsersName(String usersname);

    int addImage(@Param("newimage")String image, @Param("newname")String goodsname);

    int deleteGoodsById(int id);
}