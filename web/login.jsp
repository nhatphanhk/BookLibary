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
	<div class="container">
		<div class="container p-2">
			<div class="row mt-2">
				<div class="col-md-4 offset-md-4">
					<div calss="card">
						<div class="card-body">
							<h3 class="text-center ">Login</h3>
							<%
							String baoLoi = request.getAttribute("baoLoi") + "";
							if (baoLoi.equals("null")) {
								baoLoi = "ĐĂNG NHẬP BẰNG TÀI KHOẢN";
							}
							%>
                                                        <div class="alert alert-danger" role="alert">
 <%=baoLoi%>
</div>
							<form action="user" method="POST">
                                                                        <input type="hidden" name="hanhDong" value="dang-nhap"/>

								<div class="mb-3">
									<label for="exampleInputEmail1" class="form-label">Email
										address</label> <input type="email" class="form-control"
										id="exampleInputEmail1" aria-describedby="emailHelp"
										required="required" name="email">

								</div>
								<div class="mb-3">
									<label for="exampleInputPassword1" class="form-label">Password</label>
									<input type="password" class="form-control"
										id="exampleInputPassword1" required="required" name="password">
								</div>

								<div class="text-center">
									<button type="submit" class="btn btn-primary">Login</button>
									<br> <a href="register">Create Account</a>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="includes/footer.jsp"%>
</body>
</html>