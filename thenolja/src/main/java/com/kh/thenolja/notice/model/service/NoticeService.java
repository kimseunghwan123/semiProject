package com.kh.thenolja.notice.model.service;

import java.util.List;

import com.kh.thenolja.notice.model.vo.Notice;


public interface NoticeService {
	
	// 페이징 처리
	int selectListCount();	
	// 공지사항 조회
	List<Notice> selectNoticelist();
	// 공지사항 등록
	int regNotice(Notice nt);	
	// 공지사항 상세내용 조회
	Notice selectNoticeOne(int ntsNo, String flag);	
	// 공지사항 상세보기 조회 시 viewCount증가
	int increaseViewCount(int ntsNo);	
	// 공지사항 수정
	int updNotice(Notice nt);	
	// 공지사항 삭제
	int delInfo(Notice nt);		 					
	
}
