package com.sys.service;

import com.sys.pojo.Goods;

import java.util.List;

public interface GoodsService {
    boolean insert(Goods goods);
    boolean addImage(String image,String goodsname);
    boolean updateByPrimaryKeySelective(Goods goods);
    List<Goods> getGoodsByGoodsName(String goodsname);
}
