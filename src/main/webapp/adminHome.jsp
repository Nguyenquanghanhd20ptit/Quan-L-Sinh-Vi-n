<%@include file="header.html"%>
<!DOCTYPE html>
<html>
<title>DGI</title>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<body>
<img src="logo.png"  align="left"width="100" height="100">
<center><img src="dgi.png" width="100" height="100">
<img src="hanh.jpg" align="right"  width="100" height="100" style="border-radius: 50%"></center>
<div class="w3-container">
  <div class="w3-bar w3-black">
    <button class="w3-bar-item w3-button tablink w3-red" onclick="openCity(event,'London')">Add New Student</button>
    <button class="w3-bar-item w3-button tablink" onclick="openCity(event,'Paris')">Insert New Result</button>
    <button class="w3-bar-item w3-button tablink" onclick="openCity(event,'Tokyo')">Registered Students</button>
     <button class="w3-bar-item w3-button tablink" onclick="openCity(event,'Tokyo1')">All Student Result</button>
     <a href="adminLogin.html" class="w3-bar-item w3-button tablink">Logout</a>
  </div>
  
  <div id="London" class="w3-container w3-border city">
  <br>
   <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Fonts -->
    <link rel="dns-prefetch" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600" rel="stylesheet" type="text/css">



    <link rel="icon" href="Favicon.png">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<main class="my-form">
    <div class="cotainer">
        <div class="row justify-content-center">
            <div class="col-md-8">
                    <div class="card">
                        <div class="card-header" style >Add New Students</div>
                        <div class="card-body">
                            <form name="my-form"  action="success1" method="post">
                                <div class="form-group row">
                                    <label for="full_name" class="col-md-4 col-form-label text-md-left" style=padding-left:80>Mã Sinh Viên</label>
                                    <div class="col-md-6">
                                        <input type="text"  class="form-control" name="id">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="email_address" class="col-md-4 col-form-label text-md-left"style=padding-left:80>Họ Và Tên</label>
                                    <div class="col-md-6">
                                        <input type="text"  class="form-control" name="hoten">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="user_name" class="col-md-4 col-form-label text-md-left"style=padding-left:80>Ngành Học</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="nganhhoc">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="phone_number" class="col-md-4 col-form-label text-md-left"style=padding-left:80>Ngày Sinh</label>
                                    <div class="col-md-6">
                                        <input type="text"  class="form-control" name="ngaysinh">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="present_address" class="col-md-4 col-form-label text-md-left"style=padding-left:80>Giới Tính</label>
                                    <div class="col-md-6">
                                        <input type="text"  class="form-control" name="gioitinh">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="permanent_address" class="col-md-4 col-form-label text-md-left"style=padding-left:80>Địa Chỉ</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="diachi">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label for="permanent_address" class="col-md-4 col-form-label text-md-left"style=padding-left:80>Số Điện Thoại</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="sdt">
                                    </div>
                                </div>

                                    <div class="col-md-6 offset-md-4">
                                        <button type="submit" class="btn btn-primary">
                                        Save
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
            </div>
        </div>
    </div>
</main>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
  </div>

  <div id="Paris" class="w3-container w3-border city" style="display:none">
  <br>
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Fonts -->
    <link rel="dns-prefetch" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600" rel="stylesheet" type="text/css">



    <link rel="icon" href="Favicon.png">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>
<body>



<main class="my-form">
    <div class="cotainer">
        <div class="row justify-content-center">
            <div class="col-md-8">
                    <div class="card">
                        <div class="card-header">Insert New Result</div>
                        <div class="card-body">
                            <form name="my-form" action="success2" method="post">
                                <div class="form-group row">
                                    <label for="full_name" class="col-md-4 col-form-label text-md-left">Mã Sinh Viên</label>
                                    <div class="col-md-6">
                                        <input type="text"class="form-control" name="id">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="email_address" class="col-md-4 col-form-label text-md-left">Họ Và Tên</label>
                                    <div class="col-md-6">
                                        <input type="text"  class="form-control" name="hoten">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="user_name" class="col-md-4 col-form-label text-md-left">Cấu Trúc Dữ Liệu Và Giải Thuật</label>
                                    <div class="col-md-6">
                                        <input type="text"  class="form-control" name="ctdlgt">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="phone_number" class="col-md-4 col-form-label text-md-left">Toán Rời Rạc 2</label>
                                    <div class="col-md-6">
                                        <input type="text"  class="form-control" name="trr2">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="present_address" class="col-md-4 col-form-label text-md-left">Lý Thuyết Thông Tin</label>
                                    <div class="col-md-6">
                                        <input type="text"  class="form-control" name="lttt">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="permanent_address" class="col-md-4 col-form-label text-md-left">Kiến Trúc Máy Tính</label>
                                    <div class="col-md-6">
                                        <input type="text"  class="form-control" name="ktmt">
                                    </div>
                                </div>
                                
                                 <div class="form-group row">
                                    <label for="permanent_address" class="col-md-4 col-form-label text-md-left">Tư Tưởng Hồ Chí Minh</label>
                                    <div class="col-md-6">
                                        <input type="text"  class="form-control" name="tthcm">
                                    </div>
                                </div>
                                
                                 <div class="form-group row">
                                    <label for="permanent_address" class="col-md-4 col-form-label text-md-left">Tiếng Anh</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="tAnh">
                                    </div>
                                </div>
                                
                                    <div class="col-md-6 offset-md-4">
                                        <button type="submit" class="btn btn-primary">
                                       Save
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
            </div>
        </div>
        <br>
    </div>

