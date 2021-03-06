package com.myspring.tiger1.notice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.tiger1.notice.dao.NoticeDAO;
import com.myspring.tiger1.notice.vo.NoticeVO;

@Service("NoticeService")
@Transactional(propagation = Propagation.REQUIRED)
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	NoticeDAO noticeDAO;

	public NoticeVO listArticles() throws Exception {
		NoticeVO articlesList = noticeDAO.selectAllArticlesList();

		return articlesList;
	}


}
