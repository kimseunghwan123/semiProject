package com.kh.thenolja.notice.model.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.thenolja.notice.model.dao.NoticeRepository;
import com.kh.thenolja.notice.model.vo.Notice;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private NoticeRepository noticeRepository;
	
	// 페이징 처리
	@Override
	public int selectListCount() {
		int listCount = 0;
		listCount = noticeRepository.selectListCount(sqlSession);
		System.out.println("[NoticeServiceImpl listCount] " + listCount);
		return listCount;
	}
	
	// 공지사항 리스트 기능
	@Override
	public List<Notice> selectNoticelist(){
		System.out.println("[NoticeServiceImpl selectNoticelist]");
		
		// 페이징 처리
		//int offset =(pi.getCurrentPage() - 1) * pi.getBoardLimit();
		//RowBounds rowBounds = new RowBounds(offset,pi.getBoardLimit());
		
		List<Notice> list = noticeRepository.selectNoticelist(sqlSession);
		System.out.println("[NoticeServiceImpl list결과] ");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		return list;
	}
	
	// 공지사항 등록 기능
	@Override
	public int regNotice(Notice nt) {
		
		int regCnt = 0;
		regCnt = noticeRepository.regNoticeInfo(sqlSession, nt);
		System.out.println(regCnt);
		return regCnt;
	}
	
	// 공지사항 상세내용 조회
	@Override
	public Notice selectNoticeOne(int ntsNo, String flag) {
		
		System.out.println("selectNoticeOne In NoticeServiceImpl : " + ntsNo);
		Notice nts = new Notice();
		
		// 상세페이지 조회인 경우에만 viewCount 증가 시켜줘야 함
		if("N".equals(flag)) {
			int vwCountCnt = 0;
			// viewCount 증가
			vwCountCnt = this.increaseViewCount(ntsNo);
		}
		
		nts = noticeRepository.selectNoticeOne(sqlSession, ntsNo);
		System.out.println(nts);
		return nts;
	}
	// 공지사항 접속시 조회 수 증가 기능
	@Override
	public int increaseViewCount(int ntsNo) {
		int updVwCount = 0;
		updVwCount = noticeRepository.increaseViewCount(sqlSession, ntsNo);
		return updVwCount;
	}
	// 공지사항 수정 기능 
	@Override
	public int updNotice(Notice nt) {
		
		int updCnt = 0;
		updCnt = noticeRepository.updNoticeInfo(sqlSession, nt);
		System.out.println(updCnt);
		return updCnt;
	}
	// 공지사항 삭제 기능
	@Override
	public int delInfo(Notice nt) {
		
		int delCnt = 0;
		delCnt = noticeRepository.delNoticeInfo(sqlSession, nt);
		System.out.println(delCnt);
		return delCnt;
	}
	

	
	
	
	
}
