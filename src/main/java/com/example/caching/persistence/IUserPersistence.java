package com.example.caching.persistence;

import java.util.List;

import com.example.caching.entity.User;

public interface IUserPersistence {
	
	public List<User> listUser();
	
	public Long createNewUser(User pUser);

}
