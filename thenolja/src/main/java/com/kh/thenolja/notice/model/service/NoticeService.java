package com.kh.thenolja.notice.model.service;

import java.util.List;

import com.kh.thenolja.notice.model.vo.Notice;


public interface NoticeService {
	
	int selectListCount();			 				// 페이징 처리
	List<Notice> selectNoticelist(); 				// 공지사항 조회
	int regNotice(Notice nt);		 				// 공지사항 등록
	Notice selectNoticeOne(int ntsNo, String flag);	// 공지사항 상세내용 조회
	int increaseViewCount(int ntsNo);				// 공지사항 상세보기 조회 시 viewCount증가
	int updNotice(Notice nt);		 				// 공지사항 수정
	int delInfo(Notice nt);		 					// 공지사항 삭제
	
}
