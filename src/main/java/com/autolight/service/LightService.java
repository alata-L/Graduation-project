package com.autolight.service;

import java.util.List;

import com.autolight.entity.Light;

public interface LightService {

	public List<Light> findLightlistAll();

	public void saveLight(Light light);

    public Light findLighttypeByID(Integer light_id);

    public void deleteLighttype(Integer[] id);

}
