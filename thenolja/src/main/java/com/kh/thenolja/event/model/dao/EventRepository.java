package com.kh.thenolja.event.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.thenolja.event.model.vo.Event;
import com.kh.thenolja.notice.model.vo.Notice;

@Repository
public class EventRepository {

	
	// 게시글 전체 리스트 카운트 조회
		public int selectListCount(SqlSessionTemplate sqlSession) {
			return sqlSession.selectOne("eventMapper.selectListCount");
		}	
	
	// 이벤트 목록 조회 페이지
	public List<Event>selectEventlist(SqlSessionTemplate sqlSession){
		System.out.println("[NoticeRepository selectEventlist ");
//		System.out.println("[NoticeRepository rowBounds] " + rowBounds.getOffset());
//		System.out.println("[NoticeRepository rowBounds] " + rowBounds.getLimit());
		return sqlSession.selectList("eventMapper.selectEventlist");
	}
	// 이벤트 등록 페이지
	public int regEventInfo(SqlSessionTemplate sqlSession, Event et) {
		System.out.println("[EventRepository regEventInfo] " + et);
		return sqlSession.insert("eventMapper.regEvent", et);
	}
	// 이벤트 상세조회 페이지
		public Event selectEventOne(SqlSessionTemplate sqlSession, int etsNo) {
			System.out.println("[EventRepository selectEventOne] " + etsNo);
			return sqlSession.selectOne("eventMapper.selectEventOne", etsNo);
		}
		
		// 공지사항 상세조회 시 조회수 증가
		public int increaseViewCount(SqlSessionTemplate sqlSession, int ntsNo) {
			System.out.println("[EventRepository increaseViewCount] " + ntsNo);
			return sqlSession.insert("eventMapper.increaseViewCount", ntsNo);
		}	
		
		// 이벤트 수정
		public int updEventInfo(SqlSessionTemplate sqlSession, Event et) {
			System.out.println("[EventRepository updEventInfo Vo] " + et);
			return sqlSession.insert("eventMapper.updEvent", et);
		}
		// 이벤트 삭제
		public int delEventInfo(SqlSessionTemplate sqlSession, Event et) {
			System.out.println("[EventRepository delEventInfo Vo] " + et);
			return sqlSession.insert("eventMapper.delEvent", et);
		}
	
	
}
