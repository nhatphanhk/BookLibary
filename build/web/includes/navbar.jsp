<style> 
.bg-custom {
	background-color: #303f9f;
}
.navbar .nav-item:hover .nav-link{
	background-color: white;
	color: #303f9f;
	border-radius:15px;
}

</style>

<div class="container-fluid" style="height:10px;background-color: #303f9f"></div>

<div class="container-fluid p-3 bg-Light">
	<div class="row">
		<div class="col-md-3 text-success">
			<h3>
				<i class="fas fa-book"></i>E-books
			</h3>
		</div>
		<div class="col-md-6">
			<form class="d-flex">
				<input class="form-control me-2" type="search" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-primary" type="submit">Search</button>
			</form>
		</div>
		<div class="col-md-3">
			<a href="login.jsp" class="btn btn-success">Log in</a> 
			<a href="register.jsp"
				class="btn btn-primary text-white">Register</a>
		</div>
	</div>
</div>

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
			</ul>
			<form class="d-flex">
				<button class="btn btn-light my-2 my-sm-0" type="submit">
					<i class="fas fa-cog"></i>Setting
				</button>
				<button class="btn btn-light my-2 my-sm-0 mL-1" type="submit">
					<i class="fas fa-phone-square-alt"></i>Contact Us
				</button>
			</form>
		</div>
	</div>
</nav>