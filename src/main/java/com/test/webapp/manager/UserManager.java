package com.test.webapp.manager;

import com.test.webapp.model.User;

public interface UserManager {
	public void add(User user);
	
	public void update(User user);
	
	public User getById(Long userId);
	
	public void deleteById(Long userId);
}
