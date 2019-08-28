package com.example.stockspring.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.UserDao;
import com.example.stockspring.model.Login;
import com.example.stockspring.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean registerUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("inside userservice");
		if(userDao.save(user)!=null)
			return true;
		else
			return false;
	}

	@Override
	public User loginUser(Login login) throws SQLException {
		// TODO Auto-generated method stub
		User user=userDao.findByUsername(login.getUsername());
		return user;
	}

}
