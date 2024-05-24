package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("pass");
		String gender = req.getParameter("gender");
		String city = req.getParameter("city");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish a connection to the MySQL database
			String url = "jdbc:mysql://localhost:3306/contacts";
			String username = "root";
			String password2 = "";
			Connection con = DriverManager.getConnection(url, username, password2);
			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO `register`(`Name`, `Email`, `Password`, `Gender`, `City`) VALUES (?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, gender);
			ps.setString(5, city);
			int count = ps.executeUpdate();
			if (count > 0) {
				res.setContentType("text/html");
				out.print(
						"<h3 style='color:green; font-family: Arial, sans-serif; font-size: 20px; padding: 10px; border: 2px solid green; background-color: #f0fff0; text-align: center;'>User Register Successfully</h3>");

				RequestDispatcher rd = req.getRequestDispatcher("Profile.jsp");
				rd.include(req, res);
			} else {
				res.setContentType("text/html");
				out.print("<h3 style='color:red'> Not Registered due to some technical error!!</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("Register_1.jsp");
				rd.include(req, res);
			}
		} catch (Exception e) {
			System.out.println(e);
			res.setContentType("text/html");
			out.print("<h3 style='color:red'> Not Registered due to some technical error-2!!</h3>");
		}
	}
}
