package com.jeelsoft;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet("/add")
public class AddServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
		res.sendRedirect("sq");

//		 req.setAttribute("k",k);		 
//	 RequestDispatcher rd=req.getRequestDispatcher("sq");
//	 rd.forward(req, res);

	}
//		  res.setContentType("text/html");
//	        PrintWriter out = res.getWriter();
//	        out.println("<html><body>");
//	        out.println("<h2>Result is: " + k + "</h2>");
//	        out.println("</body></html>");
//	}

}
