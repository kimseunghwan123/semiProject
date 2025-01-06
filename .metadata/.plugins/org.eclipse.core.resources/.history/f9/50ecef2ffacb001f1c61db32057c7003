package com.kh.thenolja.event.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.thenolja.event.model.dao.EventRepository;
import com.kh.thenolja.event.model.vo.Event;
import com.kh.thenolja.notice.model.vo.Notice;



@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public EventRepository eventRepository;
	
	
	
	// 페이징 처리
		@Override
		public int selectListCount() {
			int listCount = 0;
			listCount = eventRepository.selectListCount(sqlSession);
			System.out.println("[NoticeServiceImpl listCount] " + listCount);
			return listCount;
		}
	
	
	//이벤트 목록조회 페이지
	@Override
	public List<Event>selectEventlist(){
		System.out.println("[EventServiceImpl selectEventlist]");
	
		List<Event> list = eventRepository.selectEventlist(sqlSession);
		System.out.println("[EventServiceImpl list결과] ");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		return list;
	
	}
	
	//이벤트 등록페이지
	@Override
	public int regEvent(Event et) {
		
		int regEnt = 0;
		regEnt = eventRepository.regEventInfo(sqlSession, et);
		System.out.println(regEnt);
		return regEnt;
	}
	
	
	
	// 이벤트 상세페이지 조회페이지
	@Override
	public Event selectEventOne(int etsNo, String flag) {
		
		System.out.println("selectEventOne In EventServiceImpl : " + etsNo);
		Event ets = new Event();
		
		// 상세페이지 조회인 경우에만 viewCount 증가 시켜줘야 함
		if("N".equals(flag)) {
			int vwCountEnt = 0;
			// viewCount 증가
			vwCountEnt = this.increaseViewCount(etsNo);
		}
		
		ets = eventRepository.selectEventOne(sqlSession, etsNo);
		System.out.println(ets);
		return ets;
	}
	
	// 공지사항 접속시 조회 수 증가 기능
		@Override
		public int increaseViewCount(int ntsNo) {
			int updVwCount = 0;
			updVwCount = eventRepository.increaseViewCount(sqlSession, ntsNo);
			return updVwCount;
		}
	
	
	//이벤트 수정페이지
	@Override
	public int updEvent(Event et) {
		
		int updEet = 0;
		updEet = eventRepository.updEventInfo(sqlSession, et);
		System.out.println(updEet);
		return updEet;
	}
	//이벤트 삭제
	@Override
	public int delInfo(Event et) {
		
		int delEet = 0;
		delEet = eventRepository.delEventInfo(sqlSession, et);
		System.out.println(delEet);
		return delEet;
	}
	
	
}
