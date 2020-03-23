package com.autolight.dao;

import java.util.List;

import com.autolight.entity.Dianlustatus;

public interface DianlustatusMapper {

	public List<Dianlustatus> findDianlustatusAll();

	public void saveDianlustatus(Dianlustatus dianlustatus);

	public Dianlustatus findDianlustatusByID(Integer dianlutype_id);

	public void updateDianlustatus(Dianlustatus dianlustatus);

	public void deleteDianlustatus(Integer[] id);

}
