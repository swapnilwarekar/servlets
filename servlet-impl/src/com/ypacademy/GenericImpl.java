package com.ypacademy;

import java.io.*;
import javax.servlet.*;

public class GenericImpl extends GenericServlet {
	
	private static final long serialVersionUID = 2687926756560332805L;

	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello generic impl</b>");
		out.print("</body></html>");

	}
}