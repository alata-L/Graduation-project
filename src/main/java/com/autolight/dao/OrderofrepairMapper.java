package com.autolight.dao;

import java.util.List;

import com.autolight.entity.Orderofrepair;

public interface OrderofrepairMapper {

	public List<Orderofrepair> findOrderofrepairAll();

	public Orderofrepair findOrderofrepairByID(Integer orderofrepair_id);

	public void saveOrderofrepair(Orderofrepair orderofrepair);

	public void updateOrderofrepair(Orderofrepair orderofrepair);

	public void deleteOrderofrepair(Integer[] id);

}
