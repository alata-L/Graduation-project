package com.autolight.dao;

import java.util.List;

import com.autolight.entity.Replyasklight;

public interface ReplyasklightMapper {

	public void saveReplylight(Replyasklight replyasklight);

	public List<Replyasklight> findReplyightlistAll();

	public Replyasklight findReplyasklightByID(Integer replylight_id);


	public void deleteReplyasklight(Integer[] id);

	public void updateReplyasklight(Replyasklight replyasklight);

}
