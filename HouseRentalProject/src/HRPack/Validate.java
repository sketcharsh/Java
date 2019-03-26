package HRPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		String email = request.getParameter("em");
		String psw = request.getParameter("ps");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
			PreparedStatement stt = con.prepareStatement("SELECT * FROM Users WHERE email = ? and password = ?");
			stt.setString(1, email);
			stt.setString(2, psw);
			ResultSet rs = stt.executeQuery();
			if(rs.next())
			{
				HttpSession session = request.getSession();
				session.setAttribute("ssn", email);
				response.sendRedirect("Home.jsp");
				
			}
			else {
				response.sendRedirect("Login.html");
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
