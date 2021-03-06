package com.sys.service.impl;

import com.sys.dao.GoodsMapper;
import com.sys.pojo.Goods;
import com.sys.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public boolean addImage(String image,String goodsname){
        boolean flag=false;
        int num=goodsMapper.addImage(image,goodsname);
        if(num>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean insert(Goods goods){
        boolean flag=false;
        int num=goodsMapper.insert(goods);
        if(num>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Goods goods){
        boolean flag=false;
        int num=goodsMapper.updateByPrimaryKeySelective(goods);
        if(num>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public List<Goods> getAllGoods() {
        List<Goods> list=new ArrayList<>();
        list=goodsMapper.getAllGoods();
        return list;
    }

    @Override
    public List<Goods> getGoodsByGoodsName(String goodsname){
        List<Goods> list=new ArrayList<>();
        list=goodsMapper.getGoodsByGoodsName(goodsname);
        return list;
    }

    @Override
    public List<Goods> getGoodsByUsersName(String usersname) {
        List<Goods> list=new ArrayList<>();
        list=goodsMapper.getGoodsByUsersName(usersname);
        return list;
    }

    @Override
    public boolean deleteGoodsById(int id){
        boolean flag=false;
        int num=goodsMapper.deleteGoodsById(id);
        if(num>0){
            flag=true;
        }
        return flag;
    }
}
