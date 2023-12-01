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
.bg-custom {
	background-color: #303f9f;
}
.navbar .nav-item:hover .nav-link{
	background-color: white;
	color: #303f9f;
	border-radius:15px;
}

</style>

</head>
<body style="background-color: #f0f1f2;">
    <nav class="navbar navbar-expand-lg navbar-dark bg-custom">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"><i class="fas fa-home"></i></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="homepage">Home</a></li>
				<li class="nav-item"><a class="nav-link active" href="category-list"><i
						class="fas fa-book-open"></i> Category</a></li>

				<li class="nav-item"><a class="nav-link active" href="author-list"><i
						class="fas fa-book-open"></i> Author</a></li>

				<li class="nav-item"><a class="nav-link active"
					href="book-list"><i class="fas fa-book-open"></i> Book</a></li>
                                <li class="nav-item"><a class="nav-link active"
					href="user-list"><i class="fas fa-book-open"></i> User</a></li>
                                <li class="nav-item"><a class="nav-link active"
					href="logout"><i class="fas fa-book-open"></i> Log Out</a></li>
			</ul>
			
		</div>
	</div>
</nav>
	<div class="container">
            <h1 class="position-absolute top-50 start-50 translate-middle" style="font-size: 50px">Welcome to Book Management</h1>
	
	</div>
	<%@include file="includes/footer.jsp"%>
</body>
</html>