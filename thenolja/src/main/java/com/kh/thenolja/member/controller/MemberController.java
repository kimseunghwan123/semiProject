package com.kh.thenolja.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.thenolja.member.model.service.MemberService;
import com.kh.thenolja.member.model.vo.Member;

@Controller
public class MemberController {

	
	@Autowired
	private MemberService memberService;
	
	/*
	 * 로그인 
	 * 
	 * 
	 * 
	 * */
	@RequestMapping("login.member")
	public ModelAndView login(Member member, HttpSession session, ModelAndView mv) {
		System.out.println("param : " + member);
		Member loginMember = memberService.login(member);
		System.out.println("loginMember : " + loginMember);
		if(loginMember != null) {
		session.setAttribute("loginMember", loginMember);
		mv.setViewName("main");
		System.out.println("membercontroller잘나오니?");
		System.out.println(loginMember);
		}else {
		mv.addObject("errorMsg", "로그인 실패했습니다.").setViewName("common/errorPage");	
			
		}
		
		return mv;
	}
	
	/*
	 * 로그인 폼
	 * 
	 * */
//	@RequestMapping("loginForm.member")	
//	public String loginForm(Member member) {
//		System.out.println("login controller화면 잘나온다");
//		return "member/memberLoginForm";
//	}
//	
	/***
	 * 마이페이지
	 * @return
	 */
	@RequestMapping("mypage.member")
	public String myPage() {
		// /WEB-INF/views/member/myPage.jsp
		System.out.println("마이페이지 controller 잘나온다");
		return "member/myPage";
	}
	
	/***
	 * 수정
	 * @param member
	 * @param mv
	 * @param session
	 * @return
	 */
	@RequestMapping("update.member")
	public ModelAndView handleUpdateRequest(/*@ModelAttribute*/ Member member, ModelAndView mv, HttpSession session) {
		if(memberService.update(member) > 0) {
			session.setAttribute("alertMsg", "정보 수정 성공");
			session.setAttribute("loginMember", memberService.login(member));
			mv.setViewName("redirect:mypage.member");
		} else {
			mv.addObject("errorMsg", "정보 수정 실패..").setViewName("common/errorPage");
		}
		return mv;
	}
	/***
	 * 로그아웃
	 * @param session
	 * @return
	 */
	@RequestMapping("logout.member")
	public String logout(HttpSession session) {
		session.removeAttribute("loginMember");
		return "common/header";
	}
	
	
	/***
	 * 회원가입 폼
	 * @return
	 */
	@RequestMapping("enrollForm.member")
	public String enrollForm() {
		System.out.println("enrollForm controller 잘나온다");
		return "member/memberEnrollForm";
	}
	
	
	/***
	 * 회원가입
	 * @param member
	 * @param mv
	 * @param session
	 * @return
	 */
	@RequestMapping("insert.member")
	public ModelAndView insertMember(Member member, ModelAndView mv, HttpSession session) {
	
		if(memberService.insert(member) > 0) {
			session.setAttribute("alertMsg", "가입 성공");
			mv.setViewName("redirect:/");
		} else {
			mv.addObject("errorMsg", "회원가입 실패했습니다.").setViewName("common/errorPage");
		}
		return mv;
	}
	
	
	
	/*
	 * 아이디 중복 체크
	 * 
	 * 
	 * */
	@RequestMapping("idCheck.do")
		public ModelAndView idCheck(Member member,ModelAndView mv, HttpSession session ) {
		System.out.println("아이디 중복 체크 controller 잘나온다");		
		
		if(memberService.idCheck(member) > 0) {
			session.setAttribute("idCheck()", "아이디 중복체크 성공" );
			mv.setViewName("redirect:/");
		} else {
			mv.addObject("errorMsg", "중복체크 실패했습니다.").setViewName("common/errorPage");
		}
		return mv;
		}
	
	
	/*
	 *	비밀번호 중복체크 
	 * 
	 * 
	 * */
	
	
	/*
	 * 닉네임 중복체크	
	 * 
	 * 
	 * */
	@RequestMapping("nickNameCheck.do")
	public ModelAndView nickNameCheck(Member member, ModelAndView mv, HttpSession session ) {
		System.out.println("닉네임 중복 체크 controller 잘나온다");
		
		if(memberService.nickNameCheck(member) > 0) {
			session.setAttribute("nickNameCheck()", "닉네임 중복체크 성공");
		}else {
			mv.addObject("errorMsg", "중복체크 실패했습니다.").setViewName("common/errorPage");
		}
		
		return mv;
	}
	
	
	
	/*
	 * 이메일 중복체크	
	 * 
	 * 
	 * */
	
	@RequestMapping("emailCheck.do")
	public ModelAndView emailCheck(Member member, ModelAndView mv, HttpSession session) {
		System.out.println("이메일 중복체크 controller 잘나온다");
		
		if(memberService.emailCheck(member) > 0) {
			session.setAttribute("emailCheck()", "이메일 중복체크 성공");
		}else {
			mv.addObject("errorMsg", "중복체크 실패했습니다.").setViewName("common/errorPage");
		}
		
		
		return mv;
	}
	
	/****
	 * 삭제
	 * @param userPwd
	 * @param session
	 * @return
	 */
	@RequestMapping("delete.member")
	public String delete(String userPwd, HttpSession session) {
		Member loginMember = (Member)session.getAttribute("loginMember");
		if ( loginMember != null) {
			session.removeAttribute("loginMember");
			session.setAttribute("alertMsg", "회원 탈퇴 성공");
			return "redirect:index.jsp";
		} else {
			session.setAttribute("alertMsg", "회원 탈퇴 실패..");
			return "redirect:mypage.member";
		}
	}
	
	
	
	
}
