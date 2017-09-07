package com.wiky.demo.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiky.demo.dao.UserInfoMapper;
import com.wiky.demo.model.*;

@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {
	
   @Resource
   UserInfoMapper userInfoMapper;
   
	@RequestMapping("/{id}")
	public User view(@PathVariable("id") Long id) {
		User user = new User();
		user=userInfoMapper.findUserByName(id);
		return user;
	}

}
