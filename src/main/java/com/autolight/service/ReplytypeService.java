package com.autolight.service;

import java.util.List;

import com.autolight.entity.Replytype;
import com.autolight.entity.Room;

public interface ReplytypeService {

	public List<Replytype> findReplytypeAll();

	public void saveReplytype(Replytype replytype);

	public Replytype findReplytypeByID(Integer reply_id);

	public void deleteReply(Integer[] id);

}
