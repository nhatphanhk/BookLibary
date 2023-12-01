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
        <c:set var="e" value="${requestScope.dataBook}"/>

	<div class="container">
		<div class=" bg-white">
        <div class="row hedding m-0 pl-3 pt-0 pb-3">
            <h1> ${e.name}</h1> 
        </div>
        <div class="row m-0">
            <div class="col-lg-4 left-side-product-box pb-3">
                <img style="width:425px" src="${e.img}" class="border p-3">
                
            </div>
            <div class="col-lg-8">
                <div class="right-side-pro-detail border p-3 m-0">
                    <div class="row">
                        <div class="col-lg-12">
                            <span>SẢN PHẨM</span>
                            <p class="text-primary">${e.name}</p>
                        </div>
                        <div class="col-lg-12">
                            <p class="m-0 p-0 price-pro">Số lượng: ${e.amount}</p>
                            <hr class="p-0 m-0">
                        </div>
                        <div class="col-lg-12 pt-2">
                            <h5>Product Detail</h5>
                            <span>${e.description}</span>
                            <hr class="m-0 pt-2 mt-2">
                        </div>
                        <div class="col-lg-12">
                            <p class="tag-section"><strong>Tag : </strong>${e.idcategory}</p>
                        </div>
                        <div class="col-lg-12">
                            <h6>Quantity :</h6>
                            <input type="number" class="form-control text-center w-100" value="1">
                        </div>
                        <div class="col-lg-12 mt-3">
                            <div class="row">
                                <div class="col-lg-6 pb-2">
                                    <a href="#" class="btn btn-danger w-100">Add To Cart</a>
                                </div>
                                <div class="col-lg-6">
                                    <a href="#" class="btn btn-success w-100">Shop Now</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
    </div>
	</div>
	<!-- End Old Book -->

	<%@include file="includes/footer.jsp"%>





</body>
</html>