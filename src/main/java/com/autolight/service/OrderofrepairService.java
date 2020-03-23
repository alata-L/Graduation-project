package com.autolight.service;

import java.util.List;

import com.autolight.entity.Orderofrepair;

public interface OrderofrepairService {

	public List<Orderofrepair> findOrderofrepairAll();

	public Orderofrepair findOrderofrepairByID(Integer orderofrepair_id);

	public void saveOrderofrepair(Orderofrepair orderofrepair);

	public void deleteOrderofrepair(Integer[] id);

}
