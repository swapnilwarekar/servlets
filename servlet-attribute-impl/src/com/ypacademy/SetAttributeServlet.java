package com.ypacademy;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/set-attributes")
public class SetAttributeServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5970134103152370052L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().setAttribute("appl-scope", "Application scope attribute");
		req.getSession().setAttribute("session-scope", "Session scope attribute");
		req.setAttribute("request-scope", "Request scope attribute");
		RequestDispatcher rd=req.getRequestDispatcher("get-attributes");
		rd.forward(req, resp);
	}

}
