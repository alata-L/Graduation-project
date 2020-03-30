package com.autolight.service;

import java.util.List;

import com.autolight.entity.Asklight;

public interface AsklightService {

	public void saveAsklight(Asklight asklight);

	public List<Asklight> findAsklightAll();

}
