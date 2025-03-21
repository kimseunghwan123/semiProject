package com.kh.thenolja.member.model.vo;

import java.sql.Date;

import lombok.Data;


@Data
public class Member {

	//MEM_NO	NUMBER	회원번호
	//MEM_ID	VARCHAR2(12 BYTE)	회원아이디
	//MEM_PWD	VARCHAR2(15 BYTE)   회원비밀번호
	//NICKNAME	VARCHAR2(30 BYTE)	닉네임
	//BORN_DATE	VARCHAR2(8 BYTE)	생년월일
	//EMAIL	VARCHAR2(30 BYTE)		이메일
	//DELETE_YN	CHAR(1 BYTE)	       회원상태
	//JOIN_DATE	DATE				가입일
	
	private int memNo;
	private String memName;
	private String memPhone;
	private String memId;
	private String memPwd;
	private String nickName;
	private String bornDate;
	private  String Email;
	private String deleteYn;
	private Date joinDate;
	private String memStatus;

	
	
}
