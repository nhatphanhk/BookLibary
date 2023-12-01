<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ebook: Login</title>
<%@include file="includes/allCss.jsp"%>
<style>
html, body {
	height: 100%;
	margin: 0;
	padding: 0;
}

.container {
	min-height: 77%;
	display: flex;
	flex-direction: column;
	justify-content: space-between;
}

.content {
	flex: 1;
}

.card-body {
	background-color: #ffffff;
}
</style>

</head>
<body style="background-color: #f0f1f2;">
	<%@include file="includes/navbar.jsp"%>
	
        <%
            String hoVaTen = request.getParameter("hoVaTen");
            %>
        <div class="container mt-3">
            <div class="alert alert-primary" role="alert">
                <h2>Chúc mừng bạn <%=hoVaTen%> đã đăng ký tài khoản thành công!</h2>
</div>
        </div>
    
	<%@include file="includes/footer.jsp"%>
</body>
</html>