package com.myspring.tiger1.user.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.tiger1.user.dao.UserDAO;
import com.myspring.tiger1.user.vo.UserVO;

@Service("UserService")
@Transactional(propagation=Propagation.REQUIRED)
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserVO login(Map  loginMap) throws Exception {
		return userDAO.login(loginMap);
	}
	
	@Override
	public String addUser(UserVO userVO) throws Exception {
		/* userDAO.insertNewUser(userVO); */
		return userDAO.insertNewUser(userVO);
	}
	
	@Override
	public String userIdOverlap(String id) throws Exception{
		return userDAO.selectIdOverlap(id);
	}

}
