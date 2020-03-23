package com.autolight.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.autolight.dao.UserMapper;
import com.autolight.entity.User;
import com.autolight.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.xdevapi.Result;

@Controller
@RequestMapping("/usercontroller")
public final class UserController {
	@Resource
	private UserService userservice;

	@RequestMapping("/userlist")
	@ResponseBody
	public List<User> findUserAll(){
		List<User> list = userservice.findUserALL();
		return list;	
	}
	
	private Map<String, Object> result = new HashMap<String, Object>();
	
	@RequestMapping("/userlistbypage")
	@ResponseBody
	public Map<String, Object> userlistByPage(Integer page,Integer rows){
		PageHelper.startPage(page, rows);
		List<User> list = userservice.findUserALL();
		PageInfo<User> pageInfo = new PageInfo<User>(list);
		long total = pageInfo.getTotal();
		 List<User> userlist = pageInfo.getList();
		 result.put("total",total);
		 result.put("rows",userlist);
		return result;
		
	}
	@RequestMapping("/deleteuser")
	@ResponseBody
	public Map<String, Object> deleteUser(Integer[] id)
	{
		try {
			userservice.deleteUser(id);
			result.put("success",true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("success",false);
			result.put("msg", e.getMessage());
		}
		return result;
	}

	@RequestMapping("/userregister")
	public String userRegister(@RequestParam("user_name")String user_name,@RequestParam("user_gender")String user_gender,@RequestParam("user_phone")String user_phone,@RequestParam("user_password")String user_password,@RequestParam("checkpassword")String checkpassword) {
		if(user_password.equalsIgnoreCase(checkpassword))
		{
			User user = new User();
			user.setUser_name(user_name);
			user.setUser_gender(user_gender);
			user.setUser_phone(user_phone);
			user.setUser_password(user_password);
			userservice.userRegister(user);
			return "login";
		
		}
		else {
			
			System.out.println("两次密码不一致！");
		}
		return "register.jsp";
	}
	@RequestMapping("/saveuser")
	@ResponseBody
	public Map<String, Object> saveuser(User user){
		try {
			userservice.userRegister(user);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success",false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	
	
	@RequestMapping("/findUserById")
	@ResponseBody
	public User findUserByID(Integer user_id) {
		User user = userservice.findUserByID(user_id);
		return user;
		
	}
	

}
