<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>더놀자 > 이벤트 > 수정</title>
<style>
#txtArea_content{
	width:650px;
	height:350px;
}

.th_left{
    width:475px;
}

#spn_textcount{
	float:right;
}

#td_status_left{
	float:left;
	border: 1px solid #17a2b8;
}

#save{
    background: #17a2b8;
    color: #fff;
    border: 1px solid #17a2b8;
}

#cancel{
	background:#b6b6b6;
	border:1px solid #b6b6b6;
}


.radio-btn{
    position: relative;
    display: inline-block;
    margin: 5px 3px;
}

/* 게시여부 라디오버튼 영역 스타일적용 START */
.radio-btn-wrap{
	margin:-5px -4px;
	float:left;
}

.radio-btn{
	margin: 5px 4px;
}

.radio-btn-wrap .radio-btn input[type="radio"] {
    overflow: hidden;
    position: absolute;
    top: 0;
    left: 0;
    width: 0;
    height: 0;
    opacity: 0;
}

.radio-btn-wrap .radio-btn input[type="radio"]:checked + label{
    
    background: #17a2b8;
    color: #fff;
    border: 1px solid #17a2b8;
    
    /*background: cadetblue;
    color: #fff;
    border: 1px solid cadetblue;*/
}

.radio-btn-wrap .radio-btn label {
    display: block;
    height: 40px;
    padding: 0 15px;
    font-size: 16px;
    color: #636366;
    line-height: 38px;
    border: 1px solid #17a2b8;
    /*border: 1px solid cadetblue;*/
    border-radius: 24px;
    box-sizing: border-box;
    cursor: pointer;
}
.filebox{
	margin-top:8px;
}

.filebox label {
	float:left;
    display: inline-block;
    width: 140px;
    height: 48px;
    padding: 0 12px;
    color: #3a3a3d;
    font-size: 18px;
    line-height: 48px;
    border-radius: 4px;
    box-sizing: border-box;
    background-color: #9ca0a1;
    vertical-align: middle;
    cursor: pointer;
    text-align: center;
}

.filebox input[type="file"] {
    position: absolute;
    width: 0;
    height: 0;
    padding: 0;
    overflow: hidden;
    border: 0;
}

.filebox .upload-name {
    display: inline-block;
    padding: 0 32px 0 12px;
    background: none;
    vertical-align: middle;
    border: 0;
}

input[type="text"], input[type="password"] {
    width: 100%;
    height: 48px;
    padding: 0 16px;
    border-radius: 4px;
    background-color: #fafafa;
    color: #1a1d1d;
    font-size: 18px;
    line-height: 48px;
    box-sizing: border-box;
}

/* 삭제버튼 */
.btn-reset {
    display: none;
    position: absolute;
    top: 12px;
    right: 10px;
    width: 24px;
    height: 24px;
    background: url(../images/btn/btn_inp_reset.png) 0 0 no-repeat;
}

.regc {
	display : none;
	float : center;
}

.evnt_inner_inpt{
    height: 48px;
    padding: 0 30px 0 16px;
    border: 1px solid #aeaeb2;
    border-radius: 10px;
    background-color: #d7d7d7;
}
/* 첨부파일 영역 스타일적용 END */


