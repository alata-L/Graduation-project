package com.autolight.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autolight.dao.LightMapper;
import com.autolight.entity.Light;

@Service
@Transactional
public class LightServiceImpl implements LightService {
	@Resource
	private LightMapper lightMapper;

	public List<Light> findLightlistAll() {
		// TODO Auto-generated method stub
		return lightMapper.findLightlistAll();
	}

	public void saveLight(Light light) {
		if(light.getLight_id()!=null) {
			lightMapper.updateLight(light);
		}else {
			lightMapper.saveLight(light);
		}
	}

	public Light findLighttypeByID(Integer light_id) {
		// TODO Auto-generated method stub
		return lightMapper.findLightByID(light_id);
	}

	public void deleteLighttype(Integer[] id) {
		// TODO Auto-generated method stub
		lightMapper.deleteLight(id);
	}

}
