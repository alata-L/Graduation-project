package com.autolight.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autolight.dao.UserMapper;
import com.autolight.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper usermapper;

	public List<User> findUserALL() {
		// TODO Auto-generated method stub
		return usermapper.findUserALL();
	}
	public void userRegister(User user) {
		if(user.getUser_id()!=null) {
			usermapper.updateUser(user);
		}else {
			usermapper.userRegister(user);
		}
		
	}
	public void deleteUser(Integer[] id) {
		// TODO Auto-generated method stub
		usermapper.deleteUser(id);
	}
	public User findUserByID(Integer user_id) {
		// TODO Auto-generated method stub
		return usermapper.findUserByID(user_id);
	}

}
