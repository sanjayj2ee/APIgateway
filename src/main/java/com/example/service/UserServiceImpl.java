package com.example.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.security.UserRepository;
import com.example.util.PasswordUtil;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User save(User user) {
		String password = PasswordUtil.getPassword(user.getPassword());
		user.setPassword(password);
		user.setCreatedDate(new Date());
		return userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserByEmail(String name) {

		return userRepository.findByEmailIgnoreCase(name);
	}

	@Override
	public void deleteUser(long id) {

		userRepository.deleteById(id);
	}

	@Override
	public boolean isExists(long id) {
		return userRepository.existsById(id);
	}


}
