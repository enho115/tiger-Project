
package com.myspring.tiger1.notice.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.tiger1.notice.vo.NoticeVO;


public interface NoticeDAO {
	
	
	public NoticeVO selectAllArticlesList() throws DataAccessException;
	

}

