package com.autolight.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.autolight.entity.Asklight;
import com.autolight.entity.Dianlustatus;
import com.autolight.entity.Light;
import com.autolight.entity.Lighttype;
import com.autolight.entity.Orderofrepair;
import com.autolight.entity.Orderofreply;
import com.autolight.entity.Replyasklight;
import com.autolight.entity.Replytype;
import com.autolight.entity.Room;
import com.autolight.entity.User;
import com.autolight.service.AsklightService;
import com.autolight.service.DianlustatusService;
import com.autolight.service.LightService;
import com.autolight.service.LighttypeService;
import com.autolight.service.OrderofrepairService;
import com.autolight.service.OrderofreplyService;
import com.autolight.service.ReplyasklightService;
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
	
	@RequestMapping("/updateRoomdianlustatusofconnect")
	@ResponseBody
	public Map<String, Object> updateRoomdianlustatusofconnect(Integer[] id) {
		try {
			roomservice.updateRoomdianlustatusofconnect(id);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/updateRoomdianlustatusofdisconnect")
	@ResponseBody
	public Map<String, Object> updateRoomdianlustatusofdisconnect(Integer[] id) {
		try {
			roomservice.updateRoomdianlustatusofdisconnect(id);
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
			System.out.println(orderofrepair.getOrderofrepair_id());
			orderofrepairservice.saveOrderofrepair(orderofrepair);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/saveask")
	public String saveAskrepair(Orderofrepair orderofrepair) {
		orderofrepairservice.saveOrderofrepair(orderofrepair);
		return "Myrepairandrequest";
		
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
	
	@Resource
	private LighttypeService lighttypeservice;
	
	@RequestMapping("/lighttypelist")
	@ResponseBody
	public List<Lighttype>  findLighttypeAll() {
		List<Lighttype> list = lighttypeservice.findLighttypeAll();
		return list;
	}
	
	@RequestMapping("/saveLighttype")
	@ResponseBody
	public Map<String, Object> saveLighttype(Lighttype lighttype) {
		try {
			lighttypeservice.saveLighttype(lighttype);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/findlighttypebyID")
	@ResponseBody
	public Lighttype findLighttypeByID(Integer ltype_id) {
		Lighttype lighttype = lighttypeservice.findLighttypeByID(ltype_id);
		return lighttype;
	}
	
	@RequestMapping("/deletelighttype")
	@ResponseBody
	public Map<String, Object> deleteLighttype(Integer[] id)
	{
		try {
			lighttypeservice.deleteLighttype(id);
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
	private LightService lightservice;
	
	@RequestMapping("/lightlist")
	@ResponseBody
	public List<Light>  findLightlistAll() {
		List<Light> list = lightservice.findLightlistAll();
		return list;
	}
	
	@RequestMapping("/saveLight")
	@ResponseBody
	public Map<String, Object> saveLight(Light light) {
		try {
			lightservice.saveLight(light);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}

	@RequestMapping("/findLightByID")
	@ResponseBody
	public Light findLightByID(Integer light_id) {
		Light light = lightservice.findLighttypeByID(light_id);
		return light;
	}
	
	@RequestMapping("/deletelight")
	@ResponseBody
	public Map<String, Object> deleteLight(Integer[] id)
	{
		try {
			lightservice.deleteLighttype(id);
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
	private OrderofreplyService orderofreplyService;

	
	
	@RequestMapping("/findOrderofreply")
	@ResponseBody
	public Map<String, Object> findOrderofreply( HttpSession session,@RequestParam("orderofrepair_id")Integer orderofrepair_id) {
		try {
			Orderofrepair orderofrepair = orderofrepairservice.findOrderofrepairByID(orderofrepair_id);
			session.setAttribute("orderofrepair", orderofrepair);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/saveOrderofreply")
	@ResponseBody
	public Map<String, Object> saveOrderofreply( HttpSession session,@RequestParam("replyuser_id")Integer replyuser_id,@RequestParam("replyuser_name")String replyuser_name,@RequestParam("replytype_name")String replytype_name) {
		try {
			Orderofrepair orderofrepair =(Orderofrepair) session.getAttribute("orderofrepair");
			Orderofreply orderofreply = new Orderofreply();
			orderofreply.setOrderofrepair_id(orderofrepair.getOrderofrepair_id());
			orderofreply.setRoom_name(orderofrepair.getRoom_name());
			orderofreply.setUser_id(orderofrepair.getUser_id());
			orderofreply.setUser_name(orderofrepair.getUser_name());
			orderofreply.setOrderofrepair_text(orderofrepair.getOrderofrepair_text());
			orderofreply.setOrderofrepair_time(orderofrepair.getOrderofrepair_time());
			orderofreply.setReplyuser_id(replyuser_id);
			orderofreply.setReplyuser_name(replyuser_name);
			orderofreply.setReplytype_name(replytype_name);
			orderofreplyService.saveOrderofreply(orderofreply);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/orderofreplylist")
	@ResponseBody
	public List<Orderofreply>  findOrderofreplylistAll(){
		List<Orderofreply> list = orderofreplyService. findOrderofreplylistAll();
		return list;
	}
	
	@RequestMapping("/orderofreplylistByPage")
	@ResponseBody
	public Map<String, Object> orderofreplylistByPage(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Orderofreply> list = orderofreplyService. findOrderofreplylistAll();
		PageInfo<Orderofreply> pageInfo = new PageInfo<Orderofreply>(list);
		long total = pageInfo.getTotal();
		List<Orderofreply> orderofreplylist = pageInfo.getList();
		result.put("total", total);
		result.put("rows", orderofreplylist);
		return result;
	}
	
	@RequestMapping("/findOrderofreplyByID")
	@ResponseBody
	public Orderofreply findOrderofreplyByID(Integer orderofreply_id) {
		Orderofreply orderofreply = orderofreplyService.findOrderofreplyByID(orderofreply_id);
		return orderofreply;
	}
	
	
	@RequestMapping("/saveupdatereply")
	@ResponseBody
	public Map<String, Object> saveupdateReply(Orderofreply orderofreply) {
		try {
			orderofreplyService.saveupdateReply(orderofreply);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}

	@RequestMapping("/deleteOrderreply")
	@ResponseBody
	public Map<String, Object> deleteOrderreply(Integer[] id)
	{
		try {
			orderofreplyService.deleteOrderreply(id);
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
	private AsklightService asklightService;
	
	@RequestMapping("/saveasklight")
	public String saveAsklight(Asklight asklight) {
		asklightService.saveAsklight(asklight);
		return "Myrepairandrequest";
		
	}
	
	@RequestMapping("/asklightlist")
	@ResponseBody
	public List<Asklight>  findAsklightAll(){
		List<Asklight> list = asklightService.findAsklightAll();
		return list;
	}
	
	@RequestMapping("/asklightlistByPage")
	@ResponseBody
	public Map<String, Object> asklightListByPage(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Asklight> list = asklightService.findAsklightAll();
		PageInfo<Asklight> pageInfo = new PageInfo<Asklight>(list);
		long total = pageInfo.getTotal();
		List<Asklight> asklightlist = pageInfo.getList();
		result.put("total", total);
		result.put("rows", asklightlist);
		return result;
	}
	
	@RequestMapping("/findreplylightByID")
	@ResponseBody
	public Asklight findReplylightByID(Integer asklight_id) {
		Asklight asklight = asklightService.findReplylightByID(asklight_id);
		return asklight;
	}
	
	
	@RequestMapping("/findreplylight")
	@ResponseBody
	public Map<String, Object> findReplylight( HttpSession session,@RequestParam("asklight_id")Integer asklight_id) {
		try {
			Asklight asklight = asklightService.findReplylightByID(asklight_id);
			session.setAttribute("asklight", asklight);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/saveupdateasklight")
	@ResponseBody
	public Map<String, Object> saveupdateAsklight(Asklight asklight) {
		try {
			asklightService.saveupdateAsklight(asklight);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	@Resource
	private ReplyasklightService replyasklightService;
	
	@RequestMapping("/savereplylight")
	@ResponseBody
	public Map<String, Object> saveReplylight( HttpSession session,@RequestParam("replyuser_id")Integer replyuser_id,@RequestParam("replyuser_name")String replyuser_name,@RequestParam("replytype_name")String replytype_name) {
		try {
			Asklight asklight =(Asklight) session.getAttribute("asklight");
			Replyasklight replyasklight = new Replyasklight();
			replyasklight.setAsklight_id(asklight.getAsklight_id());
			replyasklight.setRoom_name(asklight.getRoom_name());
			replyasklight.setUser_id(asklight.getUser_id());
			replyasklight.setUser_name(asklight.getUser_name());
			replyasklight.setAsklight_text(asklight.getAsklight_text());
			replyasklight.setAsklight_time(asklight.getAsklight_time());
			replyasklight.setReplyuser_id(replyuser_id);
			replyasklight.setReplyuser_name(replyuser_name);
			replyasklight.setReplytype_name(replytype_name);
			replyasklightService.saveReplylight(replyasklight);
			result.put("success", true);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/deleteAsklight")
	@ResponseBody
	public Map<String, Object> deleteAsklight(Integer[] id)
	{
		try {
			asklightService.deleteAsklight(id);
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
