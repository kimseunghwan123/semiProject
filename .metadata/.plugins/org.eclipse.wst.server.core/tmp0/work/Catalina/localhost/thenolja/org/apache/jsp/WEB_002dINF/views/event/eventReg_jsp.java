/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2025-01-21 08:20:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.event;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eventReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>더놀자 > 이벤트 > 등록</title>\r\n");
      out.write("<style>\r\n");
      out.write("#txtArea_content{\r\n");
      out.write("	width:650px;\r\n");
      out.write("	height:350px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".th_left{\r\n");
      out.write("    width:475px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#spn_textcount{\r\n");
      out.write("	float:right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#td_status_left{\r\n");
      out.write("	float:left;\r\n");
      out.write("	border: 1px solid #17a2b8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#save{\r\n");
      out.write("    background: #17a2b8;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border: 1px solid #17a2b8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#cancel{\r\n");
      out.write("	background:#b6b6b6;\r\n");
      out.write("	border:1px solid #b6b6b6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".radio-btn{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    margin: 5px 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 게시여부 라디오버튼 영역 스타일적용 START */\r\n");
      out.write(".radio-btn-wrap{\r\n");
      out.write("	margin:-5px -4px;\r\n");
      out.write("	float:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio-btn{\r\n");
      out.write("	margin: 5px 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio-btn-wrap .radio-btn input[type=\"radio\"] {\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    width: 0;\r\n");
      out.write("    height: 0;\r\n");
      out.write("    opacity: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio-btn-wrap .radio-btn input[type=\"radio\"]:checked + label{\r\n");
      out.write("    \r\n");
      out.write("    background: #17a2b8;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border: 1px solid #17a2b8;\r\n");
      out.write("    \r\n");
      out.write("    /*background: cadetblue;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border: 1px solid cadetblue;*/\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio-btn-wrap .radio-btn label {\r\n");
      out.write("    display: block;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    padding: 0 15px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    color: #636366;\r\n");
      out.write("    line-height: 38px;\r\n");
      out.write("    border: 1px solid #17a2b8;\r\n");
      out.write("    /*border: 1px solid cadetblue;*/\r\n");
      out.write("    border-radius: 24px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".filebox{\r\n");
      out.write("	margin-top:8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".filebox label {\r\n");
      out.write("	float:left;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    width: 140px;\r\n");
      out.write("    height: 48px;\r\n");
      out.write("    padding: 0 12px;\r\n");
      out.write("    color: #3a3a3d;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    line-height: 48px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    background-color: #9ca0a1;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".filebox input[type=\"file\"] {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    width: 0;\r\n");
      out.write("    height: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    border: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".filebox .upload-name {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    padding: 0 32px 0 12px;\r\n");
      out.write("    background: none;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    border: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"text\"], input[type=\"password\"] {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 48px;\r\n");
      out.write("    padding: 0 16px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    background-color: #fafafa;\r\n");
      out.write("    color: #1a1d1d;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    line-height: 48px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 삭제버튼 */\r\n");
      out.write(".btn-reset {\r\n");
      out.write("    display: none;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 12px;\r\n");
      out.write("    right: 10px;\r\n");
      out.write("    width: 24px;\r\n");
      out.write("    height: 24px;\r\n");
      out.write("    background: url(../images/btn/btn_inp_reset.png) 0 0 no-repeat;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".regc {\r\n");
      out.write("	display : none;\r\n");
      out.write("	float : center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".evnt_inner_inpt{\r\n");
      out.write("    height: 48px;\r\n");
      out.write("    padding: 0 30px 0 16px;\r\n");
      out.write("    border: 1px solid #aeaeb2;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    background-color: #d7d7d7;\r\n");
      out.write("}\r\n");
      out.write("/* 첨부파일 영역 스타일적용 END */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/* 페이지 초기화 > 캘린더 세팅 */\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("	document.getElementById('eventStrt').value = new Date().toISOString().slice(0, 10);\r\n");
      out.write("	document.getElementById('eventEnd').value  = new Date().toISOString().slice(0, 10);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("/************************ \r\n");
      out.write("* 함수설명 : 등록버튼 클릭 이벤트\r\n");
      out.write("*************************/ \r\n");
      out.write("function regEvent(){\r\n");
      out.write("	var inptTitle   = $('#title').val();\r\n");
      out.write("	var inptContent = $('#txtArea_content').val();\r\n");
      out.write("	var chkeventYN   = $('input[name=\"eventYN\"]:checked').val();\r\n");
      out.write("	var inptEventStrtDt = $('#eventStrt').val();\r\n");
      out.write("	var inptEventEndDt  = $('#eventEnd').val();\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	console.log(\"inptTitle \" + inptTitle);\r\n");
      out.write("	console.log(\"inptContent \" + inptContent);\r\n");
      out.write("	console.log(\"chkeventYN \" + chkeventYN);\r\n");
      out.write("	console.log(\"inptEventStrtDt \" + inptEventStrtDt);\r\n");
      out.write("	console.log(\"inptEventEndDt \"  + inptEventEndDt);\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	//유효성 검사 함수 호출\r\n");
      out.write("	if(validation()){\r\n");
      out.write("		// confirm 함수는 확인창 결과값으로 TRUE와 FALSE 값을 RETURN 하게 됨.\r\n");
      out.write("		if(confirm(\"게시글을 등록하시겠습니까?\")){	\r\n");
      out.write("		// 게시글 저장 submission 정보 세팅\r\n");
      out.write("		// data : getParameter 지정 값   : 값\r\n");
      out.write("		var formDoc = $(\"#frm\").serialize();\r\n");
      out.write("		\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			type:\"POST\",\r\n");
      out.write("			url : \"event.regInfo\",\r\n");
      out.write("			data : formDoc,\r\n");
      out.write("			success:function(res){\r\n");
      out.write("					alert(\"이벤트가 정상적으로 등록되었습니다.\");\r\n");
      out.write("					location.href=\"event.list\";\r\n");
      out.write("			\r\n");
      out.write("				},\r\n");
      out.write("				error:function(e){\r\n");
      out.write("					alert(\"이벤트 등록 중 오류가 발생하였습니다.\");\r\n");
      out.write("					return;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("}	\r\n");
      out.write("	\r\n");
      out.write("/********************************* \r\n");
      out.write("* 함수설명 : 이벤트 등록 시 유효성 검사(필수값)\r\n");
      out.write("**********************************/\r\n");
      out.write("function validation(){\r\n");
      out.write("	\r\n");
      out.write("	// 각 필드 필수값 체크\r\n");
      out.write("	var content = $(\"#txtArea_content\").val();\r\n");
      out.write("	\r\n");
      out.write("	var today = new Date();\r\n");
      out.write("	var year    = today.getFullYear().toString();\r\n");
      out.write("	var month   = (\"00\" + (today.getMonth() + 1) ).toString().slice(-2);\r\n");
      out.write("	var day     = (\"00\" + today.getDate()).toString().slice(-2);\r\n");
      out.write("	var fullDay = year + \"-\" + month + \"-\" + day;\r\n");
      out.write("\r\n");
      out.write("	// 이벤트 제목 체크\r\n");
      out.write("	if($(\"#title\").val() == \"\"){ \r\n");
      out.write("		alert(\"제목을 입력하세요.\");\r\n");
      out.write("		$(\"#title\").focus();\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("	// 라디오버튼 (게시여부) 체크여부 확인\r\n");
      out.write("	if( !$('input[name=\"eventYN\"]').is(':checked') ){\r\n");
      out.write("		alert(\"이벤트 진행상태를 선택해주세요.\");\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	// 이벤트 내용 체크\r\n");
      out.write("	if($(\"#txtArea_content\").val() == \"\"){\r\n");
      out.write("		alert(\"이벤트 내용을 입력해주세요.\");\r\n");
      out.write("		$(\"#txtArea_content\").focus();\r\n");
      out.write("		return;\r\n");
      out.write("	}	\r\n");
      out.write("	\r\n");
      out.write("	// 이벤트 제목 글자수 체크\r\n");
      out.write("	if($(\"#title\").val().length > 30){ \r\n");
      out.write("		alert(\"이벤트 제목은 최대 30자까지만 입력 가능합니다.\");\r\n");
      out.write("		$(\"#title\").focus();\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	// 이벤트 내용 글자수 체크\r\n");
      out.write("	if(content.length > 400){\r\n");
      out.write("		$(\"#txtArea_content\").val($(\"#txtArea_content\").val().substring(0, 400));\r\n");
      out.write("		alert(\"이벤트내용은 400자까지만 입력 가능합니다.\");\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	// 이벤트 시작일 체크\r\n");
      out.write("	if($(\"#eventStrt\").val() == \"\"){\r\n");
      out.write("		alert(\"시작날짜를 선택해주세요.\");	\r\n");
      out.write("		$(\"#eventStrt\").focus();\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	// 이벤트 종료일 체크\r\n");
      out.write("	if($(\"#eventEnd\").val() == \"\"){\r\n");
      out.write("		alert(\"종료날짜를 선택해주세요.\");\r\n");
      out.write("		$(\"#eventEnd\").focus();\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	// 이벤트 시작일 종료일 범위 체크\r\n");
      out.write("	if($(\"#eventStrt\").val() > $(\"#eventEnd\").val()){\r\n");
      out.write("		alert(\"시작일은 종료일 보다 이전이어야 합니다.\");\r\n");
      out.write("		$(\"#eventStrt\").focus();\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	// 이벤트 시작일과 종료일은 현재 날짜보다 작을 수 없다\r\n");
      out.write("/* 	if($(\"#eventStrt\").val() < fullDay){\r\n");
      out.write("		alert(\"시작일은 현재날짜 보다 이전일 수 없습니다.\");\r\n");
      out.write("		$(\"#eventStrt\").focus();\r\n");
      out.write("		return;\r\n");
      out.write("	} */\r\n");
      out.write("	\r\n");
      out.write("	return true;\r\n");
      out.write("}	\r\n");
      out.write("	\r\n");
      out.write("/*********************************** \r\n");
      out.write("* 함수설명 : 이벤트 내용 글자 count하는 부분\r\n");
      out.write("************************************/\r\n");
      out.write("function countText(){\r\n");
      out.write("\r\n");
      out.write("	var content = $(\"#txtArea_content\").val();\r\n");
      out.write("	// 글자수 세기\r\n");
      out.write("	if(content.length == 0 || content == ''){\r\n");
      out.write("		$('#spn_textcount').text('0/400');\r\n");
      out.write("	}else{\r\n");
      out.write("		$('#spn_textcount').text(content.length + '/400');\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	// 글자 수 제한\r\n");
      out.write("	if(content.length > 400){\r\n");
      out.write("		$(\"#txtArea_content\").val($(\"#txtArea_content\").val().substring(0, 400));\r\n");
      out.write("		alert(\"이벤트등록은 400자까지만 입력 가능합니다.\");\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("	\r\n");
      out.write("function upload(){\r\n");
      out.write("	//debugger\r\n");
      out.write("	console.log( $(\"#file_110\") );\r\n");
      out.write("	console.log($(\"#file_110\")[0].files[0].name);\r\n");
      out.write("	\r\n");
      out.write("	// 파일명 받기\r\n");
      out.write("	var fileName = \"\";\r\n");
      out.write("	if( typeof $(\"#file_110\")[0] != \"undefined\"){\r\n");
      out.write("		fileName = $(\"#file_110\")[0].files[0].name;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	// 파일명 upload 영역의 fileName_110인 요소에 세팅하기\r\n");
      out.write("	$(\"#fileName_110\").val(fileName);\r\n");
      out.write("	alert(\"첨부파일이 선택되었습니다.\");\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("	\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("	<br>\r\n");
      out.write("	<!-- logo START -->\r\n");
      out.write("		<div id=\"logo\" class=\"logo_main\" align=\"center\"></div>\r\n");
      out.write("	<!-- logo END -->\r\n");
      out.write("	<br>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"align_center\">\r\n");
      out.write("		<h2 class=\"board-basic\">이벤트</h2>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<!-- FORM 영역 START -->\r\n");
      out.write("	<form id=\"frm\" action=\"event.regInfo\" >\r\n");
      out.write("		<table class=\"table-light table-striped text-center\" width=\"100%\">\r\n");
      out.write("			  <tr>\r\n");
      out.write("				 <th class=\"th_left\"><span>이벤트제목</span></th>\r\n");
      out.write("				 <td><input type=\"text\" id=\"title\" name=\"eventTitle\" maxlength=\"26\" style=\"width:650px;\"/></td>\r\n");
      out.write("			  </tr>\r\n");
      out.write("			  \r\n");
      out.write("			  	<!-- 게시여부 영역  STRT -->\r\n");
      out.write("			  <tr>\r\n");
      out.write("           		<th class=\"th_left\"><span>이벤트진행여부</span></th>\r\n");
      out.write("				<td>\r\n");
      out.write("					<div class=\"radio-btn-wrap\" id=\"event_rdo_wrap\">\r\n");
      out.write("						<span class=\"radio-btn\">\r\n");
      out.write("							<input type=\"radio\" id=\"rdo_statusY\" name=\"eventYN\" checked=\"\" value=\"Y\">	\r\n");
      out.write("								<label for=\"rdo_statusY\">진행</label>\r\n");
      out.write("						</span>\r\n");
      out.write("								\r\n");
      out.write("						<span class=\"radio-btn\">	\r\n");
      out.write("							<input type=\"radio\" id=\"rdo_statusN\" name=\"eventYN\" value=\"N\">	\r\n");
      out.write("								<label for=\"rdo_statusN\">종료</label>\r\n");
      out.write("						</span>\r\n");
      out.write("					</div>\r\n");
      out.write("	            </td>\r\n");
      out.write("	           </tr>\r\n");
      out.write("            <!-- 게시여부 영역  END -->\r\n");
      out.write("            \r\n");
      out.write("  		  <!-- 이벤트 내용 -->\r\n");
      out.write(" 		  <tr>\r\n");
      out.write("            <th><span>이벤트 내용</span>	</th>\r\n");
      out.write("            <td>\r\n");
      out.write("                <textarea rows=\"10\" cols=\"30\" id=\"txtArea_content\" name=\"eventContent\" onkeyup=\"countText();\"></textarea>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        <tr>  \r\n");
      out.write("        	<td></td>   \r\n");
      out.write("            <td>\r\n");
      out.write("            	<span id=\"spn_textcount\">0/400</span>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write(" 		<!-- 이벤트 시작일, 종료일 전체영역 START -->\r\n");
      out.write("		<tr id=\"wrap_event\">\r\n");
      out.write("			<th><span>이벤트 기간</span><br><span>(시작일 / 종료일)</span></th>\r\n");
      out.write("				<td>\r\n");
      out.write("					<div class=\"toggle-group\"></div>\r\n");
      out.write("					<div class=\"radio-btn-wrap\" id=\"mixList_205\" style=\"display:none;\">\r\n");
      out.write("						<span class=\"radio-btn\">\r\n");
      out.write("							<label for=\"\">이벤트 기간(이벤트 시작일/종료일)</label>\r\n");
      out.write("						</span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"array-list\" data-attr_item_vlue=\"null\">\r\n");
      out.write("						<!-- 이벤트 시작일 -->\r\n");
      out.write("						<div class=\"item\">\r\n");
      out.write("							<div class=\"select-box bg-gray\" style=\"float:left; margin-right:10px;\">\r\n");
      out.write("								<input type=\"date\" id=\"eventStrt\" class=\"evnt_inner_inpt\" name=\"eventStrtDt\">\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						<!-- 이벤트 종료일 -->\r\n");
      out.write("						<div class=\"item\">\r\n");
      out.write("							<div class=\"select-box bg-gray\" style=\"float:left; margin-right:10px;\">\r\n");
      out.write("								<input type=\"date\" id=\"eventEnd\" class=\"evnt_inner_inpt\" name=\"eventEndDt\">\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("					</div>\r\n");
      out.write("				</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<!-- 이벤트 시작일, 종료일 전체영역 END -->   \r\n");
      out.write("			\r\n");
      out.write("    <!-- 첨부파일 전체영역 START -->         \r\n");
      out.write("		<tr data-attr_seq=\"194\" data-attr_disp_form_cd=\"FD\" data-attr_calc_typ_cd=\"null\" data-attr_mndt_inpt_yn=\"Y\">	\r\n");
      out.write("			<th><span>첨부파일</span></th>	\r\n");
      out.write("			\r\n");
      out.write("			<td>\r\n");
      out.write("				<div class=\"filebox\">	\r\n");
      out.write("					<label for=\"file_110\" tabindex=\"0\">파일선택</label>	\r\n");
      out.write("						<input type=\"file\" id=\"file_110\" name=\"fileUpload\" data-file_id=\"110\" tabindex=\"-1\" onchange=\"upload();\">	\r\n");
      out.write("						<input type=\"hidden\" id=\"apndFileId_110\" data-attr_item_sno=\"\" data-prod_id=\"\">	\r\n");
      out.write("					\r\n");
      out.write("					<!-- 업로드 영역 START -->\r\n");
      out.write("					<div class=\"upload-box\">    \r\n");
      out.write("						<input type=\"text\" id=\"fileName_110\" name=\"eventImg\" class=\"upload-name inp\" placeholder=\"선택된 파일 없음\" title=\"선택된 파일 없음\" readonly=\"\">\r\n");
      out.write("						<button type=\"button\" id=\"fileReset\" class=\"btn-reset\"><span class=\"blind\">삭제</span></button>	\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- 업로드 영역 END -->\r\n");
      out.write("				</div>\r\n");
      out.write("					\r\n");
      out.write("					<ul class=\"list-text interval bullet\">	\r\n");
      out.write("						<!-- <li>허용 파일 형식 : pdf, jpg/jpeg, png, gif, doc/docx, hwp (15MB 미만)</li> -->\r\n");
      out.write("					</ul>	\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr> \r\n");
      out.write("		<!-- 첨부파일 전체영역 END -->                \r\n");
      out.write("  		\r\n");
      out.write(" <!-- \r\n");
      out.write(" 		<h6>이벤트 등록정보</h6>\r\n");
      out.write(" 		관리자명 :admin \r\n");
      out.write(" 		관리자 번호 :  \r\n");
      out.write("		이벤트기간 :  -->\r\n");
      out.write("		\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td colspan=\"2\">\r\n");
      out.write("			<input type=\"button\" id=\"save\"    class=\"btn btn-primary\" value=\"등록\" onclick=\"regEvent();\">\r\n");
      out.write("			<input type=\"button\" id=\"cancel\" class=\"btn btn-primary\" value=\"취소\" onclick=\"history.back();\">\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- form태그 끝 -->	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
