package com.myspring.tiger1.product.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;



@Controller("productController")
@RequestMapping(value="/product")
public class productControllerImpl{



	// ��ǰ ���
	@RequestMapping(value= "/product_01.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView product_01(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	
	// ��ǰ ��
	@RequestMapping(value= "/product_02.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView product_02(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// ��ǰ ��_���ı�
	@RequestMapping(value= "/product_03.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView product_03(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	// ��ǰ ��_��۾ȳ�
	@RequestMapping(value= "/product_04.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView product_04(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	// ��ǰ ��_��ǰ ����
	@RequestMapping(value= "/product_05.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView product_05(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	// ��ǰ ���� �ۼ�
	@RequestMapping(value= "/product_06.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView product_06(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	



	
}
