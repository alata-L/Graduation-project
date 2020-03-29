package com.autolight.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autolight.dao.OrderofreplyMapper;
import com.autolight.entity.Orderofreply;

@Service
@Transactional
public class OrderofreplyServiceImpl implements OrderofreplyService {
	
	@Resource
    private OrderofreplyMapper orderofreplyMapper;
	public void saveOrderofreply(Orderofreply orderofreply) {
		// TODO Auto-generated method stub
		orderofreplyMapper.saveOrderofreply(orderofreply);
	}
	public List<Orderofreply> findOrderofreplylistAll() {
		// TODO Auto-generated method stub
		return orderofreplyMapper.findOrderofreplylistAll();
	}
	public Orderofreply findOrderofreplyByID(Integer orderofreply_id) {
		// TODO Auto-generated method stub
		return orderofreplyMapper.findOrderofreplyByID(orderofreply_id);
	}
	public void saveupdateReply(Orderofreply orderofreply) {
		
		orderofreplyMapper.saveupdateReply(orderofreply);
	}
	public void deleteOrderreply(Integer[] id) {
		// TODO Auto-generated method stub
		orderofreplyMapper.deleteOrderreply(id);
	}

}
