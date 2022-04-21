package com.myspring.tiger1.user.service;

import java.util.Map;

import com.myspring.tiger1.user.vo.UserVO;

public interface UserService {
	public UserVO login(Map loginMap) throws Exception;
	
	public String addUser(UserVO _userVO) throws Exception;
	
	public String userIdOverlap(String id) throws Exception;


}
