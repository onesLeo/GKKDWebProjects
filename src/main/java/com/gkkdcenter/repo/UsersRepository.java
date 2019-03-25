package com.gkkdcenter.repo;

import com.gkkdcenter.data.Users;

public interface UsersRepository {

	Users save(Users user);
	
	Users findByUserName(String username);
}