</style>
<script type="text/javascript">
/**************************************************** 
* 함수설명 : 수정/삭제버튼 클릭 이벤트
* * 수정일자 : 2024.04.02
* 수정내용 : 수정,삭제 버튼 클릭 시 노출메시지 구분 값 및 변수 추가
*         유효성검사(validation함수 파라미터 추가)
*         수정 / 삭제인 경우 호출 URL 분리
*****************************************************/
function updEvent(eventStatus){
	//debugger
	var inptTitle   = $('#title').val();
	var inptContent = $('#txtArea_content').val();
	var chkStatus   = $('input[name="eventYN"]:checked').val();
	var inptEventStrtDt = $('#eventStrt').val();
	var inptEventEndDt  = $('#eventEnd').val();
	var writerNo = 1;
	var confirmMsg;	// 수정, 삭제 버튼 클릭 시 확인 메시지
	var eventfileImg = $('#fileName_110').val();
	console.log("inptEventStrtDt " + inptEventStrtDt);
	console.log("inptEventEndDt "  + inptEventEndDt);
	
	if(typeof eventStatus != "undefined"){
		if(eventStatus == "UPD") confirmMsg = "게시글을 수정하시겠습니까?";
		if(eventStatus == "DEL") confirmMsg = "게시글을 삭제하시겠습니까?";
	}
	
	
	//유효성 검사 함수 호출
	if(validation(eventStatus)){
		// confirm 함수는 확인창 결과값으로 TRUE와 FALSE 값을 RETURN 하게 됨.
		if(confirm(confirmMsg)){
		
		// 수정, 삭제부분 공통적인 부분 변수처리
		var eventNo = ${eventOne.eventNo};
		var mappingUrl;
		var dataObj;
		var rsltMsg;

		// 수정, 삭제인 경우 각각 데이터 세팅
		if(eventStatus == "UPD"){
			mappingUrl  = "event.updInfo";
			dataObj 	= {eventTitle : inptTitle, eventContent : inptContent, eventYN : chkStatus, 
						   eventStrtDt : inptEventStrtDt, eventEndDt : inptEventEndDt,	      
						   eventImg : eventfileImg, eventNo : eventNo, writerNo : writerNo}
			rsltMsg     = "게시글이 정상적으로 수정되었습니다.";
		}
		if(eventStatus == "DEL"){
			mappingUrl  = "event.delInfo";
			dataObj 	= {eventNo : eventNo}
			rsltMsg     = "게시글이 정상적으로 삭제되었습니다.";
		}		
		
		// 게시글 저장 submission 정보 세팅		
		$.ajax({
			type:"POST",
			url : mappingUrl,
			data : dataObj,
			
			// 정상적으로 처리되면 이벤트 목록으로 이동
			success:function(res){
			
			/*	if(res == "SUCCESS"){*/
					alert(rsltMsg);
					location.href="event.list"
				/*}else{                   ?currentPage=1
					alert(rsltMsg);
					return;
				}*/
				},
				error:function(e){
					alert("이벤트 수정/삭제  중 오류가 발생하였습니다.");
					return;
				}
				
			});
			
			}
		}
}	
	
/********************************* 
* 함수설명 : 이벤트 수정 시 유효성 검사(필수값)
**********************************/
function validation(eventStatus){
	
	// 삭제버튼 클릭 시 skip 처리 함
	if(typeof eventStatus != "undefined" && eventStatus == "DEL") return true;
	
	// 각 필드 필수값 체크
	var content = $("#txtArea_content").val();
	
	var today = new Date();
	var year    = today.getFullYear().toString();
	var month   = ("00" + (today.getMonth() + 1) ).toString().slice(-2);
	var day     = ("00" + today.getDate()).toString().slice(-2);
	var fullDay = year + "-" + month + "-" + day;
	
	// 이벤트 제목 체크
	if($("#title").val() == ""){ 
		alert("제목을 입력하세요.");
		$("#title").focus();
		return;
	}
	// 라디오버튼 (게시여부) 체크여부 확인
	if( !$('input[name="eventYN"]').is(':checked') ){
		alert("이벤트 진행상태를 선택해주세요.");
		return;
	}

	// 이벤트 내용 체크
	if($("#txtArea_content").val() == ""){
		alert("이벤트 내용을 입력해주세요.");
		$("#txtArea_content").focus();
		return;
	}	
	
	// 이벤트 제목 글자수 체크
	if($("#title").val().length > 30){ 
		alert("이벤트 제목은 최대 30자까지만 입력 가능합니다.");
		$("#title").focus();
		return;
	}
	
	// 이벤트 내용 글자수 체크
	if(content.length > 400){
		$("#txtArea_content").val($("#txtArea_content").val().substring(0, 400));
		alert("이벤트내용은 400자까지만 입력 가능합니다.");
		return;
	}

	// 이벤트 시작일 체크
	if($("#eventStrt").val() == ""){
		alert("시작날짜를 선택해주세요.");	
		$("#eventStrt").focus();
		return;
	}
	
	//이벤트 종료일 체크
	if($("#eventEnd").val()== ""){
		alert("종료날짜를 선택해주세요.");
		$("#eventEnd").focus();
		return;
	}
	
	// 이벤트 시작일 종료일 범위 체크
	if($("#eventStrt").val() > $("#eventEnd").val()){
		alert("시작일은 종료일 보다 이전이어야 합니다.");
		$("#eventStrt").focus();
		return;
	}
	
	// 이벤트 시작일과 종료일은 현재 날짜보다 작을 수 없다
/* 	if($("#eventStrt").val() < fullDay){
		alert("시작일은 현재날짜 보다 이전일 수 없습니다.");
		$("#eventStrt").focus();
		return;
	} */
	
	return true;
}	
	
