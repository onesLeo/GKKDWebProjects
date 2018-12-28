package com.ciledug.repo;

import spittr.data.Users;

public interface UsersRepository {

	Users save(Users user);
	
	Users findByUserName(String username);
}
