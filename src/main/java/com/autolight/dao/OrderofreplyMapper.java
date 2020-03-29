package com.autolight.dao;

import java.util.List;

import com.autolight.entity.Orderofreply;

public interface OrderofreplyMapper {

	public void saveOrderofreply(Orderofreply orderofreply);

	public List<Orderofreply> findOrderofreplylistAll();

	public Orderofreply findOrderofreplyByID(Integer orderofreply_id);

	public void saveupdateReply(Orderofreply orderofreply);

	public void deleteOrderreply(Integer[] id);


}
