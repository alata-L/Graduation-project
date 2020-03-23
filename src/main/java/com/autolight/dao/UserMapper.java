package com.autolight.dao;

import com.autolight.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	public List<User> findUserALL();

	public void userRegister(User user);

	public void deleteUser(Integer[] id);

	public User findUserByID(Integer user_id);

	public void updateUser(User user);
}