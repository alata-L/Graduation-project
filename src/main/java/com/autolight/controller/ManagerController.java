package com.autolight.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.autolight.entity.Dianlustatus;
import com.autolight.entity.Orderofrepair;
import com.autolight.entity.Replytype;
import com.autolight.entity.Room;
import com.autolight.entity.User;
import com.autolight.service.DianlustatusService;
import com.autolight.service.OrderofrepairService;
import com.autolight.service.ReplytypeService;
import com.autolight.service.RoomService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/managecontroller")
public class ManagerController {
	@Resource
	private RoomService roomservice;

	private Map<String, Object> result = new HashMap<String, Object>();

	@RequestMapping("/roomlist")
	@ResponseBody
	public List<Room> findRoomAll() {
		List<Room> list = roomservice.findRoomAll();
		return list;
	}

	@RequestMapping("/roomlistbypage")
	@ResponseBody
	public Map<String, Object> roomlistByPage(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Room> list = roomservice.findRoomAll();
		PageInfo<Room> pageInfo = new PageInfo<Room>(list);
		long total = pageInfo.getTotal();
		List<Room> roomlist = pageInfo.getList();
		result.put("total", total);
		result.put("rows", roomlist);
		return result;

	}

	@RequestMapping("/findRoomByID")
	@ResponseBody
	public Room findUserByID(Integer room_id) {
		Room room = roomservice.findRoomByID(room_id);
		return room;

	}

	@RequestMapping("/deleteroom")
	@ResponseBody
	public Map<String, Object> deleteUser(Integer[] id) {
		try {
			roomservice.deleteRoom(id);
			result.put("success", true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}

	@RequestMapping("/saveroom")
	@ResponseBody
	public Map<String, Object> saveRoom(Room room) {
		try {
			roomservice.saveRoom(room);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}

	@Resource
	private ReplytypeService replytypeservice;

	@RequestMapping("/replytypelist")
	@ResponseBody
	public List<Replytype> findReplytypeAll() {
		List<Replytype> list = replytypeservice.findReplytypeAll();
		return list;
	}

	@RequestMapping("/savereplytype")
	@ResponseBody
	public Map<String, Object> saveReplytype(Replytype replytype) {
		try {
			replytypeservice.saveReplytype(replytype);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}

	@RequestMapping("/findReplytypeByID")
	@ResponseBody
	public Replytype findReplytypeByID(Integer reply_id) {
		Replytype replytype = replytypeservice.findReplytypeByID(reply_id);
		return replytype;

	}
	@RequestMapping("/deletereplytype")
	@ResponseBody
	public Map<String, Object> deleteReply(Integer[] id)
	{
		try {
			replytypeservice.deleteReply(id);
			result.put("success",true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("success",false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	
	@Resource
	private  OrderofrepairService orderofrepairservice;
	
	@RequestMapping("/orderofrepairlist")
	@ResponseBody
	public List<Orderofrepair>  findOrderofrepairAll() {
		List<Orderofrepair> list = orderofrepairservice.findOrderofrepairAll();
		return list;
	}
	
	@RequestMapping("/findOrderofrepairByID")
	@ResponseBody
	public Orderofrepair findOrderofrepairByID(Integer orderofrepair_id) {
		Orderofrepair orderofrepair = orderofrepairservice.findOrderofrepairByID(orderofrepair_id);
		return orderofrepair;

	}
	
	@RequestMapping("/saveorderofrepair")
	@ResponseBody
	public Map<String, Object> saveOrderofrepair(Orderofrepair orderofrepair) {
		try {
			orderofrepairservice.saveOrderofrepair(orderofrepair);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	@RequestMapping("/deleteorderofrepair")
	@ResponseBody
	public Map<String, Object> deleteOrderofrepair(Integer[] id)
	{
		try {
			orderofrepairservice.deleteOrderofrepair(id);
			result.put("success",true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("success",false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	@RequestMapping("/orderofrepairlistbypage")
	@ResponseBody
	public Map<String, Object> orderofrepairlistByPage(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Orderofrepair> list = orderofrepairservice.findOrderofrepairAll();
		PageInfo<Orderofrepair> pageInfo = new PageInfo<Orderofrepair>(list);
		long total = pageInfo.getTotal();
		List<Orderofrepair> orderofrepairlist = pageInfo.getList();
		result.put("total", total);
		result.put("rows", orderofrepairlist);
		return result;

	}
	
	@Resource 
	private DianlustatusService dianlustatusservice;
	@RequestMapping("/dianlustatuslist")
	@ResponseBody
	public List<Dianlustatus>  findDianlustatusAll() {
		List<Dianlustatus> list = dianlustatusservice.findDianlustatusAll();
		return list;
	}
	

	@RequestMapping("/savedianlustatus")
	@ResponseBody
	public Map<String, Object> saveDianlustatus(Dianlustatus dianlustatus) {
		try {
			dianlustatusservice.saveDianlustatus(dianlustatus);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	
	
	@RequestMapping("/findDianlustatusByID")
	@ResponseBody
	public Dianlustatus findDianlustatusByID(Integer dianlutype_id) {
		Dianlustatus dianlustatus = dianlustatusservice.findDianlustatusByID(dianlutype_id);
		return dianlustatus;
	}
	
	@RequestMapping("/deletedianlustatus")
	@ResponseBody
	public Map<String, Object> deleteDianlustatus(Integer[] id)
	{
		try {
			dianlustatusservice.deleteDianlustatus(id);
			result.put("success",true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("success",false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	

	
	
	
	

	

}