/*********************************** 
* 함수설명 : 이벤트 내용 글자 count하는 부분
************************************/
function countText(){

	var content = $("#txtArea_content").val();
	// 글자수 세기
	if(content.length == 0 || content == ''){
		$('#spn_textcount').text('0/400');
	}else{
		$('#spn_textcount').text(content.length + '/400');
	}
	
	// 글자 수 제한
	if(content.length > 400){
		$("#txtArea_content").val($("#txtArea_content").val().substring(0, 400));
		alert("이벤트등록은 400자까지만 입력 가능합니다.");
		return;
	}
}	
	
function upload(){
	//debugger
	console.log( $("#file_110") );
	console.log($("#file_110")[0].files[0].name);
	
	// 파일명 받기
	var fileName = "";
	if( typeof $("#file_110")[0] != "undefined"){
		fileName = $("#file_110")[0].files[0].name;
	}
	
	// 파일명 upload 영역의 fileName_110인 요소에 세팅하기
	$("#fileName_110").val(fileName);
	alert("첨부파일이 선택되었습니다.");
	
	
}
</script>

</head>
<body>

<div class="container">
	
	<jsp:include page="../common/header.jsp"/>
	
	<!-- logo START -->
		<div id="logo" class="logo_main" align="center"></div>
	<!-- logo END -->	
	
