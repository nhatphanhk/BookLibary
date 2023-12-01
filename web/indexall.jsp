<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="includes/allCss.jsp"%>
<style type="text/css">
.back-img {
	background: url("img/book.png");
	height: 50vh;
	width: 100%;
	background-size: cover;
	background-repeat: no-repeat;
	height: 50vh; 
	crd-ho: hover{
}
}
</style>

</head>
<body style="background-color: #f7f7f7;">
	<%@include file="includes/navbar.jsp"%>
	<div class="container-fluid">
		<h2 class="text-center text-danger">E-book Management System</h2>
	</div>


	<!-- Start All Book -->

	<div class="container">
		<h3 class=" text-center">All book</h3>
		<div class="row">
                    <c:forEach items = "${requestScope.data}" var="c">
                        <div class="col-md-3">
                            <div class="card crd-ho" style="height:450px">
					<div class="card-body text-center">
						<img alt="" src="${c.img}"
							style="width: 150px; height: 200px;" class="img-thumblin">
						<p>${c.name}</p>
						<p>${c.idcategory}</p>
						<p>${c.idauthor}</p>
                                                <div class="row" style="margin-bottom:0">
								<a href="bookdetail?id=${c.id}" class="btn btn-success btn-sm mL-1">View Details</a> <a
								href="" class="btn btn-danger btn-sm mL-1">Amount: ${c.amount}</a>

						</div>
					</div>
				</div>
			</div>
                    </c:forEach>
			
			
		</div>
		<div class="text-center mt-1">
		</div>
	</div>
	<!-- End Recent Book -->
	<hr>
	

	<%@include file="includes/footer.jsp"%>





</body>
</html>