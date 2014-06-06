package com.test.webapp.manager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.webapp.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {
	@Autowired
	private UserManager userManger;
	
	@Test
	public void savaUser() {
		User u1 = new User();
		u1.setUsername("test123");
		u1.setPassword("123");
		userManger.add(u1);
	}
}
