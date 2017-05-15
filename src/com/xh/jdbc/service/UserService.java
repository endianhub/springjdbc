package com.xh.jdbc.service;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xh.jdbc.dao.impl.UserDaoImpl;


@Service
public class UserService {

	@Resource
	private UserDaoImpl userDao;
	
	public List findAll(){
		
		return userDao.findAll();
	}
	
	
}
