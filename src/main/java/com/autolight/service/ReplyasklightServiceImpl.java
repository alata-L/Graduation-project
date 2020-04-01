package com.autolight.service;

import java.util.List;

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

	public List<Replyasklight> findAsklightAll() {
		// TODO Auto-generated method stub
		return replyasklightMapper.findReplyightlistAll();
	}

	public Replyasklight findReplyasklightByID(Integer replylight_id) {
		// TODO Auto-generated method stub
		return replyasklightMapper.findReplyasklightByID(replylight_id);
	}


	public void deleteReplyasklight(Integer[] id) {
		// TODO Auto-generated method stub
		replyasklightMapper.deleteReplyasklight(id);
	}

	public void updateReplyasklight(Replyasklight replyasklight) {
		// TODO Auto-generated method stub
		replyasklightMapper.updateReplyasklight(replyasklight);
	}

}
