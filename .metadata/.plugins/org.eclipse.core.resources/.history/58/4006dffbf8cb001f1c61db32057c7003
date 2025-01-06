package com.kh.thenolja.event.model.service;

import java.util.List;

import com.kh.thenolja.event.model.vo.Event;
import com.kh.thenolja.notice.model.vo.Notice;

public interface EventService {
	

	// 페이징 처리
	int selectListCount();	
	//이벤트 목록 조회
	List<Event>selectEventlist(); // 이벤트 조회
	//이벤트 등록
	int regEvent(Event et);		 				// 이벤트 등록
	//이벤트 상세조회
	Event selectEventOne(int etsNo, String flag);	// 이벤트 상세내용 조회
	// 이벤트공지사항 상세보기 조회 시 viewCount증가
	int increaseViewCount(int etsNo);
	//이벤트수정
	int updEvent(Event et);   //이벤트 수정
	//이벤트 삭제
	int delInfo(Event et);		 					// 이벤트 삭제



}
