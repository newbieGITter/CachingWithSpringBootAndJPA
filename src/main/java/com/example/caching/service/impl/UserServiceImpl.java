package com.example.caching.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.caching.entity.User;
import com.example.caching.persistence.IUserPersistence;
import com.example.caching.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserPersistence gIUserPersistence;
	
	@Override
	public Long createNewUser(User pUser) {
		// TODO Auto-generated method stub
		return gIUserPersistence.createNewUser(pUser);
	}

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return gIUserPersistence.listUser();
	}

}
