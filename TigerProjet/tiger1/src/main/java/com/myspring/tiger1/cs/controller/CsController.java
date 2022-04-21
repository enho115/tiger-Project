package com.myspring.tiger1.cs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface CsController {
	public ModelAndView cs_01(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
