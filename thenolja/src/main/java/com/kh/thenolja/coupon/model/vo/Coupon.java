package com.kh.thenolja.coupon.model.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Coupon {

	
	private int couponNo;			// 쿠폰 번호
	private String couponContent;	// 쿠폰 내용	
	private String couponDate;		//	쿠폰 발행일
	private String couponYn;		//	쿠폰 상태여부
	private String couponCateCd;	// 쿠폰 카테고리 코드
	private String couponCateNm;	// 쿠폰 카테고리명
	private String couponCode;		//쿠폰 코드	
	private int couponPercent;		// 할인율
	private String writer;			//작성자
	private int writerNo;			//작상자번호
	private Date createDate;		//작성날짜
	
	
	
	
	
	
	
	
	
}
