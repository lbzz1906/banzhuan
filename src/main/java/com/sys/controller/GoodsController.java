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
        String path=url();
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
        flag=goodsService.addImage(path+"/"+file.getOriginalFilename(),goodname);
        return flag;
    }

    @RequestMapping("/addGoods")
    @ResponseBody
    public boolean insert(Goods goods){
        goods.setGoodsDescribe(".............");
        goods.setCategoryId(1);
        goods.setShopsName("淘宝");
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








    public static String url(){
        //测试获取tomcat下的webapps路径
        String upload;  //存到webapps下文件的名称
        String tomcat_path = System.getProperty("user.dir");
        System.out.println("tomcatPath:" + tomcat_path);
        //获取Tomcat服务器所在路径的最后一个文件目录
        String bin_path = tomcat_path.substring(tomcat_path.lastIndexOf("\\")+1,tomcat_path.length());
        System.out.println(bin_path);
        //若最后一个文件目录为bin目录，则服务器为手动启动
        if(("bin").equals(bin_path)){//手动启动Tomcat时获取路径为：D:\Software\Tomcat-8.5\bin
            //获取保存上传图片的文件路径
            upload = tomcat_path.substring(0,System.getProperty( "user.dir" ).lastIndexOf("\\")) +"\\webapps"+"\\goodsimages\\";
        }else{//服务中自启动Tomcat时获取路径为：D:\Software\Tomcat-8.5
            upload = tomcat_path+"\\webapps"+"\\goodsimages\\";
        }
        return upload;
    }
}