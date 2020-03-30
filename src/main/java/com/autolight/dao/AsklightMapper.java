package com.autolight.dao;

import java.util.List;

import com.autolight.entity.Asklight;

public interface AsklightMapper {

	public void saveAsklight(Asklight asklight);

	public List<Asklight> findAsklightAll();

}
