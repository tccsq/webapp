package com.test.webapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.webapp.model.User;

public interface UserDao extends CrudRepository<User, Long> {

}