<!-- FORM 영역 START -->
	<form id="frm" action="regEvent" method="post">
		<table class="table-light table-striped text-center" width="100%">
			<tr>
				<th class="th_left"><span>이벤트제목</span></th>
				<td><input type="text" id="title" name="eventTitle" maxlength="26" value="${eventOne.eventTitle}" style="width:650px;"/></td>
			</tr>
			
       <tr>
       		<!-- 게시여부 영역  STRT -->  <!-- notice.getStatus()  -->
           	<th class="th_left"><span>이벤트진행여부</span></th>
				<td>
					<div class="radio-btn-wrap" id="event_rdo_wrap">
						<span class="radio-btn">
								<!-- 조회 데이터 유무에 따른 처리  -->
							    <c:if test="${!empty eventOne.eventYN}">
									<c:choose>
									<c:when test="${'Y' eq eventOne.eventYN}">
										<input type="radio" id="rdo_eventYNY" name="eventYN" checked="" value="${eventOne.eventYN}">
									</c:when>
									<c:otherwise>
										<input type="radio" id="rdo_eventYNY" name="eventYN" value="Y">
									</c:otherwise>
									</c:choose>
								</c:if>
								<label for="rdo_eventYNY">진행</label>
						</span>
								
						<span class="radio-btn">
								<!-- 조회 데이터 유무에 따른 처리  -->
							    <c:if test="${!empty eventOne.eventYN}">
									<c:choose>
									<c:when test="${'N' eq eventOne.eventYN}">
										<input type="radio" id="rdo_eventYNN" name="eventYN" checked="" value="${eventOne.eventYN}">
									</c:when>
									<c:otherwise>
										<input type="radio" id="rdo_eventYNN" name="eventYN" value="N">
									</c:otherwise>
									</c:choose>
								</c:if>
								
								<label for="rdo_eventYNN">종료</label>
						</span>
					</div>
	            </td>
            <!-- 게시여부 영역  END -->
            
        </tr>			
			
       <tr>
            <th><span>이벤트내용</span>	</th>
            <td>
            	<c:if test="${not empty eventOne.eventContent}">
            		<textarea rows="10" cols="30" id="txtArea_content" name="eventContent" onkeyup="countText();"> ${eventOne.eventContent} </textarea>
            	</c:if>
                
            </td>
        </tr>
        
        <tr>  
        	<td></td>   
            <td>
            	<span id="spn_textcount">0/400</span>
            		<script type=text/javascript>
            			// 공지사항 내용 세팅 후 글자수 세는 함수 호출
            			countText();
            		</script>
            </td>
            <td></td>
        </tr>
         
         <!-- 이벤트 시작일, 종료일 전체영역 START -->
		<tr id="wrap_event">
			<th><span>이벤트 기간</span><br><span>(시작일 / 종료일)</span></th>
				<td>
					<div class="toggle-group"></div>
					<div class="radio-btn-wrap" id="mixList_205" style="display:none;">
						<span class="radio-btn">
							<label for="">이벤트 기간(이벤트 시작일/종료일)</label>
						</span>
					</div>
					<div class="array-list" data-attr_item_vlue="null">
						<!-- 이벤트 시작일 -->
						<div class="item">
							<div class="select-box bg-gray" style="float:left; margin-right:10px;">
								<!-- 이벤트 시작일 세팅 -->
								<c:if test="${not empty eventOne.eventStrtDt}">
									<input type="date" id="eventStrt" class="evnt_inner_inpt" name="eventStrtDt" value="${eventOne.eventStrtDt}">
								</c:if>
							</div>
						</div>
						
						<!-- 이벤트 종료일 -->
						<div class="item">
							<div class="select-box bg-gray" style="float:left; margin-right:10px;">
								<!-- 이벤트 종료일 세팅 -->
								<c:if test="${not empty eventOne.eventEndDt}">
								<input type="date" id="eventEnd" class="evnt_inner_inpt" name="eventEndDt" value="${eventOne.eventEndDt}">
								</c:if>
							</div>
						</div>
						
					</div>
				</td>
		</tr>
		<!-- 이벤트 시작일, 종료일 전체영역 END -->  
         
         
         
         <!-- 첨부파일 전체영역 START -->         
		<tr data-attr_seq="194" data-attr_disp_form_cd="FD" data-attr_calc_typ_cd="null" data-attr_mndt_inpt_yn="Y">	
			<th><span>첨부파일</span></th>	
			
			<td>
				<div class="filebox">	
					<label for="file_110" tabindex="0">파일선택</label>	
						<input type="file" id="file_110" name="fileUpload" data-file_id="110" tabindex="-1" onchange="upload();">	
						<input type="hidden" id="apndFileId_110" data-attr_item_sno="" data-prod_id="">	
					
					<!-- 업로드 영역 START -->
					<div class="upload-box">    
						<input type="text" id="fileName_110" name="eventImg" class="upload-name inp" placeholder="선택된 파일 없음" title="선택된 파일 없음" readonly="">
						<button type="button" id="fileReset" class="btn-reset"><span class="blind">삭제</span></button>	
					</div>
					<!-- 업로드 영역 END -->
				</div>
					
					<ul class="list-text interval bullet">	
						<!-- <li>허용 파일 형식 : pdf, jpg/jpeg, png, gif, doc/docx, hwp (15MB 미만)</li> -->
					</ul>	
			</td>
		</tr> 
		<!-- 첨부파일 전체영역 END -->         
	
	
	
	
		<tr>
			<td colspan="2">
                <input type="button" id="save"   class="btn btn-primary" value="수정" onclick="updEvent('UPD');"/>
                <input type="button" id="save"   class="btn btn-primary" style="background-color:#eb008b; border-color:#eb008b;" value="삭제" onclick="updEvent('DEL')" />
                <input type="button" id="cancle" class="btn btn-light"   value="취소" onclick="history.back();"/>
			</td>
		</tr>
		</table>
	</form>
</div>
<!-- form태그 끝 -->
</body>
</html>