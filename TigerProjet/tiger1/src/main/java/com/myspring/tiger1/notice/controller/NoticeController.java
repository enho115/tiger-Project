package com.myspring.tiger1.notice.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface NoticeController {
	
	public ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response) throws Exception;
	/*
	 * public ResponseEntity replyForm(MultipartHttpServletRequest multipartRequest,
	 * HttpServletResponse response) throws Exception;
	 */

}

