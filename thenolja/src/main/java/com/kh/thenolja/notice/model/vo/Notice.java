package com.kh.thenolja.notice.model.vo;

import lombok.Data;


@Data
public class Notice {
	
	private int noticeNo;               // 공지사항 번호
	private String noticeTitle;    // 공지사항 제목
	private String noticeContent;  // 공지사항 내용
	private String createDate;   // 작성날짜
	private String status;      // 작성자 상태여부
	private int writerNo;		// 작성자
	private String writer; 	   // 상세화면 조회 시 작성자명
	private int viewCount;	   // 조회 수 증가
	private String flag;	   // 상세페이지, 수정페이지 구분 값
	private String currentPage; //페이징처리 현재 페이지 번호
	private String startPage;   //페이징처리 시작 페이지 번호
	private String endPage;     //페이징처리 끝 페이지 번호
	private String filePath;    // 첨부파일   >> 경로 resources/hotelImage/beach_hotel01.jpg
	
}
