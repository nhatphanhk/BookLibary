<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/dataTables.bootstrap5.min.css">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <script defer src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script defer src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
        <script defer src="https://cdn.datatables.net/1.13.4/js/dataTables.bootstrap5.min.js"></script>
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
		<center>
        <h1>List of student</h1>
        <h3><a href="category-add.jsp">Add New Category</a>
        
        <table id="example" class="table table-striped table-bordered align-middle table-responsive" style="width:100%">
                            <thead class="table font-chu-nho text-center align-middle " style="background-color: #303f9f; color: white" >

                            <th>Id</th>
                            <th>Name</th>


                            <th></th>
                            </tr>
                            </thead>
                            <tbody>
                                <c:forEach items = "${requestScope.data}" var="c">
                                    <tr>

                                        <td>${c.id}</td>
                                        <td>${c.name}</td>

                                   
                                        <td>
                                            <a class="btn btn-danger" href="category-edit?id=${c.id}" role="button">Edit</a>
                                            <a class="btn btn-danger" href="#" onclick="doDelete('${c.id}')" role="button">Delete</a>
                                            
                                            
                                            
                                        </td


                                    </tr>
                                </c:forEach>



                            </tbody>

                        </table>

        
    <script>
        function doDelete(id){
            if(confirm("Are you want to delete Student with ID = "+id )){
                window.location="category-delete?id="+id;
            }
        }
    </script>
	<script>
    $(document).ready(function () {

        $('#example').DataTable({
            search: {
                return: false,
            },
            lengthMenu: [
                [10, 25, 50, -1],
                [10, 25, 50, 'All'],
            ],

        });

    });
</script>
	</div>
	<%@include file="includes/footer.jsp"%>
</body>
</html>