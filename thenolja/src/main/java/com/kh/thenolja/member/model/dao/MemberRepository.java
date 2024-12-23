package com.kh.thenolja.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.thenolja.member.model.vo.Member;

@Repository
public class MemberRepository {

	
	public Member login(SqlSessionTemplate sqlSession, Member member) {
		System.out.println("repository잘나온다");
		return sqlSession.selectOne("memberMapper.login", member);
	}
	public int insert(SqlSessionTemplate sqlSession, Member member) {
		return sqlSession.insert("memberMapper.insert", member);
	}
	public int update(SqlSessionTemplate sqlSession, Member member) {
		return sqlSession.update("memberMapper.update", member);
	}
	public int delete(SqlSessionTemplate sqlSession, Member member) {
		return sqlSession.update("memberMapper.delete", member);
	}
	
	
	
	
}
