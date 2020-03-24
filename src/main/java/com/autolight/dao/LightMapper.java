package com.autolight.dao;

import java.util.List;

import com.autolight.entity.Light;

public interface LightMapper {

	public List<Light> findLightlistAll();

	public void saveLight(Light light);

	public Light findLightByID(Integer light_id);

	public void updateLight(Light light);

	public void deleteLight(Integer[] id);

}
