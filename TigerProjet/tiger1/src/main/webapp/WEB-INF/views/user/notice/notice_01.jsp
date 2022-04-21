
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<c:set var="test" value="${articlesList}" />






<div class="container-fluid">


	<div class="row">
		<div class="col-lg-4 offset-lg-4 text-center">
			<h1 class="page_title">공지사항</h1>
		</div>
	</div>

	<div class="row">
		<div class="offset-lg-1 col-lg-10 offset-lg-1">
			<hr>
		</div>
	</div>


	<div class="row">


		<div class="offset-lg-1 col-lg-2 text-center notice_01_header">
			<span>번호</span>
		</div>
		<div class="col-lg-1 text-left notice_01_header">
			<span>작성자</span>
		</div>
		<div class="col-lg-4 text-center notice_01_header">
			<span>제목</span>
		</div>
		<div class="col-lg-3 text-center notice_01_header">
			<span>작성일자</span>
		</div>
		<hr>
	</div>
	
	
	
	
	



	<div class="row">
	<c:when test="${test !=null }">
          <c:forEach var="notice" items="">
		<div class="offset-lg-1 col-lg-2 text-center notice_01_section">
			<span>${test.notice_id}</span>
		</div>
		<div class="col-lg-1 text-left notice_01_section">
			<span>${test.user_id }</span>
		</div>
		<div class="col-lg-4 text-center notice_01_section">
			<p class="cs">
				<a href="${contextPath}/notice/notice_02.do"></a>
		</div>
		<div class="col-lg-3 text-center notice_01_section">
			<span>${test.notice_cre_date}</span>
		</div>
		</c:forEach>
		</c:when>
	</div>





	<div class="row">
		<div class="offset-lg-5 col-lg-1 text-center notice_01_line ">
			<p class="notice_01_next">
				<a href="#"> < 이전 </a>
		</div>
		<div class="col-lg-1 text-center notice_01_line">
			<p class="notice_01_next">
				<a href="#"> 다음 > </a>

			</p>
		</div>
	</div>
</div>










