package com.ypacademy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletImpl implements Servlet {

	ServletConfig config = null;

	public void init(ServletConfig config) {
		this.config = config;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>SERVLET Impl</b>");
		out.print("</body></html>");

	}

	public void destroy() {
	
	}

	public ServletConfig getServletConfig() {
		return config;
	}

	public String getServletInfo() {
		return "YP academy";
	}

}
