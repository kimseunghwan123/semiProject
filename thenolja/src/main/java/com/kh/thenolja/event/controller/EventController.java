package com.kh.thenolja.event.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.thenolja.event.model.service.EventService;
import com.kh.thenolja.event.model.vo.Event;
import com.kh.thenolja.notice.model.vo.Notice;

@Controller
public class EventController {

	
	@Autowired
	EventService eventSvc;
	
	
    /* 이벤트목록 조회 */
	@RequestMapping("event.list")
	public String eventList(@RequestParam(value="page", defaultValue="1")
							  int page, Model model) {
		
		System.out.println("[EventController eventlist]");
		// ## TO DO : 이벤트 리스트 조회	
		
		List<Event> eventlist = new ArrayList<Event>(); 
		
		// 3. Event변수에 결과를 담아줌.
		//eventlist = eventSvc.selectEventlist(pi);
		eventlist = eventSvc.selectEventlist();
		
		// 4. Model에 결과를 담아서 보내줘야 view(jsp)에서 변수로 활용할 수 있음.
		model.addAttribute("eventList", eventlist);
		//model.addAttribute("pageInfo",pi);
		
		return "event/eventList";
	
	}
	/*등록해결25.1.2/
	/* 이벤트 등록페이지로 이동 */
	@RequestMapping("event.regForm")
	public String eventRegForm() {
		return "event/eventReg";
	}
	
	/* 이벤트 신규 등록하기 */
	@RequestMapping("event.regInfo")
	public String eventRegInfo(Event et, Model model) {
		System.out.println("[Eventcontroller eventRegInfo]");
		System.out.println(et);
		
		int regEnt = 0;
		// 이벤트   등록
		regEnt = eventSvc.regEvent(et);
		System.out.println(regEnt);
		
		if(regEnt > 0) {
			model.addAttribute("res", "SUCCESS");
			return "redirect:event.list";
		}else {
			model.addAttribute("errorMsg", "게시글 등록 중 오류가 발생하였습니다.");
			return "common/errorPage";
		}
		
	}
	/*25.1.2 해결*/
	/* 이벤트 상세내용 조회 (수정, 상세페이지 공통)*/
	@RequestMapping("selectUpdate.event")
	public String eventUpdForm(@RequestParam("eventNo") int eventNo, 
								@RequestParam("flag") String flag,
								Model modle) {
		System.out.println("[EventController eventUpdForm eventNo, flag] " 
								+ eventNo + ", " + flag);

		String redirectUrl = "";
		Event ets = new Event();
		ets = eventSvc.selectEventOne(eventNo, flag);
		
		// 수정, 상세페이지에서 조회내용 보여줄 때 사용할 모델명
		modle.addAttribute("eventOne", ets);
		
		// "noticeList.jsp에서 파라미터로 넘겨준 flag값이 Y이면 수정페이지, N이면 상세페이지로 redirect해줌.
		if("Y".equals(flag)) {
			redirectUrl = "event/eventUpd";
		}else {
			redirectUrl = "event/eventDetail";
		}
		
		
		return redirectUrl;
	}
	/*수정,삭제 해결되지않음*/
	/* 이벤트 수정하기 */
	@RequestMapping("event.updInfo")
	public String eventUpdInfo(Event et, Model model) {
		System.out.println("[Eventcontroller eventUpdInfo]");
		System.out.println(et);
		
		int updEnt = 0;
		// 이벤트 수정
		updEnt = eventSvc.updEvent(et);
		System.out.println(updEnt);
		
		if(updEnt > 0) {
			model.addAttribute("res", "SUCCESS");
			return "redirect:event.list";
		}else {
			model.addAttribute("errorMsg", "게시글 수정중 오류가 발생하였습니다.");
			return "common/errorPage";
		}
		
	}
	/* 이벤트 삭제 */
	@RequestMapping("event.delInfo")
	public String eventDelInfo(Event et, Model model) {
		System.out.println("[Eventcontroller eventDelInfo]");
		System.out.println(et);
		
		int delEnt = 0;
		// 이벤트 삭제
		delEnt = eventSvc.delInfo(et);
		System.out.println(delEnt);
		
		if(delEnt > 0) {
			model.addAttribute("res", "SUCCESS");
			return "redirect:event.list";
		}else {
			model.addAttribute("errorMsg", "게시글 삭제중 오류가 발생하였습니다.");
			return "common/errorPage";
		}
		
	}	
	
}
