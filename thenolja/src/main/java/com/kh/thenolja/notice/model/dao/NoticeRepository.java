package com.kh.thenolja.notice.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.thenolja.notice.model.vo.Notice;

@Repository
public class NoticeRepository {

	// 게시글 전체 리스트 카운트 조회
	public int selectListCount(SqlSessionTemplate sqlSession) {
		return sqlSession.selectOne("noticeMapper.selectListCount");
	}	
	// 공지사항 목록 조회
	public List<Notice>selectNoticelist(SqlSessionTemplate sqlSession){
//		System.out.println("[NoticeRepository rowBounds] " + rowBounds.getOffset());
//		System.out.println("[NoticeRepository rowBounds] " + rowBounds.getLimit());
		return sqlSession.selectList("noticeMapper.selectNoticelist");
	}
	// 공지사항 등록
	public int regNoticeInfo(SqlSessionTemplate sqlSession, Notice nt) {
		System.out.println("[NoticeRepository regNoticeInfo] " + nt);
		return sqlSession.insert("noticeMapper.regNotice", nt);
	}
	// 공지사항 상세조회
	public Notice selectNoticeOne(SqlSessionTemplate sqlSession, int ntsNo) {
		System.out.println("[NoticeRepository selectNoticeOne] " + ntsNo);
		return sqlSession.selectOne("noticeMapper.selectNoticeOne", ntsNo);
	}
	// 공지사항 상세조회 시 조회수 증가
	public int increaseViewCount(SqlSessionTemplate sqlSession, int ntsNo) {
		System.out.println("[NoticeRepository increaseViewCount] " + ntsNo);
		return sqlSession.insert("noticeMapper.increaseViewCount", ntsNo);
	}	
	// 공지사항 수정
	public int updNoticeInfo(SqlSessionTemplate sqlSession, Notice nt) {
		System.out.println("[NoticeRepository updNoticeInfo Vo] " + nt);
		return sqlSession.insert("noticeMapper.updNotice", nt);
	}
	// 공지사항 삭제
	public int delNoticeInfo(SqlSessionTemplate sqlSession, Notice nt) {
		System.out.println("[NoticeRepository delNoticeInfo Vo] " + nt);
		return sqlSession.insert("noticeMapper.delNotice", nt);
	}	
	
	
}
