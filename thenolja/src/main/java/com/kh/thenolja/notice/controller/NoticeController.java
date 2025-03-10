package com.kh.thenolja.notice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.thenolja.notice.model.service.NoticeService;
import com.kh.thenolja.notice.model.vo.Notice;

@Controller
public class NoticeController {

	@Autowired
	NoticeService notiSvc;
	
	
    /* 공지사항 목록 조회 */
	@RequestMapping("notice.list")
	public String noticeList(@RequestParam(value="page", defaultValue="1")
							  int page, Model model) {
		
		System.out.println("[NoticeController noticelist]");
		// ## TO DO : 공지사항 리스트 조회	

		// 페이징 처리  
		//PageInfo pi = Pagination.getPageInfo(notiSvc.selectListCount(), page, 10, 5);	
		
		
		List<Notice> noticelist = new ArrayList<Notice>(); 
		
		// 3. List변수에 결과를 담아줌.
		//noticelist = notiSvc.selectNoticelist(pi);
		noticelist = notiSvc.selectNoticelist();
		
		// 4. Model에 결과를 담아서 보내줘야 view(jsp)에서 변수로 활용할 수 있음.
		model.addAttribute("noticeList", noticelist);
		//model.addAttribute("pageInfo",pi);
		
		return "notice/noticeList";  
	}
	
	/* 공지사항 등록페이지로 이동 */ 
	@RequestMapping("notice.regForm")
	public String noticeRegForm() {
		return "notice/noticeReg";
	}
	
	/* 공지사항 신규 등록하기 */
	@RequestMapping("notice.regInfo")
	public String noticeRegInfo(Notice nt, Model model) {
		System.out.println("[Noticecontroller noticeRegInfo]");
		System.out.println(nt);
		
		
		int regCnt = 0;
		// 공지사항 등록
		regCnt = notiSvc.regNotice(nt);
		System.out.println(regCnt);
		
		if(regCnt > 0) {
			model.addAttribute("res", "SUCCESS"); // (String name,Object value)
			return "redirect:notice.list";
		}else {
			model.addAttribute("errorMsg", "게시글 등록 중 오류가 발생하였습니다.");
			return "common/errorPage";
		}
		
	}
	
	/* 공지사항 상세내용 조회 (수정, 상세페이지 공통)*/
	@RequestMapping("selectUpdate.notice")
	public String noticeUpdForm(@RequestParam("noticeNo") int noticeNo, 
								@RequestParam("flag") String flag,
								Model modle) {
		System.out.println("[NoticeController noticeUpdForm noticeNo, flag] " 
								+ noticeNo + ", " + flag);

		String redirectUrl = "";
		Notice nts = new Notice();
		nts = notiSvc.selectNoticeOne(noticeNo, flag);
		
		// 수정, 상세페이지에서 조회내용 보여줄 때 사용할 모델명
		modle.addAttribute("noticeOne", nts);
		
		// "noticeList.jsp에서 파라미터로 넘겨준 flag값이 Y이면 수정페이지, N이면 상세페이지로 redirect해줌.
		if("Y".equals(flag)) {
			redirectUrl = "notice/noticeUpd";
		}else {
			redirectUrl = "notice/noticeDetail";
		}
		
		
		return redirectUrl;
	}
	
	
	
	
	/* 수정 되는데 첨부파일 부분 수정 보안 필요*/
	/* 공지사항 수정하기 */
	@RequestMapping("notice.updInfo")
	public String noticeUpdInfo(Notice nt, Model model) {
		System.out.println("[Noticecontroller noticeUpdInfo]");
		System.out.println(nt);
		
		int updCnt = 0;
		// 공지사항 수정
		updCnt = notiSvc.updNotice(nt);
		System.out.println(updCnt);
		
		if(updCnt > 0) {
			model.addAttribute("res", "SUCCESS");
			return "redirect:notice.list";
		}else {
			model.addAttribute("errorMsg", "게시글 수정중 오류가 발생하였습니다.");
			return "common/errorPage";
		}
		
	}
	
	/* 공지사항 삭제 */
	@RequestMapping("notice.delInfo")
	public String noticeDelInfo(Notice nt, Model model) {
		System.out.println("[Noticecontroller noticeDelInfo]");
		System.out.println(nt);
		
		int delCnt = 0;
		// 공지사항 삭제
		delCnt = notiSvc.delInfo(nt);
		System.out.println(delCnt);
		
		if(delCnt > 0) {
			model.addAttribute("res", "SUCCESS");
			return "redirect:notice.list";
		}else {
			model.addAttribute("errorMsg", "게시글 삭제중 오류가 발생하였습니다.");
			return "common/errorPage";
		}
		
	}	
}
