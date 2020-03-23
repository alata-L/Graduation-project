package com.autolight.service;

import java.util.List;
import com.autolight.entity.User;

/**
 * @author 14842
 *
 */
public interface UserService {

	public List<User> findUserALL();
	public void userRegister(User user);
	public void deleteUser(Integer[] id);
	public User findUserByID(Integer user_id);
}