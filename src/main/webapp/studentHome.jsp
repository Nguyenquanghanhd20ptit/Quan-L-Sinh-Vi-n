<%@page import="controller.tracuu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<img src="logo.png"  align="left"width="150" height="150">
<center><img src="ptit.png" width="150" height="150" style="border-radius: 50%">
<img src="apj sir.png" align="right"  width="150" height="150"></center>
    <a href="dgiOneView.html">Back</a>
  <hr class="new1">
<style>
table{
  width:100%;
  table-layout: fixed;
}
th{
  padding: 20px 15px;
  text-align: left;
  font-weight: 500;
  font-size: 12px;
  color: #fff;
  text-transform: uppercase;
 border: 2px solid rgba(255,255,255,0.3);
}


/* demo styles */

@import url(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);
body{
  background: -webkit-linear-gradient(left, #25c481, #25b7c4);
  background: linear-gradient(to right, #25c481, #25b7c4);
  font-family: 'Roboto', sans-serif;
}

</style>
  <!--for demo wrap-->
  <div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
      <thead>
       <%@page import = "java.sql.*" %>
         <%@page import = "java.util.ArrayList" %>
          <%@page import = "controller.student" %>
          <%@page import = "controller.diem" %>
          <%@page import = "dao.student_dao" %>
          <%@page import = "dao.diem_dao" %>
         <% 
        String id = request.getParameter("id");
 	    diem diem1 = new diem(id, null, 0, 0, 0, 0, 0, 0);
 	    diem d = diem_dao.getInstance().selectById(diem1);
 	    student student1 = new student(d.getId(), d.getHoten(), null, null, null, null, null);
 	    student t = new student_dao().getInstance().selectById(student1);
         %>
        <tr>
          <th>Mã Sinh Viên : <%=t.getId() %> </th>
          <th>Họ Và Tên : <%=t.getHoten()%> </th>
          <th>Ngành Học : <%=t.getNganhhoc()%></th>
          <th><center>Ngày Sinh : <%=t.getNgaysinh()%></center></th>
        </tr>
      </thead>
      <thead>
        <tr>
          <th>Giới Tính : <%=t.getGioitinh()%></th>
          <th>Địa chỉ : <%=t.getDiachi()%></th>
          <th>Số Điện Thoại : <%=t.getSdt()%></th>
          <th><a titlt="print screen" alt="print screen" onclick="window.print();" target="_blank" style="cursor:pointer;"><center><img src="print.png"></center></a></th>
        </tr>
      </thead>
    </table>
  </div>
<style>
html {
  font-family:arial;
  font-size: 25px;
}

td {
  border: 2px solid #726E6D;
  padding: 15px;
  color:black;
  text-align:center;
}

thead{
  font-weight:bold;
  text-align:center;
  background: #625D5D;
  color:white;
}

table {
  border-collapse: collapse;
}

.footer {
  text-align:right;
  font-weight:bold;
}

tbody >tr:nth-child(odd) {
  background: #D1D0CE;
}

</style>
<head>
  <hr class="new1">
</head>
<body>
  <table>
    <thead>
      <tr>
        <td colspan="3">Môn Học</td>
        <td rowspan="2">Số Tín Chỉ</td>
        <td rowspan="2">Tổng điểm</td>
        <td rowspan="2">Xếp Loại</td>
        <td rowspan="2">Trạng Thái</td>
        
      </tr>
      <tr>
        <td>Mã Môn Học </td>
        <td colspan="2"> Tên Môn </td>
      </tr>
    </thead>
    <tbody>
         <%!public String xephang(double a){
        	 String s;
             if(a<4) s="F";
             else  if(a>=4 && a<5) s="D";
             else if(a>=5 && a<5.5) s="D+";
             else  if(a>=5.5 && a<6.5) s="C";
             else  if(a>=6.5 && a<7) s="C+";
             else  if(a>=7 && a<8) s="B";
             else if(a>=8 && a<8.5) s="B+";
             else  if(a>=8.5 && a<9) s="A";
             else s="A+";
            return s;
         }%>
         
        <%!public String trangthai(double a){
        	 String s;
        	 if(a<4) s="Trượt Môn";
        	 else s="Đạt";
        	 return s;
         }%>
      <tr>
        <td>INT1306</td>
        <td colspan="2">Cấu Trúc Dữ Liệu Và Giải Thuật </td>
        <td>3 Tín Chỉ</td>
        <td><%=d.getCtdlgt()%> </td>
        <td><%=xephang(d.getCtdlgt()) %> </td>
        <td><%=trangthai(d.getCtdlgt()) %></td>
      </tr>
      <tr>
        <td>INT1359</td>
        <td colspan="2">Toán Rời Rạc 2</td>
        <td>3 Tín Chỉ</td>
        <td><%=d.getTrr2()%></td>
        <td><%=xephang(d.getTrr2()) %></td>
        <td><%=trangthai(d.getTrr2()) %></td>
      </tr>
      <tr>
        <td>ELE1319</td>
        <td colspan="2">Lý Thuyết Thông Tin</td>
        <td>3 Tín Chỉ</td>
        <td><%=d.getLttt()%></td>
        <td> <%=xephang(d.getLttt())%></td>
        <td><%=trangthai(d.getLttt()) %></td>
      </tr>
      <tr>
        <td>INT13145</td>
        <td colspan="2">Kiến Trúc Máy Tính </td>
        <td>3 Tín chỉ</td>
        <td><%=d.getKtmt()%></td>
        <td> <%=xephang(d.getKtmt())%></td>
        <td><%=trangthai(d.getKtmt()) %></td>
      </tr>
      <tr>
        <td>BAS1122</td>
        <td colspan="2">Tư Tưởng Hồ Chí Minh</td>
        <td>2 Tín Chỉ</td>
        <td><%=d.getTthcm()%></td>
        <td><%=xephang(d.getTthcm())%> </td>
        <td> <%=trangthai(d.getTthcm()) %> </td>
      </tr>
      <tr>
        <td>BAS1159</td>
        <td colspan="2">Tiếng Anh</td>
        <td>4 Tín Chỉ</td>
        <td><%=d.gettAnh()%></td>
        <td><%=xephang(d.gettAnh())%></td>
        <td> <%=trangthai(d.gettAnh()) %></td>
      </tr>
    </tbody>
    <tfoot>
      <tr>
         <%@page import = "java.text.DecimalFormat" %>
      <%double diemtb=d.getCtdlgt()+d.getTrr2()+d.getLttt()+d.getKtmt()+d.getTthcm()+d.gettAnh();
		  diemtb = 1.0*diemtb/6;
		   DecimalFormat df = new DecimalFormat("#.#");%>
        <td colspan="4" class="footer">Điểm Trung Bình</td>
        <td colspan="3"><%=df.format(diemtb)%></td>
      </tr>
      <tr>
        <%double gpa = ((1.0*d.getCtdlgt()/18)*3+(1.0*d.getTrr2()/18)*3+(1.0*d.getLttt()/18)*3+(1.0*d.getKtmt()/18)*3+(1.0*d.getTthcm()/18)*2+(1.0*d.gettAnh()/18)*4)*0.4;  %>
        <% DecimalFormat df2 = new DecimalFormat("#.##");%>
        <td colspan="4" class="footer">GPA</td>
        <td colspan="3"><%=df2.format(gpa)%></td>
      </tr>
  </table>
    <hr class="new1">
  <center><h6>Điểm được cập nhật thường xuyên từ học viện Công Nghệ Bưu Chính Viễn Thông</h6></center>
  <hr class="new1">
<center><h6>Mọi thắc mắc xin vui lòng liên hệ qua số điện thoại : 0383870219</h6></center> 
  <hr class="new1">
</body>