package DemoPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import javax.websocket.Session;



/**
 * Servlet implementation class Validate
 */
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
		String em = request.getParameter("email");
		String pass =request.getParameter("password");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://128.66.203.247/it1718b14", "it1718b14", "sumo@123");
			PreparedStatement stt = con.prepareStatement("SELECT * FROM demo WHERE email = ? and password = ?");
			stt.setString(1, em);
			stt.setString(2, pass);
			
			ResultSet rs = stt.executeQuery();
			if(rs.next())
			{
				HttpSession session=request.getSession();
				session.setAttribute("uname", rs.getString(1));
				response.sendRedirect("Display.jsp");
				
			}
			else
			{
				PrintWriter pw=response.getWriter();
				pw.print("username or password incorrect");
				request.getRequestDispatcher("login.html").include(request, response);
			}
			stt.close();
			con.close();
			response.sendRedirect("login.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
