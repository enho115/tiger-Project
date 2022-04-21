package com.myspring.tiger1.cs.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myspring.tiger1.cs.dao.CsDAO;
import com.myspring.tiger1.cs.vo.CsVO;

public class CsServiceImpl implements CsService {
	
	@Autowired
	private CsDAO csDAO;
	
	@Override
	public CsVO csList(Map csMap) throws Exception {
		return csDAO.csList(csMap);
	}

}
