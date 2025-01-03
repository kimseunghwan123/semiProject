package com.kh.thenolja.coupon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.thenolja.coupon.model.service.CouponService;
import com.kh.thenolja.coupon.model.vo.Coupon;

@Controller
public class CouponController {

	
	@Autowired
	CouponService coupoSvc;
	
	/*쿠폰  목록 조회*/
	@RequestMapping("coupon.list")
	public String couponList(@RequestParam(value="page", defaultValue="1")
	  int page, Model model) {

	System.out.println("[CouponListController couponlist]");
	// ## TO DO : 공지사항 리스트 조회	
	
	// 페이징 처리  
	//PageInfo pi = Pagination.getPageInfo(coupoSvc.selectListCount(), page, 10, 5);	
	
	
	List<Coupon> couponlist = new ArrayList<Coupon>(); 
	
	// 3. List변수에 결과를 담아줌.
	//noticelist = notiSvc.selectNoticelist(pi);
	couponlist = coupoSvc.selectCouponlist();
	
	// 4. Model에 결과를 담아서 보내줘야 view(jsp)에서 변수로 활용할 수 있음.
	model.addAttribute("couponList", couponlist);
	//model.addAttribute("pageInfo",pi);
	
	return "coupon/couponList";  
	
	}
	
	

	
	
	
	
	
	
	
}
