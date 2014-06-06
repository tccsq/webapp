package com.test.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_USER")
public class User extends CommonEntity<Long> {

	private static final long serialVersionUID = 1L;
	@Column(name = "USERNAME", nullable = false, unique = true)
	private String username;
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "QQ")
	private String qq;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}
}
