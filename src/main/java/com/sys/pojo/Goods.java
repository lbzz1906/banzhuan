package com.sys.pojo;

import org.springframework.web.multipart.MultipartFile;

public class Goods {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_id
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    private Integer goodsId;

    private String goodsImage;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.category_id
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_name
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    private String goodsName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_price
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    private Float goodsPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_image
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_describe
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    private String goodsDescribe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_total_amount
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    private Integer goodsTotalAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.shops_name
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    private String shopsName;
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_id
     *
     * @return the value of goods.goods_id
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_id
     *
     * @param goodsId the value for goods.goods_id
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.category_id
     *
     * @return the value of goods.category_id
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.category_id
     *
     * @param categoryId the value for goods.category_id
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_name
     *
     * @return the value of goods.goods_name
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_name
     *
     * @param goodsName the value for goods.goods_name
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_price
     *
     * @return the value of goods.goods_price
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public Float getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_price
     *
     * @param goodsPrice the value for goods.goods_price
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_describe
     *
     * @return the value of goods.goods_describe
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_describe
     *
     * @param goodsDescribe the value for goods.goods_describe
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_total_amount
     *
     * @return the value of goods.goods_total_amount
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public Integer getGoodsTotalAmount() {
        return goodsTotalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_total_amount
     *
     * @param goodsTotalAmount the value for goods.goods_total_amount
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public void setGoodsTotalAmount(Integer goodsTotalAmount) {
        this.goodsTotalAmount = goodsTotalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.shops_name
     *
     * @return the value of goods.shops_name
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    public String getShopsName() {
        return shopsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.shops_name
     *
     * @param shopsName the value for goods.shops_name
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
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