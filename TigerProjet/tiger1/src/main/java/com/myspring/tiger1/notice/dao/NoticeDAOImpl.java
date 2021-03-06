package com.myspring.tiger1.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.tiger1.notice.vo.NoticeVO;

@Repository("noticeDAO")
public class NoticeDAOImpl implements NoticeDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public NoticeVO selectAllArticlesList() throws DataAccessException {
		NoticeVO articlesList = sqlSession.selectOne("mapper.notice.selectAllArticlesList");
		
		System.out.println(articlesList.getNotice_title());
		
		return articlesList;
	}
	
}
