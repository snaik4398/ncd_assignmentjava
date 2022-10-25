package com.exp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.getWriter().append("Served at: ").append(req.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  PrintWriter out=res.getWriter();
		  out.println("<!DOCTYPE html>");
	      out.println("<html>");
	      out.println("<head>");
	      out.println("<title>NCD Risk Assessment Checklist</title> ");
	      out.println("</head>");
	      out.println("<body>");
	      

		  String fnm=req.getParameter("fname");
		  String lnm=req.getParameter("lname");
		  String emal=req.getParameter("email");
		  String gen=req.getParameter("gender");
		  String pin=req.getParameter("gender");
		  String dob=req.getParameter("birthday");
		  out.println("Name: "+fnm+" "+lnm);

		  out.println("<br><br>");
		  out.println("Gender: " +gen);

		  out.println("<br><br>");
		  out.println("Email:"+emal);

		  out.println("<br><br>");
		  out.println("DOB:"+dob);

		  out.println("<br><br>");
		  out.println("PINCODE:"+pin);
		  
		  out.println("<br><br>");
//		  birthday
		  out.println("<a href=\"index.html\" class=\"sign\">calculate data </a>");
		  
		  
		  out.println("</h2><br><br><button onclick=\"location.href = 'signuppage.html';\" id=\"myButton\" class=\"float-left submit-button\" >Home</button>\r\n"
			  		+ "");
			  
			/* int j1=Integer.parseInt(req.getParameter("2pp")); */
	      out.println("</h2><br><br><button type=\"reset\"  onclick=history.back() align=center>Go Back</button>");
	      out.println("</body>");
	      out.println("</html>");
			/* doGet(req, res); */
	}

}
