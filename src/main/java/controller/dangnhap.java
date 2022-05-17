package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.user_dao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class dangnhap extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		teacher teacher1 = new teacher(username, password);
		teacher teacher2 = user_dao.getInstance().selectById(teacher1);
		if(teacher2!=null) {
			
			req.getRequestDispatcher("adminHome.jsp").include(req, resp);
		}
		else {
			req.getRequestDispatcher("errorAdminLogin.html").include(req, resp);
		}
	}
}
