package com.autolight.dao;

import java.util.List;

import com.autolight.entity.Replytype;

public interface ReplytypeMapper {

	public List<Replytype> findReplytypeAll();

	public void saveReplytype(Replytype replytype);

	public Replytype findReplytypeByID(Integer reply_id);

	public void updateReplytype(Replytype replytype);

	public void deleteReply(Integer[] id);

}
