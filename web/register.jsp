<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ebook: Register</title>
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
</style>

</head>
<body style="background-color: #f0f1f2;">
	<%@include file="includes/navbar.jsp"%>

	<%
	String baoLoi = request.getAttribute("baoLoi") + "";
	baoLoi = (baoLoi.equals("null")) ? "" : baoLoi;

	String tenDangNhap = request.getAttribute("tenDangNhap") + "";
	tenDangNhap = (tenDangNhap.equals("null")) ? "" : tenDangNhap;
	String hoVaTen = request.getAttribute("hoVaTen") + "";
	hoVaTen = (hoVaTen.equals("null")) ? "" : hoVaTen;
	String gioiTinh = request.getAttribute("gioiTinh") + "";
	gioiTinh = (gioiTinh.equals("null")) ? "" : gioiTinh;
	String ngaySinh = request.getAttribute("ngaySinh") + "";
	ngaySinh = (ngaySinh.equals("null")) ? "" : ngaySinh;
	String diaChiKhachHang = request.getAttribute("diaChiKhachHang") + "";
	diaChiKhachHang = (diaChiKhachHang.equals("null")) ? "" : diaChiKhachHang;
	String diaChiMuaHang = request.getAttribute("diaChiMuaHang") + "";
	diaChiMuaHang = (diaChiMuaHang.equals("null")) ? "" : diaChiMuaHang;
	String diaChiNhanHang = request.getAttribute("diaChiNhanHang") + "";
	diaChiNhanHang = (diaChiNhanHang.equals("null")) ? "" : diaChiNhanHang;
	String email = request.getAttribute("email") + "";
	email = (email.equals("null")) ? "" : email;
	String dienThoai = request.getAttribute("dienThoai") + "";
	dienThoai = (dienThoai.equals("null")) ? "" : dienThoai;
	String dongYNhanMail = request.getAttribute("dongYNhanMail") + "";
	dongYNhanMail = (dongYNhanMail.equals("null")) ? "" : dongYNhanMail;
	%>

	<div class="container mt-3">
		<div class="alert alert-danger" role="alert">
			<%=baoLoi%>
		</div>
		<form class="row g-3" action="khach-hang" method="post">
			<input type="hidden" name="hanhDong" value="dang-ky" />
			<h3>THÔNG TIN KHÁCH HÀNG</h3>
			<div class="col-md-6">
				<label for="hoVaTen" class="form-label">Họ và tên</label> <input
					type="text" class="form-control" id="hoVaTen" name="hoVaTen"
					value="<%=hoVaTen%>">
			</div>
			<div class="col-md-6">
				<label for="gioiTinh" class="form-label">Giới tính</label> <select
					class="form-control" id="gioiTinh" name="gioiTinh">
					<option value="Nam" <%=(gioiTinh == "Nam") ? "select='selected'" : ""%>>Nam</option>
					<option value="Nữ" <%=(gioiTinh == "Nữ") ? "select='selected'" : ""%>>Nữ</option>
				</select>
			</div>

			<div class="col-md-4">
				<label for="ngaySinh" class="form-label">Ngày sinh</label> <input
					type="date" class="form-control" id="ngaySinh" name="ngaySinh"
					value="<%=ngaySinh%>">
			</div>
			<div class="col-md-4">
				<label for="soDienThoai" class="form-label">Số điện thoại</label> <input
					type="tel" class="form-control" id="soDienThoai" name="soDienThoai"
					value="<%=dienThoai%>">
			</div>
			<div class="col-md-4">
				<label for="email" class="form-label">Email</label> <input
					type="email" class="form-control" id="email" name="email"
					value="<%=email%>">


			</div>
			<h3>ĐỊA CHỈ KHÁCH HÀNG</h3>
			<div class="col-12">
				<label for="diaChiKhachHang" class="form-label">Địa chỉ
					khách hàng</label> <input type="text" class="form-control"
					id="diaChiKhachHang" placeholder="" name="diaChiKhachHang"
					value="<%=diaChiKhachHang%>">
			</div>
			<div class="col-12">
				<label for="diaChiMuaHang" class="form-label">Địa chỉ mua
					hàng</label> <input type="text" class="form-control" id="diaChiMuaHang"
					placeholder="" name="diaChiMuaHang" value="<%=diaChiMuaHang%>">
			</div>
			<div class="col-12">
				<label for="diaChiNhanHang" class="form-label">Địa chỉ nhận
					hàng</label> <input type="text" class="form-control" id="diaChiNhanHang"
					placeholder="" name="diaChiNhanHang" value="<%=diaChiNhanHang%>">
			</div>
			<h3>THÔNG TIN ĐĂNG NHẬP</h3>
			<div class="col-md-4">
				<label for="tenDangNhap" class="form-label">Tên đăng nhập</label> <input
					type="text" class="form-control" id="tenDangNhap"
					name="tenDangNhap" required value="<%=tenDangNhap%>">
			</div>
			<div class="col-md-4">
				<label for="matKhau" class="form-label">Mật khẩu</label> <input
					type="password" class="form-control" id="matKhau" name="matKhau"
					" required>
			</div>
			<div class="col-md-4">
				<label for="matKhauNhapLai" class="form-label">Nhập lại mật
					khẩu</label> <span id="thongBaoLoiMatKhau" style="color: red"></span> <input
					type="password" class="form-control" id="matKhauNhapLai"
					name="matKhauNhapLai" onkeyup="kiemTraMatKhau()" required>
			</div>


			<div class="col-12">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" id="dongYDieuKhoan"
						name="dongYDieuKhoan" onchange="xuLyChonDongY()" required="">
					<label class="form-check-label" for="dongYDieuKhoan"> Đồng
						ý với điều khoản của công ty </label>

				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" id="dongYNhanMail"
						name="dongYNhanMail"> <label class="form-check-label"
						for="dongYNhanMail"> Đồng ý nhận email </label>

				</div>

			</div>
			<div class="col-12">
				<button type="submit" class="btn btn-primary" name="submit"
					id="submit" style="visibility: hidden">Đăng ký</button>
			</div>
		</form>
	</div>
	</div>
	</div>
	<script>
		function kiemTraMatKhau() {
			matKhau = document.getElementById("matKhau").value;
			matKhauNhapLai = document.getElementById("matKhauNhapLai").value;

			if (matKhau != matKhauNhapLai) {
				document.getElementById("thongBaoLoiMatKhau").innerHTML = "Mật khẩu không khớp!";
				return false;
			} else {
				document.getElementById("thongBaoLoiMatKhau").innerHTML = "";
				return true;
			}
		}

		function xuLyChonDongY() {
			dongYDeuKhoan = document.getElementById("dongYDieuKhoan");
			if (dongYDeuKhoan.checked == true) {
				document.getElementById("submit").style.visibility = "visible";
			} else {
				document.getElementById("submit").style.visibility = "hidden";
			}
		}
	</script>
	<%@include file="includes/footer.jsp"%>

</body>
</html>