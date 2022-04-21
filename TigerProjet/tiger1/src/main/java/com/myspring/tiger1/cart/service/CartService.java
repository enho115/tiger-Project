package com.myspring.tiger1.cart.service;

import java.util.Map;

import com.myspring.tiger1.user.vo.UserVO;

public interface CartService {
	public UserVO login(Map loginMap) throws Exception;

}
