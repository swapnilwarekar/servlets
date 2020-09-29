package com.ypacademy;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Applicant extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = getServletConfig().getInitParameter("Email");
		String website = getServletContext().getInitParameter("Website-name");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + website + "</h1><br/><p>Contact us:" + email);
	}
}
