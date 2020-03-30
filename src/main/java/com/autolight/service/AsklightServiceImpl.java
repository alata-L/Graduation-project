package com.autolight.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autolight.dao.AsklightMapper;
import com.autolight.entity.Asklight;

@Service
@Transactional
public class AsklightServiceImpl implements AsklightService {
	@Resource
	private AsklightMapper asklightMapper;

	public void saveAsklight(Asklight asklight) {
		// TODO Auto-generated method stub
		asklightMapper.saveAsklight(asklight);
	}

	public List<Asklight> findAsklightAll() {
		// TODO Auto-generated method stub
		return asklightMapper.findAsklightAll();
	}

}
