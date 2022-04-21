package com.myspring.tiger1.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MainInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		try {
			
			// ��û view �̸� ����
			String viewName = getViewName(request);
			HttpSession session = request.getSession();
			// admin ���ٽ� ������ rank ��ȿ�� �˻�
			/*
			 * if (viewName.contains("admin")) {
			 * 
			 * if (session.getAttribute("userInfo") != null) { UserVO userVO = (UserVO)
			 * session.getAttribute("userInfo");
			 * 
			 * if (Integer.parseInt(userVO.getUser_rank()) > 1) {
			 * request.setAttribute("viewName", viewName); }
			 * 
			 * else { request.setAttribute("viewName", "redirect:/main.do"); } } else {
			 * request.setAttribute("viewName", "redirect:/main.do"); } } else {
			 * request.setAttribute("viewName", viewName); }
			 */
			request.setAttribute("viewName", viewName);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String fileName = uri.substring(begin, end);
		if (fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));
		}
		if (fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/", 1), fileName.length());
		}
		System.out.printf("viewName : [%s]%n", fileName);

		return fileName;
	}
	
}