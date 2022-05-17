package controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.connector.Response;

import dao.diem_dao;
import dao.student_dao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/tracuu"})


public class tracuu extends HttpServlet {
   
  
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    PrintWriter printWriter = resp.getWriter();
	    resp.setContentType("text/html");
	    String id = req.getParameter("id");
	    System.out.println(id);
	    diem diem1 = new diem(id, null, 0, 0, 0, 0, 0, 0);
	    diem diem2 = diem_dao.getInstance().selectById(diem1);
	    if (diem2==null) {
	    	req.getRequestDispatcher("errorDgiOneView.html").include(req, resp);
		}
	    student student1 = new student(diem2.getId(), diem2.getHoten(), null, null, null, null, null);
	    student student2 = new student_dao().getInstance().selectById(student1);
	    
	    if(diem2!=null && student2 != null) {
	    	req.getRequestDispatcher("studentHome.jsp").include(req, resp);
	    }
	    else {
	    	req.getRequestDispatcher("errorDgiOneView.html").include(req, resp);
	    }
	}
	
}
