package com.myspring.tiger1.user.controller;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.tiger1.user.vo.UserVO;



public interface UserController {
	public ModelAndView login(@RequestParam Map<String, String> loginMap,
			HttpServletRequest request, HttpServletResponse response) throws Exception;

	
	public ModelAndView logout(HttpServletRequest request, 
			HttpServletResponse response) throws Exception;
//	ȸ������
	public ModelAndView addUser(@ModelAttribute("user") UserVO user,
            HttpServletRequest request, HttpServletResponse response) throws Exception;
//	���̵� �ߺ� �˻�
//	public ModelAndView userIdOverlap(@RequestParam("id") String id,
//			HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ResponseEntity userIdOverlap(@RequestParam("id") String id,
			HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}

	