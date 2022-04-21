package com.myspring.tiger1.user.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.tiger1.user.service.UserService;
import com.myspring.tiger1.user.vo.UserVO;

@Controller("userController")
@RequestMapping(value="/user")
public class UserControllerImpl implements UserController{
	@Autowired
	private UserService userService;
	@Autowired
	private UserVO userVO;
	
	
//		user ��ü���� ����
		@RequestMapping(value= "/*" ,method={RequestMethod.POST,RequestMethod.GET})
		public ModelAndView user(HttpServletRequest request, HttpServletResponse response) throws Exception{
			
			ModelAndView mav = new ModelAndView();
			String viewName = (String)request.getAttribute("viewName");
			mav.setViewName(viewName);
			return mav;
		}
	
	
// �α��� ������
	@RequestMapping(value= "/login_01.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView login_01(HttpServletRequest request, 
			HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	
//	@RequestMapping(value="/login.do" ,method = RequestMethod.POST)
//	public ModelAndView login(@RequestParam Map<String, String> loginMap,
//			HttpServletRequest request, HttpServletResponse response) throws Exception{
//		ModelAndView mav = new ModelAndView();
//		UserVO user = userService.login(loginMap);
//		System.out.println("login");
//		System.out.println(user);
//		
//		HttpSession session = request.getSession();
//		
//		return mav;
//	}
	
//	�α���
	@Override
	@RequestMapping(value="/login.do" ,method = RequestMethod.POST)
	public ModelAndView login(@RequestParam Map<String, String> userMap,
				HttpServletRequest request, HttpServletResponse response) throws Exception {
			ModelAndView mav = new ModelAndView();
			HttpSession session=request.getSession();
			userVO=userService.login(userMap);
		 
		 // �޾ƿ� userVo�� ��ȿ�� ����
		 if(userVO!= null && userVO.getUser_id()!=null) {
			// ���� ����
			session=request.getSession();
			// ���ӿ��� ���� set
			session.setAttribute("loginOn", true);
			// ȸ������ ���� set
			session.setAttribute("userInfo",userVO);
			
			mav.setViewName("redirect:/main.do");	
//			System.out.println(userVO.getUser_id());
		}
		else {
			String message="���̵�  ��й�ȣ�� Ʋ���ϴ�. �ٽ� �α������ּ���";
			mav.addObject("message", message);
			mav.setViewName("/user/login_01");
		}
		return mav;
	}
	
	/*
	 * // ���̹� �α���
	 * 
	 * @RequestMapping(value= "/naver_callback.do"
	 * ,method={RequestMethod.POST,RequestMethod.GET}) public ModelAndView
	 * login_04(HttpServletRequest request, HttpServletResponse response) throws
	 * Exception{ // HttpSession session; ModelAndView mav = new ModelAndView();
	 * String viewName = (String)request.getAttribute("viewName");
	 * mav.setViewName(viewName); return mav; }
	 */
	
//	�α׾ƿ�
	@Override
	@RequestMapping(value = "/logout.do", method=RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		session.removeAttribute("loginOn");
		session.removeAttribute("userInfo");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/main.do");
		return mav;
	}
	
//	ȸ������
	@Override
	@RequestMapping(value="/addUser.do" ,method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("userVO") UserVO userVO,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		String user_name = userService.addUser(userVO);
		ModelAndView mav = new ModelAndView();
		try {
			mav.addObject("user_name", user_name);
//			System.out.println(user_name);
			mav.setViewName("/user/join_03");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
	
//	���̵� �ߺ� �˻�
	@Override
	@RequestMapping(value="/userIdOverlap.do" ,method = RequestMethod.POST)
	public ResponseEntity userIdOverlap(@RequestParam("id") String id,HttpServletRequest request, HttpServletResponse response) throws Exception{
		ResponseEntity resEntity = null;
		String result = userService.userIdOverlap(id);
		resEntity =new ResponseEntity(result, HttpStatus.OK);
		System.out.println(result);
		return resEntity;
	}
	
	
//	@Override
//	@ResponseBody
//	@RequestMapping(value="/userIdOverlap.do" ,method = RequestMethod.POST)
//	public ModelAndView userIdOverlap(@RequestParam("id") String id,
//			HttpServletRequest request, HttpServletResponse response) throws Exception{
//		String user_id = userService.userIdOverlap(id);
//		ModelAndView mvc = new ModelAndView();
//		
//		try {
//			mvc.addObject("user_id", user_id);
//			System.out.println(user_id);
//			mvc.setViewName("/user/join_02.do");
//		} 
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return mvc;
//	}

	
	// ���̵� ��й�ȣ ã��
	@RequestMapping(value= "/login_02.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView login_02(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	/*
	 * // ���̵� ã�� ���
	 * 
	 * @RequestMapping(value= "/login_03.do"
	 * ,method={RequestMethod.POST,RequestMethod.GET}) public ModelAndView
	 * login_03(HttpServletRequest request, HttpServletResponse response) throws
	 * Exception{ // HttpSession session; ModelAndView mav = new ModelAndView();
	 * String viewName = (String)request.getAttribute("viewName");
	 * mav.setViewName(viewName); return mav; }
	 */
	
	// ��й�ȣ ã��
	@RequestMapping(value= "/login_04.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView login_04(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	/*
	 * // ��й�ȣ ã�� �Ϸ�
	 * 
	 * @RequestMapping(value= "/login_05.do"
	 * ,method={RequestMethod.POST,RequestMethod.GET}) public ModelAndView
	 * login_05(HttpServletRequest request, HttpServletResponse response) throws
	 * Exception{ // HttpSession session; ModelAndView mav = new ModelAndView();
	 * String viewName = (String)request.getAttribute("viewName");
	 * mav.setViewName(viewName); return mav; }
	 */
	
	// �������
	@RequestMapping(value= "/join_01.do" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView join_01(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		return mav;
	}
	
	/*
	 * // ȸ������ ���� �Է�
	 * 
	 * @RequestMapping(value= "/join_02.do"
	 * ,method={RequestMethod.POST,RequestMethod.GET}) public ModelAndView
	 * join_02(HttpServletRequest request, HttpServletResponse response) throws
	 * Exception{ // HttpSession session; ModelAndView mav = new ModelAndView();
	 * String viewName = (String)request.getAttribute("viewName");
	 * mav.setViewName(viewName); return mav; }
	 */
	
	/*
	 * // ȸ������ �Ϸ�
	 * 
	 * @RequestMapping(value= "/join_03.do"
	 * ,method={RequestMethod.POST,RequestMethod.GET}) public ModelAndView
	 * join_03(HttpServletRequest request, HttpServletResponse response) throws
	 * Exception{ // HttpSession session; ModelAndView mav = new ModelAndView();
	 * String viewName = (String)request.getAttribute("viewName");
	 * mav.setViewName(viewName); return mav; }
	 */

	
}
