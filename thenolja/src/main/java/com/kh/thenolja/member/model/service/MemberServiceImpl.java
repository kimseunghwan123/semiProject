package com.kh.thenolja.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.thenolja.member.model.dao.MemberRepository;
import com.kh.thenolja.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService {

	
	
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	// 로그인 기능
	@Override
	public Member login(Member member) {
		System.out.println("login serviceimpl잘나온다");
		return memberRepository.login(sqlSession, member);
	}
	//회원가입 기능
	@Override
	public int insert(Member member) {
		System.out.println("insert serviceImpl 잘나온다");
		return memberRepository.insert(sqlSession, member);
	}
	
	//아이디 중복체크 기능
	public int idCheck(Member member) {
		System.out.println("idCheck serviceImpl 잘나온다");
		return memberRepository.idCheck(sqlSession, member);
	}
	
	// 닉네임 중복체크 기능
	public int nickNameCheck(Member member) {
		System.out.println("nickNameCheck serviceImpl 잘나온다");
		return memberRepository.nickNameCheck(sqlSession, member);
	}
	
	
	// 이메일 중복체크 기능
	public int emailCheck(Member member) {
		System.out.println("emailCheck serviceImpl 잘나온다");
		return memberRepository.emailCheck(sqlSession,member);
	}
	
	
	// 회원 수정 기능
	@Override
	public int update(Member member) {
		System.out.println("update serviceImpl 잘나온다");
		return memberRepository.update(sqlSession, member);
	}
	// 회원 탈퇴 기능
	@Override
	public int delete(Member member) {
		System.out.println("delete serviceImpl 잘나온다");
		return memberRepository.delete(sqlSession, member);
	}
	
	
	
	
	
}
