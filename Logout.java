package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.*;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.invalidate();
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println(
				"<h2 style='color: red; font-family: Arial, sans-serif; font-size: 24px; padding: 15px; border: 2px solid red; background-color: #ffe6e6; text-align: center; text-shadow: 1px 1px 2px #000000;'>Logout Successfully...</h2>");

		RequestDispatcher rd = req.getRequestDispatcher("/index.html");
		rd.include(req, res);
	}
}
