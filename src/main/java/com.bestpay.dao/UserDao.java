package com.bestpay.dao;

public interface UserDao {

	public void saveUser(User user);
	public User getUser(String id);
}
