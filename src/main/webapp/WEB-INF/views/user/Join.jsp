<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var='root' value="${pageContext.request.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>같이먹자</title>
<!-- Bootstrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<script>
	function checkUserIdExist(){
		
		var userId = $("#userId").val()
		
		if(userId.length == 0){
			alert('아이디를 입력해주세요')
			return
		}
		
		$.ajax({
			url : '${root}user/checkUserIdExist/' + userId,
			type : 'get',
			dataType : 'text',
			success : function(result){
				if(result.trim() == 'true'){
					alert('사용할 수 있는 아이디입니다')
					$("#userIdExist").val('true')
				} else {
					alert('사용할 수 없는 아이디 입니다')
					$("#userIdExist").val('false')
				}
			}
		})
	}
	
	function resetUserIdExist(){
		$("#userIdExist").val('false')
	}
</script>
<body>

<%--<c:import url="/WEB-INF/views/include/top_menu.jsp"/>  --%>

<div class="container" style="margin-top:100px">
	<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-6">
			<div class="card shadow">
				<div class="card-body">
					<form:form action="${root }user/join_pro" method='post' modelAttribute="joinUserBean">
						<form:hidden path="userIdExist"/>
						<div class="form-group">
							<form:label path="userName">이름</form:label>
							<form:input path="userName" class='form-control'/>
							<form:errors path="userName" style='color:red'/>
						</div>
						<div class="form-group">
							<form:label path="userNickName">닉네임</form:label>
							<form:input path="userNickName" class='form-control'/>
							<form:errors path="userNickName" style='color:red'/>
						</div>
						<div class="form-group">
							<form:label path="userBirth">생년월일</form:label>
							<form:input path="userBirth" class='form-control'/>
							<form:errors path="userBirth" style='color:red'/>
						</div>
						<div class="form-group">
							<form:label path="userId">아이디</form:label>
							<div class="input-group">
								<form:input path="userId" class='form-control' onkeypress="resetUserIdExist()"/>
								<div class="input-group-append">
									<button type="button" class="btn btn-primary" onclick='checkUserIdExist()'>중복확인</button>
								</div>
							</div>
							<form:errors path="userId" style='color:red'/>
						</div>
						<div class="form-group">
							<form:label path="userPassward">비밀번호</form:label>
							<form:password path="userPassward" class='form-control'/>
							<form:errors path='userPassward' style='color:red'/>
						</div>
						<div class="form-group">
							<form:label path="userPassward2">비밀번호 확인</form:label>
							<form:password path="userPward2" class='form-control'/>
							<form:errors path='userPassward2' style='color:red'/>
						</div>
						<div class="form-group">
							<form:label path="userGender">성별</form:label>
							<form:checkbox path="userGender" class='form-control'/>남or여
						</div>
						<div class="form-group">
							<form:label path="userEmail">이메일</form:label>
							<form:input path="userEmail" class='form-control'/>
							<form:errors path="userEmail" style='color:red'/>
						</div>
						<div class="form-group">
							<form:label path="userPhone">전화번호</form:label>
							<form:input path="userPhone" class='form-control'/>
							<form:errors path="userPhone" style='color:red'/>
						</div>
						<div class="form-group">
							<form:label path="userPhone">전화번호</form:label>
							<form:input path="userPhone" class='form-control'/>
							<form:errors path="userPhone" style='color:red'/>
						</div>
						<div class="form-group">
							<div class="text-right">
								<form:button class='btn btn-primary'>회원가입</form:button>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
		<div class="col-sm-3"></div>
	</div>
</div>

<c:import url="/WEB-INF/views/include/bottom_info.jsp"/>

</body>
</html>








    