package com.autolight.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autolight.dao.OrderofrepairMapper;
import com.autolight.entity.Orderofrepair;

@Service
@Transactional
public class OrderofrepairServiceImpl implements OrderofrepairService {
	@Resource
	private OrderofrepairMapper orderofrepairmapper;

	public List<Orderofrepair> findOrderofrepairAll() {
		// TODO Auto-generated method stub
		return orderofrepairmapper.findOrderofrepairAll();
	}

	public Orderofrepair findOrderofrepairByID(Integer orderofrepair_id) {
		// TODO Auto-generated method stub
		return orderofrepairmapper.findOrderofrepairByID(orderofrepair_id);
	}

	public void saveOrderofrepair(Orderofrepair orderofrepair) {
		// TODO Auto-generated method stub
		if(orderofrepair.getOrderofrepair_id()!=null) {
			orderofrepairmapper.updateOrderofrepair(orderofrepair);
		}else {
			orderofrepairmapper.saveOrderofrepair(orderofrepair);
		}
	}

	public void deleteOrderofrepair(Integer[] id) {
		// TODO Auto-generated method stub
		orderofrepairmapper.deleteOrderofrepair(id);
	}

}
