<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var='root' value="${pageContext.request.contextPath }/" />
<!-- 상단 메뉴 부분 -->
<nav
	class="navbar navbar-expand-md bg-dark navbar-dark fixed-top shadow-lg">
	<a class="navbar-brand" href="${root }main">Menu</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navMenu">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navMenu">
		<ul class="navbar-nav">
			<c:forEach var='obj' items='${topMenuList }'>
				<c:if test="${obj.menu_info_idx == 1 }">
					<li class="nav-item"><a
						href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
						class="nav-link">${obj.menu_info_name }</a>
						<ul class="navbar-nav">
							<c:if test="${obj.menu_info_idx > 10 and obj.menu_info_idx < 20 }">
								<li class="nav-item"><a
									href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
									class="nav-link">${obj.menu_info_name }</a></li>
							</c:if>
						</ul></li>
				</c:if>
				<c:if test="${obj.menu_info_idx == 2 }">
					<li class="nav-item"><a
						href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
						class="nav-link">${obj.menu_info_name }</a>
						<ul class="navbar-nav">
							<c:if test="${obj.menu_info_idx > 20 && obj.menu_info_idx < 30 }">
								<li class="nav-item"><a
									href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
									class="nav-link">${obj.menu_info_name }</a></li>
							</c:if>
						</ul></li>
				</c:if>
				<c:if test="${obj.menu_info_idx == 3 }">
					<li class="nav-item"><a
						href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
						class="nav-link">${obj.menu_info_name }</a>
						<ul class="navbar-nav">
							<c:if test="${obj.menu_info_idx > 30 && obj.menu_info_idx < 40 }">
								<li class="nav-item"><a
									href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
									class="nav-link">${obj.menu_info_name }</a></li>
							</c:if>
						</ul></li>
				</c:if>
				<c:if test="${obj.menu_info_idx == 4 }">
					<li class="nav-item"><a
						href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
						class="nav-link">${obj.menu_info_name }</a>
						<ul class="navbar-nav">
							<c:if test="${obj.menu_info_idx > 40 && obj.menu_info_idx < 50 }">
								<li class="nav-item"><a
									href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
									class="nav-link">${obj.menu_info_name }</a></li>
							</c:if>
						</ul></li>
				</c:if>
				<c:if test="${obj.menu_info_idx == 5 }">
					<li class="nav-item"><a
						href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
						class="nav-link">${obj.menu_info_name }</a>
						<ul class="navbar-nav">
							<c:if test="${obj.menu_info_idx > 50 && obj.menu_info_idx < 60 }">
								<li class="nav-item"><a
									href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
									class="nav-link">${obj.menu_info_name }</a></li>
							</c:if>
						</ul></li>
				</c:if>
				<c:if test="${obj.menu_info_idx == 6 }">
					<li class="nav-item"><a
						href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
						class="nav-link">${obj.menu_info_name }</a>
						<ul class="navbar-nav">
							<c:if test="${obj.menu_info_idx > 60 && obj.menu_info_idx < 70 }">
								<li class="nav-item"><a
									href="${root }board/main?board_info_idx=${obj.menu_info_idx}"
									class="nav-link">${obj.menu_info_name }</a></li>
							</c:if>
						</ul></li>
				</c:if>
			</c:forEach>
		</ul>
		<!-- 
		<ul class="navbar-nav ml-auto">
			<c:choose>
				<c:when test="${loginUserBean.userLogin == true }">
					<li class="nav-item">
						<a href="${root }user/modify" class="nav-link">정보수정</a>
					</li>
					<li class="nav-item">
						<a href="${root }user/logout" class="nav-link">로그아웃</a>
					</li>
				</c:when>
				<c:otherwise>
					<li class="nav-item">
						<a href="${root }user/login" class="nav-link">로그인</a>
					</li>
					<li class="nav-item">
						<a href="${root }user/join" class="nav-link">회원가입</a>
					</li>
				</c:otherwise>
			</c:choose>
		</ul>
		 -->
	</div>
</nav>