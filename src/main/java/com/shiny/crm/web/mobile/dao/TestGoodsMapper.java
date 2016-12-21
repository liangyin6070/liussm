package com.shiny.crm.web.mobile.dao;

import com.shiny.crm.web.mobile.entity.TestGoods;

public interface TestGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestGoods record);

    int insertSelective(TestGoods record);

    TestGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestGoods record);

    int updateByPrimaryKey(TestGoods record);
}