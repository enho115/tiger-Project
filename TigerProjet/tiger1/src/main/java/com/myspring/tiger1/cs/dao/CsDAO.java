package com.myspring.tiger1.cs.dao;

import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.myspring.tiger1.cs.vo.CsVO;

public interface CsDAO {
	public CsVO csList(Map csMap) throws DataAccessException;
	
	

}
