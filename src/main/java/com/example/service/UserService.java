package com.example.service;

import java.util.List;

import com.example.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

	User getUserByEmail(String name);

	void deleteUser(long id);

	boolean isExists(long id);


}