</main>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html> 
  </div>

  <div id="Tokyo" class="w3-container w3-border city" style="display:none">
  
<section>
  <!--for demo wrap-->
  <div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
      <thead>
        <tr>
         <th>Mã Sinh Viên</th>
          <th>Họ Và Tên</th>
          <th>Ngành Học</th>
          <th>Ngày Sinh</th>
          <th>Giới Tính</th>
          <th>Địa CHỉ</th>
          <th>Số Điện Thoại</th>
        </tr>
      </thead>
    </table>
  </div>
  <div class="tbl-content">
    <table cellpadding="0" cellspacing="0" border="0">
      <tbody>
      <%@page import = "java.sql.*" %>
         <%@page import = "java.util.ArrayList" %>
          <%@page import = "dao.student_dao" %>
          <%@page import = "controller.student" %>
         <%ArrayList<student> list = student_dao.getInstance().selectALL(); 
         for(student t: list){ %>
        <tr>
         <td><%=t.getId() %></td>
         <td><%=t.getHoten()%></td>
         <td><%=t.getNganhhoc()%></td>
         <td><%=t.getNgaysinh()%></td>
         <td><%=t.getGioitinh()%></td>
         <td><%=t.getDiachi()%></td>
         <td><%=t.getSdt()%></td>
       </tr>
        <%}%>
      </tbody>
    </table>
  </div>
</section>
</div>
<div id="Tokyo1" class="w3-container w3-border city" style="display:none">
   
<section>
  <!--for demo wrap-->
  <div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0" style="width: 100%">
      <thead>
        <tr>
          <th>Mã Sinh Viên</th>
          <th style="width: 15%">Họ Và Tên</th>
          <th>Cấu Trúc Dữ Liệu Và Giải Thuật</th>
          <th>Toán Rời Rạc 2</th>
          <th>Lý Thuyết Thông Tin</th>
          <th>Kiến Trúc Máy Tính</th>
          <th>Tư Tưởng Hồ Chí Minh</th>
          <th>Tiếng Anh</th>
          <th>Điểm Trung Bình</th>
        </tr>
      </thead>
    </table>
  </div>
  <div class="tbl-content">
    <table cellpadding="0" cellspacing="0" border="0">
      <tbody>
          <%@page import = "java.sql.*" %>
         <%@page import = "java.util.ArrayList" %>
          <%@page import = "dao.diem_dao" %>
          <%@page import = "controller.diem" %>
          <%@page import = "java.text.DecimalFormat" %>
         <%ArrayList<diem> list1 = diem_dao.getInstance().selectALL(); 
		  
         for(diem t : list1){ 
         double diemtb=t.getCtdlgt()+t.getTrr2()+t.getLttt()+t.getKtmt()+t.getTthcm()+t.gettAnh();
         
		  diemtb = 1.0*diemtb/6;
		   DecimalFormat df = new DecimalFormat("#.#");%>
        <tr>
         <td ><%=t.getId()%></td>
         <td style="width: 15%"><%=t.getHoten()%></td>
         <td><%=t.getCtdlgt()%></td>
         <td><%=t.getTrr2()%></td>
         <td><%=t.getLttt()%></td>
         <td><%=t.getKtmt()%></td>
         <td><%=t.getTthcm()%></td>
         <td><%=t.gettAnh()%></td>
         <td><%=df.format(diemtb)%></td>
       </tr>
        <%}%>
      </tbody>
    </table>
  </div>
</section>

</div>
    <hr class="new1">
  <center><h5>Học Viện Công Nghệ Bưu Chính Viễn Thông</h5></center>
  <hr class="new1">
<center><h5>Mọi thắc mắc xin vui lòng liên hệ qua số điện thoại : 0383870219</h5></center> 
  <hr class="new1">
<br>
</body>
</html>