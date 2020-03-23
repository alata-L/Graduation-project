package com.autolight.service;

import java.util.List;

import com.autolight.entity.Dianlustatus;

public interface DianlustatusService {

	public List<Dianlustatus> findDianlustatusAll();

	public void saveDianlustatus(Dianlustatus dianlustatus);

	public Dianlustatus findDianlustatusByID(Integer dianlutype_id);

	public void deleteDianlustatus(Integer[] id);

}
