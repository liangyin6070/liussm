package com.shiny.crm.web.mobile.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiny.crm.web.mobile.dao.TestGoodsMapper;
import com.shiny.crm.web.mobile.entity.TestGoods;

@Service
public class TestGoodsService {

	@Resource
	private TestGoodsMapper testGoodsMapper;
	
	public TestGoods getById(Integer id) {
		return testGoodsMapper.selectByPrimaryKey(id);
	}
}
