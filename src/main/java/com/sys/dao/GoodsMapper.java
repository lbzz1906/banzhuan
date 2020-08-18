package com.sys.dao;


import com.sys.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int deleteByPrimaryKey(Integer goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int insertSelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    Goods selectByPrimaryKey(Integer goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int updateByPrimaryKey(Goods record);
    List<Goods> getGoodsByGoodsName(String goodsname);
    List<Goods> getAllGoods();
    List<Goods> getGoodsByUsersName(String usersname);
    int addImage(@Param("newimage")String image, @Param("newname")String goodsname);

    int deleteGoodsById(int id);
}