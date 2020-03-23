package com.autolight.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autolight.dao.DianlustatusMapper;
import com.autolight.entity.Dianlustatus;

@Service
@Transactional
public class DianlustatusServiceImpl implements DianlustatusService {

	@Resource
	private DianlustatusMapper dianlustatusMapper;
	public List<Dianlustatus> findDianlustatusAll() {
		// TODO Auto-generated method stub
		return dianlustatusMapper.findDianlustatusAll();
	}
	public void saveDianlustatus(Dianlustatus dianlustatus) {
		if(dianlustatus.getDianlutype_id()!=null) {
			dianlustatusMapper.updateDianlustatus(dianlustatus);
			
		}else {
			dianlustatusMapper.saveDianlustatus(dianlustatus);
		}
	}
	public Dianlustatus findDianlustatusByID(Integer dianlutype_id) {
		// TODO Auto-generated method stub
		return dianlustatusMapper.findDianlustatusByID(dianlutype_id) ;
	}
	public void deleteDianlustatus(Integer[] id) {
		// TODO Auto-generated method stub
		dianlustatusMapper.deleteDianlustatus(id);
	}

}
