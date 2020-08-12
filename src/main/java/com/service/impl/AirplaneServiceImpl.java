package com.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mapper.AirplaneMapper;
import com.pojo.Airplane;
import com.service.AirplaneService;
import com.util.MyBatisUtil;

public class AirplaneServiceImpl implements AirplaneService {

	@Override
	public List<Airplane> show(int takeid, int landid) {
		SqlSession session = MyBatisUtil.getSession();
		AirplaneMapper mapper = session.getMapper(AirplaneMapper.class);
		List<Airplane> selByTakeidLandid = mapper.selByTakeidLandid(takeid, landid);
		return selByTakeidLandid;
	}

}
