package com.kh.thenolja.event.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.thenolja.event.model.dao.EventRepository;
import com.kh.thenolja.event.model.vo.Event;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public EventRepository eventRepository;
	
	//목록조회
	@Override
	public List<Event>selectEventlist(){
		System.out.println("[EventServiceImpl selectEventlist]");
	
		List<Event> list = eventRepository.selectEventlist(sqlSession);
		System.out.println("[EventServiceImpl list결과] ");
	
	return list;
	
	}
	// 상세페이지
	@Override
	public Event selectEventOne(int etsNo, String flag) {
		
		System.out.println("selectEventOne In EventServiceImpl : " + etsNo);
		Event ets = new Event();
		
		// 상세페이지 조회인 경우에만 viewCount 증가 시켜줘야 함
		if("N".equals(flag)) {
			int vwCountCnt = 0;
			// viewCount 증가
		//	vwCountCnt = this.increaseViewCount(etsNo);
		}
		
	//	ets = eventRepository.selectEventOne(sqlSession, etsNo);
		System.out.println(ets);
		return ets;
	}
	
	
}