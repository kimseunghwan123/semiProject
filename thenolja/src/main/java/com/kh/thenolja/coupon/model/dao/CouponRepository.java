package com.kh.thenolja.coupon.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.thenolja.coupon.model.vo.Coupon;

@Repository
public class CouponRepository {
		
	
	// 게시글 전체 리스트 카운트 조회
		public int selectListCount(SqlSessionTemplate sqlSession) {
			return sqlSession.selectOne("couponMapper.selectListCount");
		}	
	// 쿠폰 목록 조회
		public List<Coupon>selectCouponlist(SqlSessionTemplate sqlSession){
			System.out.println("[NoticeRepository rowBounds] ");
			return sqlSession.selectList("couponMapper.selectCouponlist");
	}
	
	
	
	
	
	
	
}
