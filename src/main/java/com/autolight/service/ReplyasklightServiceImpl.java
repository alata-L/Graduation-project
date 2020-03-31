package com.autolight.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autolight.dao.ReplyasklightMapper;
import com.autolight.entity.Replyasklight;

@Service
@Transactional
public class ReplyasklightServiceImpl implements ReplyasklightService {
	@Resource
	private ReplyasklightMapper replyasklightMapper;

	public void saveReplylight(Replyasklight replyasklight) {
		replyasklightMapper.saveReplylight(replyasklight);
	}

}
