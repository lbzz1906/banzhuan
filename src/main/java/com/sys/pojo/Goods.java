package com.sys.pojo;

import org.springframework.web.multipart.MultipartFile;

public class Goods {
Integer goodsId;

    private String goodsImage;

    private Integer categoryId;

    private String goodsName;

    private Float goodsPrice;

    private String goodsDescribe;

    private Integer goodsTotalAmount;

    private String shopsName;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }

    public Integer getGoodsTotalAmount() {
        return goodsTotalAmount;
    }

    public void setGoodsTotalAmount(Integer goodsTotalAmount) {
        this.goodsTotalAmount = goodsTotalAmount;
    }

    public String getShopsName() {
        return shopsName;
    }

    public void setShopsName(String shopsName) {
        this.shopsName = shopsName;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", categoryId=" + categoryId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsImage='" + goodsImage + '\'' +
                ", goodsDescribe='" + goodsDescribe + '\'' +
                ", goodsTotalAmount=" + goodsTotalAmount +
                ", shopsName='" + shopsName + '\'' +
                '}';
    }
}