package com.myspring.tiger1.user.dao;

import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.myspring.tiger1.user.vo.UserVO;

public interface UserDAO {
	public UserVO login(Map loginMap) throws DataAccessException;
	
	public String insertNewUser(UserVO userVO) throws DataAccessException;
	
	public String selectIdOverlap(String id) throws DataAccessException;
}
