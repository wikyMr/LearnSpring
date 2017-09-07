package com.wiky.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wiky.demo.model.User;


public interface UserInfoMapper {
  
	@Select("select * from user where id =#{id}")
	User findUserByName(@Param("id") Long id);
}
