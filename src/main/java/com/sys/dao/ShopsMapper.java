package com.sys.dao;

import com.sys.pojo.*;

import java.util.List;

public interface ShopsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shops
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int deleteByPrimaryKey(Integer shopsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shops
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int insert(Shops record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shops
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int insertSelective(Shops record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shops
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    Shops selectByPrimaryKey(Integer shopsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shops
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int updateByPrimaryKeySelective(Shops record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shops
     *
     * @mbggenerated Sun Aug 09 14:49:32 CST 2020
     */
    int updateByPrimaryKey(Shops record);
    List<Shops> getShopByUsersname(String username);
}