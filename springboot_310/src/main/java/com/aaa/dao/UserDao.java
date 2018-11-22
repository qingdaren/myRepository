package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.aaa.entity.User;

@Mapper
public interface UserDao {

	@Select("select * from users")
	public List<User> query();

	@Select("select * from users")
	public List<Map<String, Object>> queryUser();

	@Select("select * from users where uname = #{uname}")
	public List<Map<String, Object>> queryByName(@Param("uname") String uname);
}
