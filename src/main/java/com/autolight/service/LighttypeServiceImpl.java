package com.autolight.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autolight.dao.LighttypeMapper;
import com.autolight.entity.Lighttype;

@Service
@Transactional
public class LighttypeServiceImpl implements LighttypeService {

    @Resource
    private LighttypeMapper lighttypemapper;
	public List<Lighttype> findLighttypeAll() {
		// TODO Auto-generated method stub
		return lighttypemapper.findLighttypeAll();
	}
	public void saveLighttype(Lighttype lighttype) {
		// TODO Auto-generated method stub
		if(lighttype.getLtype_id()!=null) {
			lighttypemapper.updateLighttype(lighttype);
		}else {
			lighttypemapper.saveLighttype(lighttype);
		}
	}
	public Lighttype findLighttypeByID(Integer lighttype_id) {
		// TODO Auto-generated method stub
		return lighttypemapper.findLighttypeByID(lighttype_id);
	}
	public void deleteLighttype(Integer[] id) {
		// TODO Auto-generated method stub
		lighttypemapper.deleteLighttype(id);
	}
	

}
