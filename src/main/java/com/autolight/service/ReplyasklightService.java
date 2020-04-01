package com.autolight.service;

import java.util.List;

import com.autolight.entity.Replyasklight;

public interface ReplyasklightService {

	public void saveReplylight(Replyasklight replyasklight);

	public List<Replyasklight> findAsklightAll();

	public Replyasklight findReplyasklightByID(Integer asklight_id);

	public void deleteReplyasklight(Integer[] id);

	public void updateReplyasklight(Replyasklight replyasklight);

}
