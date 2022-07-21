<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<!-- Font Awesome Icons -->
  <link rel="stylesheet" href="/admin/plugins/fontawesome-free/css/all.min.css">
  <!-- IonIcons -->
  <link rel="stylesheet" href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/admin/dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini">
	<div class="wrapper">
  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="index3.html" class="nav-link">Home</a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="#" class="nav-link">Contact</a>
      </li>
    </ul>

    <!-- SEARCH FORM -->
    <form class="form-inline ml-3">
      <div class="input-group input-group-sm">
        <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
        <div class="input-group-append">
          <button class="btn btn-navbar" type="submit">
            <i class="fas fa-search"></i>
          </button>
        </div>
      </div>
    </form>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
      <!-- Messages Dropdown Menu -->
      <li class="nav-item dropdown">
        <a class="nav-link" data-toggle="dropdown" href="#">
          <i class="far fa-comments"></i>
          <span class="badge badge-danger navbar-badge">3</span>
        </a>
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="dist/img/user1-128x128.jpg" alt="User Avatar" class="img-size-50 mr-3 img-circle">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Brad Diesel
                  <span class="float-right text-sm text-danger"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">Call me whenever you can...</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="dist/img/user8-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  John Pierce
                  <span class="float-right text-sm text-muted"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">I got your message bro</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="dist/img/user3-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Nora Silvester
                  <span class="float-right text-sm text-warning"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">The subject goes here</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
        </div>
      </li>
      <!-- Notifications Dropdown Menu -->
      <li class="nav-item dropdown">
        <a class="nav-link" data-toggle="dropdown" href="#">
          <i class="far fa-bell"></i>
          <span class="badge badge-warning navbar-badge">15</span>
        </a>
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          <span class="dropdown-item dropdown-header">15 Notifications</span>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fas fa-envelope mr-2"></i> 4 new messages
            <span class="float-right text-muted text-sm">3 mins</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fas fa-users mr-2"></i> 8 friend requests
            <span class="float-right text-muted text-sm">12 hours</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fas fa-file mr-2"></i> 3 new reports
            <span class="float-right text-muted text-sm">2 days</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item dropdown-footer">See All Notifications</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#" role="button"><i
            class="fas fa-th-large"></i></a>
      </li>
    </ul>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="index3.html" class="brand-link">
      <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
           style="opacity: .8">
      <span class="brand-text font-weight-light">ADMIN</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="#" class="d-block">Nguyễn Bằng Phi</a>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item has-treeview menu-open">
            <a href="#" class="nav-link active">
              <i class="nav-icon fas fa-tachometer-alt"></i>
              <p>
                Chỉnh sửa dữ liệu
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/index/nhanvien" class="nav-link ">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Nhân Viên</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/index/khachhang" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Khách Hàng</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/index/sanpham" class="nav-link ">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Sản Phẩm</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/index/hoadon" class="nav-link active">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Kiểm tra hóa đơn</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/index/danhmuc" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Danh Mục</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/index/report" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Report</p>
                </a>
              </li>
            </ul>
          </li>
          
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <div class="p-5 d-flex">
        <div class="w-50" style="border-right: 2px solid black;">
          <h2 class="text-center">Hóa Đơn</h2>
          <table class="table">
            <thead>
              <tr>
                <th scope="col">Mã hóa đơn</th>
                <th scope="col">Tổng tiền</th>
                <th scope="col">Ngày lập HD</th>
                <th scope="col">Mã Khách Hàng</th>
                <th scope="col">Mã Nhân Viên</th>
                <th scope="col">Trạng thái</th>
                <th scope="col"></th>
              </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${listhd.content}">
            	<tr>
	                <th scope="row"> <a href="/index/hoadon/edit/${item.mahd}">${item.mahd}</a> </th>
	                <td>
						<fmt:formatNumber value="${item.tongtien}"/>
					</td>
	                <td>${item.ngaylaphd}</td>
	                <td><a href="/index/khachhang/edit/${item.khachhang.makh}">${item.khachhang.makh}</a></td>
	                <td> <a href="/index/nhanvien/edit/${item.nhanvien.manv}">${item.nhanvien.manv}</a> </td>
	                <td>${item.trangthai? 'Đã thanh toán':'Chưa thanh toán'}</td>
	                <td>
	                	<a href="/index/hoadon/delete/${item.mahd}"><i class="fa fa-trash-alt"></i></a>
	                </td>
	              </tr>
            </c:forEach>
            	<div class="p-2 pb-3">
            		<form action="">
            			<div class="form-group">
				            <label for="exampleInputNgay">Từ ngày</label>
				            <input type="date" class="form-control" id="exampleInputNgay" placeholder="Nhập ngày lập hóa đơn" value="" name="nbd">
				          </div>
				         <div class="form-group">
				            <label for="exampleInputNgay">Đến ngày</label>
				            <input type="date" class="form-control" id="exampleInputNgay" placeholder="Nhập ngày lập hóa đơn" value="" name="nkt">
				          </div> 
				          <button class="btn btn-outline-primary w-100" formaction="/index/hoadon">Lọc</button>
            		</form>
            	</div>
              <div class="btn-toolbar justify-content-center mb-3" role="toolbar" aria-label="Toolbar with button groups">
				  <div class="btn-group mr-2" role="group" aria-label="First group">
				    <a class="btn btn-primary text-white" href="/index/hoadon?p=0">First</a>
				    <a class="btn btn-primary text-white" href="/index/hoadon?p=${listhd.number-1}">Prev</a>
				    <a class="btn btn-primary text-white" href="/index/hoadon?p=${listhd.number+1}">Next</a>
				    <a class="btn btn-primary text-white" href="/index/hoadon?p=${listhd.totalPages-1}">Last</a>
				  </div>
				</div>
            </tbody>
          </table>
        </div>
        <div class="w-50">
          <h2 class="text-center">Chi Tiết</h2>
          <table class="table">
            <thead>
              <tr>
                <th scope="col">Mã HĐCT</th>
                <th scope="col">Số hóa đơn</th>
                <th scope="col">Tên sản phẩm</th>
                <th scope="col">Đơn giá</th>
                <th scope="col">Số lượng</th>
                <th scope="col">Tổng tiền</th>
                <th scope="col"></th>
              </tr>
            </thead>
            <tbody>
            <c:forEach var="itemct" items="${listcthd}">
	            <tr>
	                <th scope="row"> <a href="/index/hoadonct/edit/${itemct.idhdct}">${itemct.idhdct}</a> </th>
	                <td>${itemct.hoadon.mahd}</td>
	                <td>${itemct.sanpham.tensp}</td>
	                <td> <fmt:formatNumber value="${itemct.dongia}"/> </td>
	                <td class="text-center">${itemct.soluong}</td>
	                <td> <fmt:formatNumber value="${itemct.tongtien}"/> </td>
	                <td>
	                	<a href="/index/hoadonct/delete/${itemct.idhdct}"><i class="fa fa-trash-alt"></i></a>
	                </td>
	              </tr>
            </c:forEach>
            </tbody>
          </table>
        </div>
        
    </div>
    <h2 class="text-center" style="font-weight: 700;">Chỉnh sửa dữ liệu</h2>
    <ul class="nav nav-tabs" id="myTab" role="tablist">
      <li class="nav-item">
        <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Hóa Đơn</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Chi Tiết</a>
      </li>
    </ul>
    <div class="tab-content" id="myTabContent">
      <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
        <form>
          <div class="form-group">
            <label for="exampleInputMaHD">Mã Hóa Đơn</label>
            <input readonly="readonly" type="text" class="form-control" id="exampleInputMaHD" aria-describedby="emailHelp" placeholder="Nhập mã hóa đơn" value="${entity.mahd}" name="mahd">
          </div>
          <div class="form-group">
            <label for="exampleInputTongTien">Tổng Tiền</label>
            <input type="text" class="form-control" id="exampleInputTongTien" placeholder="Nhập tổng tiền sản phẩm" value="<fmt:formatNumber pattern="#########" value="${entity.tongtien}"/>" name="tongtien"> 
          </div>
          <div class="form-group">
            <label for="exampleInputNgay">Ngày Lập Hóa Đơn</label>
            <input type="date" class="form-control" id="exampleInputNgay" placeholder="Nhập ngày lập hóa đơn" value="${entity.ngaylaphd}" name="nlhd">
          </div>
          
          <div class="form-group">
            <label for="exampleInputMaKH">Mã Khách Hàng</label>
            <input type="text" class="form-control" id="exampleInputMaKH" aria-describedby="emailHelp" placeholder="Nhập mã khách hàng" value="${entity.khachhang.makh}" name="makh">
          </div>
          <div class="form-group">
            <label for="exampleInputMaNV">Mã Nhân Viên</label>
            <input type="text" class="form-control" id="exampleInputMaNV" aria-describedby="emailHelp" placeholder="Nhập mã nhân viên" value="${entity.nhanvien.manv}" name="manv">
          </div>
          <button type="submit" class="btn btn-primary" formaction="/index/hoadon/create">Add</button>
          <button type="submit" class="btn btn-danger" formaction="/index/hoadon/update">Update</button>
          <button type="submit" class="btn btn-success" formaction="/index/hoadon/all">Reset</button>
        </form>
      </div>
      <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
        <form>
          <div class="form-group">
            <label for="exampleInputMaHD1">Mã Hóa Đơn</label>
            <input readonly="readonly" type="text" class="form-control" id="exampleInputMaHD1" aria-describedby="emailHelp" placeholder="..." value="${entity2.idhdct}" name="idhdct">
            <input type="hidden" value="${entity.mahd}" name="mahd">
          </div>
          <div class="form-group">
            <label for="exampleInputMaSP1">Mã Sản Phẩm</label>
            <input type="text" class="form-control" id="exampleInputMaSP1" placeholder="Nhập mã sản phẩm" value="${entity2.sanpham.masp}" name="masp">
          </div>
          <div class="form-group">
            <label for="exampleInputDonGia1">Đơn giá</label>
            <input type="text" class="form-control" id="exampleInputDonGia1" placeholder="Nhập giá sản phẩm" value='<fmt:formatNumber pattern="#########" value="${entity2.dongia}"/>' name="dongia">
          </div>
          
          <div class="form-group">
            <label for="exampleInputSoLuong">Số Lượng</label>
            <input type="text" class="form-control" id="exampleInputSoLuong" placeholder="Nhập số lượng sản phẩm sẽ mua" value="${entity2.soluong}" name="soluong">
          </div>
          <div class="form-group">
            <label for="exampleInputTong">Tổng Tiền</label>
            <input type="text" class="form-control" id="exampleInputTong" placeholder="Nhập tổng tiền" value="<fmt:formatNumber value="${entity2.tongtien}" pattern="#########"/>" name="tongtien"> 
          </div>
          <button type="submit" class="btn btn-primary" formaction="/index/hoadonct/create">Add</button>
          <button type="submit" class="btn btn-danger" formaction="/index/hoadonct/update">Update</button>
          <button type="submit" class="btn btn-success" formaction="/index/hoadon/all">Reset</button>
        </form>
      </div>
    </div>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->

  <!-- Main Footer -->
  <footer class="main-footer">
    <strong>Copyright &copy; 2014-2019 <a href="http://adminlte.io">AdminLTE.io</a>.</strong>
    All rights reserved.
    <div class="float-right d-none d-sm-inline-block">
      <b>Version</b> 3.0.5
    </div>
  </footer>
</div>
<!-- ./wrapper -->
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<!-- jQuery -->
<script src="/admin/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="/admin/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE -->
<script src="/admin/dist/js/adminlte.js"></script>
</body>
</html>