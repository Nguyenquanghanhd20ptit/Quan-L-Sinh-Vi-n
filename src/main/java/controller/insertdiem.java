package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.diem_dao;
import dao.student_dao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/success2"})
public class insertdiem extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		String id = req.getParameter("id");
		String hoten = req.getParameter("hoten");
		String ctdlgt = req.getParameter("ctdlgt");
		String trr2 = req.getParameter("trr2");
		String lttt = req.getParameter("lttt");
		String  ktmt = req.getParameter("ktmt");
		String tthcm = req.getParameter("tthcm");
		String tAnh = req.getParameter("tAnh");
		System.out.println(hoten); 	
		
		diem diem1 = new diem(id, hoten, Double.parseDouble(ctdlgt), Double.parseDouble(trr2), Double.parseDouble(lttt), Double.parseDouble(ktmt), Double.parseDouble(tthcm), Double.parseDouble(tAnh));
		student student1 =  new student(id, hoten, null, null, null, null, null);
	    student student2 = student_dao.getInstance().selectById(student1);
	  
	    if(student2 != null) {
	    
	    	diem_dao.getInstance().insert(diem1);
	    }
	    req.getRequestDispatcher("adminHome.jsp").include(req, resp);
	}
}
