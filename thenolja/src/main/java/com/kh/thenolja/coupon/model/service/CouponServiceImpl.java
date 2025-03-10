package com.kh.thenolja.coupon.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.thenolja.coupon.model.dao.CouponRepository;
import com.kh.thenolja.coupon.model.vo.Coupon;

@Service
public class CouponServiceImpl implements CouponService {

	
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Autowired
	private CouponRepository couponRepository;
	
	
	// 쿠폰 리스트 조회
	@Override
	public List<Coupon> selectCouponlist(){
		System.out.println("[CouponServiceImpl selectCouponlist]");
		
		
		List<Coupon> list = couponRepository.selectCouponlist(sqlSession);
		System.out.println("[CouponServiceImpl list결과] ");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		return list;
		
	}
	

	
	
	
	
	
}
