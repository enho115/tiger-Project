package com.myspring.tiger1.myPage.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;



@Controller("myPageController")
@RequestMapping(value="/myPage")
public class myPageControllerImpl{

	
	
	
	// ȸ��Ż��
	@RequestMapping(value= "/dropOut_01.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView dropOut_01(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// ȸ��Ż�� �Ϸ�
	@RequestMapping(value= "/dropOut_02.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView dropOut_02(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}


	@RequestMapping(value= "/myPage_01.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_01(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// ȸ������ ����
	@RequestMapping(value= "/myPage_02.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_02(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// ȸ������ ���� �Է�
	@RequestMapping(value= "/myPage_02_01.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_02_01(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// �ֹ� ��� ��ȸ
	@RequestMapping(value= "/myPage_03.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_03(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// �ֹ� �� ����
	@RequestMapping(value= "/myPage_03_01.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_03_01(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// ��ǰ ��ȯ ��û
	@RequestMapping(value= "/myPage_03_02.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_03_02(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// ��ǰ �ı�
	@RequestMapping(value= "/myPage_03_03.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_03_03(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// ����Ʈ ����
	@RequestMapping(value= "/myPage_04.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_04(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// ȸ����� �ȳ�
	@RequestMapping(value= "/myPage_05.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_05(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// ���� ����
	@RequestMapping(value= "/myPage_06.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_06(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// ���� ���� ��
	@RequestMapping(value= "/myPage_06_01.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_06_01(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	// ��ǰ �ı�
	@RequestMapping(value= "/myPage_07.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_07(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	
	// ��ǰ �ı� ����
	@RequestMapping(value= "/myPage_07_01.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView user_mypage_07_01(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}



	
}
