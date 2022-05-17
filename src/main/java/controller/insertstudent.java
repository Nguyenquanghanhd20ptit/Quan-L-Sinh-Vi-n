package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.student_dao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/success1"})
public class insertstudent extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		String id = req.getParameter("id");
		String hoten = req.getParameter("hoten");
		String nganhhoc = req.getParameter("nganhhoc");
		String ngaysinh = req.getParameter("ngaysinh");
		String gioitinh = req.getParameter("gioitinh");
		String diachi = req.getParameter("diachi");
		String std = req.getParameter("sdt");
		System.out.println(hoten);
		student student1 = new student(id, hoten, nganhhoc, ngaysinh,gioitinh, diachi, std);
	    student_dao.getInstance().insert(student1);
	    req.getRequestDispatcher("adminHome.jsp").include(req, resp);
	    
	}

}
