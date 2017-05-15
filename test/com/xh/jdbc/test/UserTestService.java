package com.xh.jdbc.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xh.jdbc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class UserTestService {

	@Resource
	private UserService userService;

	@Test
	public void findAll() {
		List list = userService.findAll();
		System.out.println(list.size());
	}

}
