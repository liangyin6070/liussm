package com.shiny.crm.web.mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shiny.crm.web.mobile.entity.TestGoods;
import com.shiny.crm.web.mobile.service.TestGoodsService;

@RestController
public class LoginController {

	@Autowired
	private TestGoodsService testGoodsService;
	
	@RequestMapping("/user/list")
	public JSONObject tolist() {
		TestGoods good = testGoodsService.getById(1);
		
		return (JSONObject) JSON.toJSON(good);
	}
	
}
