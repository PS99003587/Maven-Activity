package com.ltts.dao;

import com.ltts.model.Login;
import com.ltts.model.User;

public interface UserDao {
	void register(User user);

	  User validateUser(Login login);
}
