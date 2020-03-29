package com.autolight.service;

import java.util.List;

import com.autolight.entity.Orderofreply;

public interface OrderofreplyService {

	public void saveOrderofreply(Orderofreply orderofreply);

	public List<Orderofreply> findOrderofreplylistAll();

	public Orderofreply findOrderofreplyByID(Integer orderofreply_id);

	public void saveupdateReply(Orderofreply orderofreply);

	public void deleteOrderreply(Integer[] id);

}
