/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-12-31 08:57:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.coupon;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class couponList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1717224129673L));
    _jspx_dependants.put("/WEB-INF/views/coupon/../common/footer.jsp", Long.valueOf(1717224129679L));
    _jspx_dependants.put("jar:file:/C:/semiproject/thenolja/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

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
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>더놀자 > 쿠폰 > 목록</title>\r\n");
      out.write(" <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("\r\n");
      out.write("div{\r\n");
      out.write("  box-sizing : border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#wrap{\r\n");
      out.write("  width: 1200px;\r\n");
      out.write("  height: 1200px;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#wrap > div{\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header, #footer {\r\n");
      out.write("   height: 15%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content{\r\n");
      out.write("   height: 70%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content_1{\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   height : 100%;\r\n");
      out.write("}\r\n");
      out.write("        \r\n");
      out.write("#footer{\r\n");
      out.write("	height: 15%;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content_1{\r\n");
      out.write("	/*width: 1200px;*/\r\n");
      out.write("	/*margin : auto;*/\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body, ul, li, strong, p{\r\n");
      out.write("	border: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	color: inherit;\r\n");
      out.write("	font-size: inherit;\r\n");
      out.write("	line-height: inherit;\r\n");
      out.write("	vertical-align: top; \r\n");
      out.write("}\r\n");
      out.write("/* 카테고리 영역 layout 기준 START */\r\n");
      out.write(".thumb-list coupon{\r\n");
      out.write("padding-left: 25%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".align_center{\r\n");
      out.write("	padding-left:42%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-area{\r\n");
      out.write("	margin-top:60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".coupon-cate{\r\n");
      out.write("    width: 150px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    display: table-cell;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(".coupon-cate > a{\r\n");
      out.write("      display: block;\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      height: 100%;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("      color: black;\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("      font-size: 20px;\r\n");
      out.write("      line-height: 50px;\r\n");
      out.write("      \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".coupon-cate-item{ \r\n");
      out.write("	 border-bottom: 4px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".coupon-cate > a:hover{\r\n");
      out.write("    font-size: 19px;\r\n");
      out.write("    color: #17a2b8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".outer{\r\n");
      out.write("	display : inline-table;\r\n");
      out.write("  	width  : 1200px;\r\n");
      out.write("  	height : 600px;\r\n");
      out.write("  	margin : auto;\r\n");
      out.write("  	border :  1px ridge;\r\n");
      out.write("  	text-align:center;\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("/* 카테고리 영역 layout 기준 START */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* 이벤트 게시판 layout START */\r\n");
      out.write(".thumb-list{\r\n");
      out.write("	position:relative;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-wrap: wrap;		/* 이미지 일정하게 내리기 */\r\n");
      out.write("	list-style-type: none;	/* li태그 점 없애기 */\r\n");
      out.write("	padding-left:95px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".thunmb-list li{	\r\n");
      out.write("	width:440px;\r\n");
      out.write("	float:left;\r\n");
      out.write("	position:relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".thumb-list.coupon li .txt-box .title {\r\n");
      out.write("    margin-top: 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".thumb-list li .txt-box .title {\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    display: block;\r\n");
      out.write("    color: #1a1d1d;\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    line-height: 35px;\r\n");
      out.write("    text-overflow: ellipsis;\r\n");
      out.write("    white-space: nowrap;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".thumb-list.coupon li .img-box {\r\n");
      out.write("   width: 380px;\r\n");
      out.write("   height: 170px;\r\n");
      out.write("   border-radius: 16px;\r\n");
      out.write("   overflow: hidden;\r\n");
      out.write("   background-color: #ededed;\r\n");
      out.write("   margin: 50px 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 게시판 이미지 크기 등 설정 */\r\n");
      out.write(".thumb-list li .img-box img {\r\n");
      out.write("    /* width: 100%; */\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    object-fit: cover;\r\n");
      out.write("    transform:scale(1);\r\n");
      out.write("    transition: all 0.5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".thumb-list li .txt-box {\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".thumb-list.coupon li .txt-box .category-box {\r\n");
      out.write("    display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* svg css적용 */\r\n");
      out.write(".svg-icon-wrapper{\r\n");
      out.write("	float:left;\r\n");
      out.write("    /* width: 100px; */\r\n");
      out.write("    margin-top: 50px;	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".svg-item{\r\n");
      out.write("	position: relative;\r\n");
      out.write("	height:30px;\r\n");
      out.write("	width:70px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 쿠폰 컨텐트(제목) css적용 */\r\n");
      out.write(".coupon-contents{\r\n");
      out.write("	margin-right:13%;\r\n");
      out.write("	font-family: NotoSansKR, '맑은고딕', Malgun Gothic, dotum, '돋음', arial, sans-serif;\r\n");
      out.write("	font-weight: revert;	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 쿠폰 사용기한 css적용 */\r\n");
      out.write(".coupon-use-date{\r\n");
      out.write("	display: block;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    margin-left: 260px;\r\n");
      out.write("    margin-top:75px;\r\n");
      out.write("    font-size: 13px;	/* 폰트사이즈 */\r\n");
      out.write("    font-weight:bolder;	/* 폰트굵기 */\r\n");
      out.write("    opacity:0.7; 		/* 글씨 투명도 조절 */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 정렬 selectbox css적용 */\r\n");
      out.write(".coupon-list-order-item{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    float: right;\r\n");
      out.write("    margin: 60px;	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".coupon-list-order-item-selectbox{\r\n");
      out.write("    border-radius: 50px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    font-size: 13px;\r\n");
      out.write("    width: 74px;\r\n");
      out.write("    font-weight: bolder;	\r\n");
      out.write("}\r\n");
      out.write(".nav-area{\r\n");
      out.write("	margin-right: 8%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"content_1\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- 쿠폰발행 컨텐츠 전체 영역 START -->\r\n");
      out.write("    <div class=\"\" style=\"margin-left:100px;\">\r\n");
      out.write("	    <!-- 카테고리 메뉴영역 START -->\r\n");
      out.write("		<div class=\"nav-area\" align=\"center\">\r\n");
      out.write("		    <div class=\"coupon-cate\"><a class=\"coupon-cate-item\" href=\"#\" style=\"width: 85px;\">모텔</a></div>\r\n");
      out.write("		    <div class=\"coupon-cate\"><a class=\"coupon-cate-item\" href=\"#\" style=\"width: 85px;\">호텔</a></div>\r\n");
      out.write("		    <div class=\"coupon-cate\"><a class=\"coupon-cate-item\" href=\"#\" style=\"width: 85px;\">글램핑</a></div>\r\n");
      out.write("		 	<div class=\"coupon-cate\"><a class=\"coupon-cate-item\" href=\"#\" style=\"width: 85px;\">팬션</a></div> \r\n");
      out.write("		 	<div class=\"coupon-cate\"><a class=\"coupon-cate-item\" href=\"#\" style=\"width: 85px;\">카라반</a></div> \r\n");
      out.write("	 	</div>\r\n");
      out.write("	 	<!-- 카테고리 메뉴영역 END -->\r\n");
      out.write("	 	\r\n");
      out.write("	 ");
      out.write("\r\n");
      out.write("	 	\r\n");
      out.write("	  	<!-- 페이징영역 START -->\r\n");
      out.write(" 	");
      out.write("\r\n");
      out.write("	  <!-- 페이징영역 END -->	 	\r\n");
      out.write("	 	\r\n");
      out.write("	 	<!-- 쿠폰컨텐츠 영역 END -->\r\n");
      out.write("	 	\r\n");
      out.write("	 </div>\r\n");
      out.write("	<!-- 실제 구현 시 반복할 부분 END -->\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <style>\r\n");
      out.write("	\r\n");
      out.write("		#footer {\r\n");
      out.write("			margin:300px;\r\n");
      out.write("            /* width: 1200px; */\r\n");
      out.write("            height: 180px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        #footer > div{\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #footer_2{\r\n");
      out.write("            height: 40%;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding-top: 40px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #footer_3{\r\n");
      out.write("            height: 60%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #footer_2 > a{\r\n");
      out.write("            text-decoration : none;\r\n");
      out.write("            color: black;\r\n");
      out.write("            margin: 15px;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #footer_3 > p {\r\n");
      out.write("            font-size: 13px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #footer_2 > a:hover{\r\n");
      out.write("            color:rgb(70, 149, 151);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"footer_2\">\r\n");
      out.write("            <a href=\"#\">개인정보보호정책</a> |\r\n");
      out.write("            <a href=\"#\">이용약관</a> |\r\n");
      out.write("            <a href=\"#\">청소년보호정책</a> |\r\n");
      out.write("            ©2024 TheNolJa\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"footer_3\">\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("                (주)더놀자\r\n");
      out.write("\r\n");
      out.write("                주소 : 서울특별시 중구 남대문로 120 그레이츠 청계(구 대일빌딩) 2F <br>\r\n");
      out.write("                대표이사 : 승환K | 책임자 : 승환K ｜  개인정보관리책임자 : 승환K <br>\r\n");
      out.write("                전자우편주소 : help@thenolja.kr | 전화번호 : 1544-9970 \r\n");
      out.write("\r\n");
      out.write("            </p>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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