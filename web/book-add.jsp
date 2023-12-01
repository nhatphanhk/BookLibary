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
        <script src="https://cdn.ckeditor.com/ckeditor5/38.0.1/classic/ckeditor.js"></script>
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
            <h3>Add Author</h3>
            <form action="book-add" method="POST">
                <input type="text" class="form-control" name="name" placeholder="Enter name">
                <textarea class="form-control" name="description" id="description"> </textarea>
                <select class="form-control" name="idcategory"> 
                    <option value="">Select category</option>
                    <c:forEach items = "${requestScope.dataCategory}" var="d">
                        <option value="${d.id}">${d.name}</option>
                    </c:forEach>
                </select>
                <select  class="form-control"name="idauthor"> 
                    <option value="">Select author</option>
                    <c:forEach items = "${requestScope.dataAuthor}" var="c">
                        <option value="${c.id}">${c.name}</option>
                    </c:forEach>
                </select>
                <input type="number" class="form-control" name="amount" placeholder="Enter amount">
                <input type="text" class="form-control" name="img" placeholder="Image">

                <input type="submit" class="mt-2 btn btn-primary" value="Submit">
            </form>


        </div>
        <script>
            ClassicEditor
                    .create(document.querySelector('#description'))
                    .then(editor => {
                        console.log(editor);
                    })
                    .catch(error => {
                        console.error(error);
                    });
        </script>        
        <%@include file="includes/footer.jsp"%>
    </body>
</html>