package com.example.demo1204.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1204.domain.User;
import com.example.demo1204.mapper.UserMapper;
import com.example.demo1204.service.AjaxService;
@Service
public class AjaxServiceImpl  implements AjaxService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public Integer findUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.findUser(user);
	}

}
