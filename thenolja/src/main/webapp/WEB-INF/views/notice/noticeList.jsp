<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>더놀자 > 공지사항 > 목록</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>

.outer{
	width : 1000px;
	height : 800px;
	margin : auto;
}

#btn_reg{
	float:right;
	background-color:#17a2b8;
	margin:5px;
}

.align_center{
	text-align:center;
	margin: 50px;
	padding:50px;
}
.board-basic{
	font-weight:bold;
}

/* 테이블 css */
.table table-hover{
	text-align:center;
}

</style>


</head>
<body>
	<!-- include header.jsp   해당페이지로 인클루드  header페이지 실행 -->
	<jsp:include page="../common/header.jsp"/>
	<br>
	<div class="align_center">
		<h2 class="board-basic">공지사항</h2>
	</div>
 	<br>
 	 <!-- 등록 버튼Start -->
	<a id="btn_reg" class="btn btn-primary" href="notice.regForm" role="button">등록하기</a>
     <!-- 등록 버튼 영역 END -->
     
	<br><br>
	
	
<!-- 비회원 "N"-->	

<%-- 	<c:if test="${ loginMember != null loginMember.getMemStatus().equals("A")}"> 
		<script>
		$("#btn_reg").show();
		</script>
			<script>
			$("#btn_reg").hide();
		</script>
		<c:if test="${ loginMember !=  loginMember.getMemStatus().equals("A")}"></c:if>
		<script>
    		$("#btn_reg").style.display='none';
    	</script>
	</c:if> --%>


	
<!-- 관리자"Y" -->
	<table id="noticelist"	class="table table-hover">
		<thead>
			<tr>
				<th>no.</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
				<th>게시여부</th>
				<th>첨부파일</th>
			</tr>
		</thead>
		<tbody>
             <c:forEach items="${ noticeList }" var="notice">
                        <tr id="tr_notice" class="list">
                            <td>${ notice.noticeNo }</td>
                            <td>${ notice.noticeTitle }</td>
                            <td>${ notice.writer }</td>
                            <td>${ notice.createDate }</td>
                            <td>${ notice.viewCount }</td>
                            <td>${ notice.status }</td>
                            <td>${ notice.filePath }</td>
                        </tr>
           </c:forEach>
		</tbody>
	</table>
	
            <div id="pagingArea">
                <ul class="pagination">
                    
                   <c:choose>
                    
                   	 <c:when test="${ pageInfo.currentPage eq 1}">
                        <li class="page-item disabled"><a class="page-link" href="#">이전</a></li>
                     </c:when>
                     
                   <c:otherwise>
                   		<li><a class="page-link" href="list.board?page=${pageInfo.currentPage - 1} ">이전</a></li>	
                   		<li class="page-item"><a class="page-link" href="#">1</a></li>
 						<li class="page-item"><a class="page-link" href="#">2</a></li>
  						<li class="page-item"><a class="page-link" href="#">3</a></li>
                   </c:otherwise>
                   
                  </c:choose>
                  
                   <c:forEach begin="${ pageInfo.startPage }" end="${ pageInfo.endPage }" var="p">
                   
                      <li class="page-item"><a class="page-link" href="list.board?page=${p}">${p}</a></li>
                      
                    </c:forEach>
                   
                    <li class="page-item"><a class="page-link" href="#">다음</a></li>
                
                </ul>
            </div>	
 <%-- 
	<ul class="pagination">
	  <li class="page-item"><a class="page-link" href="#">이전</a></li>
	  <li class="page-item active"><a class="page-link" href="#">1</a></li>
	  <li class="page-item "><a class="page-link" href="#">2</a></li>
	  <li class="page-item"><a class="page-link" href="#">3</a></li>
	  <li class="page-item"><a class="page-link" href="#">다음</a></li>
	</ul>
--%>
	<script>
	// loginId null 체크
	// 수정화면 진입 (관리자전용URL)
	$('tbody > tr.list').click(function(){
        const noticeNo = $(this).children().eq(0).text();
        location.href= 'selectUpdate.notice?noticeNo=' + noticeNo + '&flag=' + 'Y';
      })
		
       	// 상세화면 진입 (회원전용URL)
       /*    $('tbody > tr.list').click(function(){
           const noticeNo = $(this).children().eq(0).text();
           location.href= 'selectUpdate.notice?noticeNo=' + noticeNo + '&flag=' + 'N';
        });   */
	
	</script>	 
	 
</body>
</html>