
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<c:set var="loginCheck" value="${userInfo.user_rank }" />



<div class="header">
		<div class="container-fluid">


			<div class="row">
                <div class="col-lg-2 text-left">
					<a href="${contextPath}/main.do" class="logo-text" > 
						<img class="header-icon" src="${contextPath}/resources/img/common/favicon.png" alt="로고 이미지">백호농수산
					</a>
				</div>
				
				<div class="col-lg-3 text-center">
					<div class="category">
						<a href="${contextPath}/product/product_01.do" class="header-navi">농산물</a>
						<a href="${contextPath}/product/product_01.do" class="header-navi">수산물</a>
						<a href="${contextPath}/product/product_01.do" class="header-navi">축산물</a>
					</div>
				</div>

				<div class="col-lg-2 text-right offset-lg-1">
					<div class="notice_navi">
						<a href="${contextPath}/notice/notice_01.do" class="header-navi">공지사항</a>
						<a href="${contextPath}/cs/cs_01.do" class="header-navi navi-button">고객센터</a>
					</div>
				</div>
		
				<div class="col-lg-2 text-center">
					<div class="user_navi">
					<c:choose>
					
						<c:when test="${loginOn==true and userInfo.user_rank > 1}">
								<a href="${contextPath}/user/logout.do" class="header-navi">로그아웃</a>
								<a href="${contextPath}/admin/main.do" class="header-navi">관리자 페이지</a>
						</c:when>
							
						<c:when test="${loginOn==true and not empty userInfo }">
								<a href="${contextPath}/user/logout.do" class="header-navi">로그아웃</a>
								<a href="${contextPath}/myPage/myPage_01.do" class="header-navi">마이 페이지</a>
						</c:when>
						
						<c:otherwise>
						<a href="${contextPath}/user/login_01.do" class="header-navi">로그인</a>
						<a href="${contextPath}/user/join_01.do" class="header-navi">회원가입</a>
						</c:otherwise>
						
					</c:choose>
					</div>	
				</div>

				<div class="col-lg-1 text-center">
					<form>
						<input class="search-box" type="text">
					</form>
				</div>
				
				<!-- SiteMap 내용 -->
				<div id="mySidenav" class="sidenav">
  					<h1> 사이트 맵 </h1>
  					<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  					<h3> 쇼핑하기 </h3>
  					<div class="navImg" >
  					<a href="${contextPath}/product/product_01.do"><img src="${contextPath}/resources/img/common/vegi_icon.png" alt="농산물 아이콘 이미지"></a>
  					<a href="${contextPath}/product/product_01.do"><img src="${contextPath}/resources/img/common/fish_icon.png" alt="수산물 아이콘 이미지"></a>
  					<a href="${contextPath}/product/product_01.do"><img src="${contextPath}/resources/img/common/meat_icon.png" alt="축산물 아이콘 이미지"></a>
  					</div>
  					<div class="shopingNav">
  					<a href="${contextPath}/product/product_01.do">농산물</a>
  					<a href="${contextPath}/product/product_01.do">수산물</a>
  					<a href="${contextPath}/product/product_01.do">축산물</a>
  					</div>
  					<hr>
  					<h3>메뉴</h3>
  					<span class="myPageNav">
  					<a href="${contextPath}/myPage/myPage_01.do">마이페이지</a><br>
  					<a href="${contextPath}/cart/cartList.do">장바구니</a><br>
  					<a href="${contextPath}/notice/notice_01.do">공지사항</a><br>
  					<a href="${contextPath}/cs/cs_01.do">고객센터</a>
  					</span>
				</div>
				
				<div class="col-lg-1 text-left" >
					<div class="menu_navi">
						<a href="${contextPath}/cart/cartList.do" class="header-cart"><img src="${contextPath}/resources/img/common/cart-icon.png" alt="장바구니 아이콘 이미지"></a>
						<span onclick="openNav()" class="header-navi"><img src="${contextPath}/resources/img/common/site-map-icon.png" alt="사이트맵 아이콘 이미지"></span>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
<script>
/* 사이트맵 설정 */
function openNav() {
    document.getElementById("mySidenav").style.width = "500px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}


window.onload = checkRank();

function checkRank() {

	if ('${loginCheck}' > 1) {

			var elements = document.getElementsByClassName('header'); // get all elements
			for(var i = 0; i < elements.length; i++){
				elements[i].style.backgroundColor = "#203864";
			}

	}

}
 

</script>
