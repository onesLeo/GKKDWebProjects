package com.gkkdcenter.repo;

import static org.mockito.Mockito.doThrow;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import com.gkkdcenter.data.Users;

public class UserDataServiceImpl implements UserDetailsService {

	private UsersRepository usersRepository;

	public UserDataServiceImpl(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = usersRepository.findByUserName(username);
		
		if (user != null) {
			  // setting for such user authorities by role
            List<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

            // returning new spring security user instance based on spitter user and his role
            return new User(
                    user.getUsername(),
                    user.getPassword(),
                    authorities);
		}
		throw new UsernameNotFoundException("User '" + username + "' not found.");
	}


}
