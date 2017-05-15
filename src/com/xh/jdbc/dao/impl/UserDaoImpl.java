package com.xh.jdbc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xh.jdbc.dao.IUserDAO;
import com.xh.jdbc.model.User;

@Repository
public class UserDaoImpl implements IUserDAO {

	@Resource
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List findAll() {
		String sql = "select * from user";
		return template.query(sql, new BeanPropertyRowMapper(User.class));
	}

}
