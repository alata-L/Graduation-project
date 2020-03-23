package com.autolight.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autolight.dao.ReplytypeMapper;
import com.autolight.entity.Replytype;
import com.autolight.entity.Room;

@Service
@Transactional
public class ReplytypeServiceImpl implements ReplytypeService {
	@Resource
	private ReplytypeMapper replytypemapper;

	public List<Replytype> findReplytypeAll() {
		// TODO Auto-generated method stub
		return replytypemapper.findReplytypeAll();
	}

	public void saveReplytype(Replytype replytype) {
		if(replytype.getReply_id()!=null) {
			replytypemapper.updateReplytype(replytype);
			
		}else {
			replytypemapper.saveReplytype(replytype);
		}
	}

	public Replytype findReplytypeByID(Integer reply_id) {
		// TODO Auto-generated method stub
		return replytypemapper.findReplytypeByID(reply_id);
	}

	public void deleteReply(Integer[] id) {
		// TODO Auto-generated method stub
		replytypemapper.deleteReply(id);
	}

}
