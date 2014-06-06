package com.test.webapp.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.webapp.dao.UserDao;
import com.test.webapp.manager.UserManager;
import com.test.webapp.model.User;

@Service("userManager")
public class UserManagerImpl implements UserManager {

	@Autowired
	private UserDao userDao;

	@Override
	public void add(User user) {
		userDao.save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long userId) {
		// TODO Auto-generated method stub

	}

}
