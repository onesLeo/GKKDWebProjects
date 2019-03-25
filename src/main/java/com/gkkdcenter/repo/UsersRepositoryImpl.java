package com.gkkdcenter.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.gkkdcenter.data.Users;

@Repository
public class UsersRepositoryImpl implements UsersRepository {

	private JdbcOperations hikariDataSource;

	private static final String SELECT_SPITTER_BY_ID = "SELECT * FROM Users where id=?;";
	private static final String SELECT_SPITTER_BY_USERNAME = "SELECT * FROM Users where username=?;";

	@Autowired
	public UsersRepositoryImpl(JdbcOperations jdbc) {
		this.hikariDataSource = jdbc;
	}

	public Users save(Users user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Users findByUserName(String username) {
		if (username == null) return null;

		return hikariDataSource.queryForObject(SELECT_SPITTER_BY_USERNAME, new UserMapper(), username);
	}

}
