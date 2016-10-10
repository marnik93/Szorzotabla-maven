package hu.kvk.java;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/szorzotablaServlet")
public class Szozotabla extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		int parameter =  Integer.parseInt(req.getParameter("widthheight"));
		Szorzo szorzotabla = new Szorzo(parameter);
		int[][] tabla = szorzotabla.Szorzotabla();
		
		resp.getWriter().println("<table border='1'>");
		for (int i = 1; i < parameter+1; i++) {
			resp.getWriter().println("<tr>");
			for (int j = 1; j < parameter+1; j++) {
				resp.getWriter().print("<td>" + tabla[i][j] + "</td>");
			}
			resp.getWriter().print("</tr>");
		}
		resp.getWriter().println("</table>");
		
	}
}
