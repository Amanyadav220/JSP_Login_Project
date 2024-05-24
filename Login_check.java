package in.sp.backend;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/Login_check")
public class Login_check extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String my_email = req.getParameter("user");
		String pass = req.getParameter("pass");

		if (my_email != null && my_email.equals(my_email) && pass.equals(pass)) {
//			PrintWriter out = res.getWriter();
//			req.setAttribute("name_key", "Aman Yadav");
			HttpSession session = req.getSession();
			session.setAttribute("name_key", my_email);
			RequestDispatcher rd = req.getRequestDispatcher("/Profile.jsp");
			rd.forward(req, res);
//			res.sendRedirect("https://www.google.com/");
		} else {
			System.out.println("fail");
			PrintWriter out = res.getWriter();
			res.setContentType("text/html");
			out.println("<h3 style='color:red'>Error! Login again...</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);

		}
	}
}
