package com.myspring.tiger1.order.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;



@Controller("orderController")
@RequestMapping(value="/order")
public class orderControllerImpl{



	
	// ȸ�� �ֹ� / ����
		@RequestMapping(value= "/order_01.do" ,method={RequestMethod.POST,RequestMethod.GET})
		public ModelAndView order_01(HttpServletRequest request, HttpServletResponse response) throws Exception{
			// HttpSession session;
			ModelAndView mav = new ModelAndView();
			String viewName = (String)request.getAttribute("viewName");
			mav.setViewName(viewName);
			return mav;
		}
	// �ֹ� ���� �Ϸ�
		@RequestMapping(value= "/order_02.do" ,method={RequestMethod.POST,RequestMethod.GET})
		public ModelAndView order_02(HttpServletRequest request, HttpServletResponse response) throws Exception{
			// HttpSession session;
			ModelAndView mav = new ModelAndView();
			String viewName = (String)request.getAttribute("viewName");
			mav.setViewName(viewName);
			return mav;
		}



	
}
