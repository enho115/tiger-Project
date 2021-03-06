package com.myspring.tiger1.notice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.tiger1.notice.service.NoticeService;
import com.myspring.tiger1.notice.vo.NoticeVO;

@Controller("noticeController")
@RequestMapping(value="/notice")
public class NoticeControllerImpl implements NoticeController{
	
	@Autowired
	private NoticeService noticeService;
	@Autowired
	private NoticeVO noticeVO;

	int test = 3;
	// 공지사항 리스트페이지
	@Override
	@RequestMapping(value= "/notice_01.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView listArticles(HttpServletRequest request, 
			HttpServletResponse response) throws Exception{
		// HttpSession session;
		
		
		
		String viewName = (String) request.getAttribute("viewName");
		NoticeVO articlesList = noticeService.listArticles();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("articlesList", articlesList);
		return mav;

	}

	// 공지사항 상세페이지
		@RequestMapping(value= "/notice_02.do" ,method={RequestMethod.POST,RequestMethod.GET})
		public ModelAndView notice_02(HttpServletRequest request, HttpServletResponse response) throws Exception{
			// HttpSession session;
			ModelAndView mav = new ModelAndView();
			String viewName = (String)request.getAttribute("viewName");
			mav.setViewName(viewName);
			return mav;
		}



	
}
