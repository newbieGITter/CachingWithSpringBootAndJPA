package com.example.caching.service;

import java.util.List;

import com.example.caching.entity.User;

public interface IUserService {
	
	public List<User> listUser();
	public Long createNewUser(User pUser);

}
