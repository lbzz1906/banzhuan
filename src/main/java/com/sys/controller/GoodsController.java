package com.sys.controller;

import com.sys.pojo.Goods;
import com.sys.service.GoodsService;
import com.sys.service.impl.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    GoodsService goodsService=new GoodsServiceImpl();
    String goodname=new String();
    @RequestMapping("/addImage")
    @ResponseBody
    public boolean addImage(MultipartFile file) {
        boolean flag=false;
        String path="E:\\JAVA\\ideaProjects\\banzhuan2.0\\src\\main\\webapp\\goodsimages";
        if(!file.isEmpty()){
            String name=file.getOriginalFilename();
            File rootfile=new File(path);
            if(!rootfile.exists()){
                rootfile.mkdir();
            }
            try {
                File os=new File(path+"/"+name);
                file.transferTo(os);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        flag=goodsService.addImage("../goodsimages/"+file.getOriginalFilename(),goodname);
        return flag;
    }

    @RequestMapping("/addGoods")
    @ResponseBody
    public boolean insert(Goods goods){
        goodname=goods.getGoodsName();
        boolean flag=false;
        flag=goodsService.insert(goods);
        return flag;
    }

    @RequestMapping("/updateGoods")
    @ResponseBody
    public boolean updateGoods(Goods goods){
        boolean flag=false;
        flag=goodsService.updateByPrimaryKeySelective(goods);
        return flag;
    }

    @RequestMapping("/getGoodsByGoodsName")
    @ResponseBody
    public List<Goods> getGoodsByGoodsName(String goodsname){
        List<Goods> list=goodsService.getGoodsByGoodsName(goodsname);
        return list;
    }

    @RequestMapping("/getGoodsByUsersName")
    @ResponseBody
    public List<Goods> getGoodsByUsersName(String usersname){
        List<Goods> list=goodsService.getGoodsByUsersName(usersname);
        return list;
    }

    @RequestMapping("/getAllGoods")
    @ResponseBody
    public List<Goods> getAllGoods(){
        List<Goods> list=goodsService.getAllGoods();
        return list;
    }


}