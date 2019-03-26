package HRPack;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Booking
 */
@WebServlet("/Booking")
public class Booking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Booking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String pro_name = request.getParameter("prop_name");
		String pro_price = request.getParameter("price");
		String buyer_name = request.getParameter("buyer_name");
		String buyer_email = request.getParameter("email");
		String buyer_add = request.getParameter("buyer_add");
		String buyer_phone = request.getParameter("phone");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
			PreparedStatement ps = con.prepareStatement("Insert into booking(pro_name,pro_price,buyer_name,buyer_email,buyer_add,buyer_phone) values(?,?,?,?,?,?)");
			ps.setString(1, pro_name);
			ps.setString(2, pro_price);
			ps.setString(3, buyer_name);
			ps.setString(4, buyer_email);
			ps.setString(5, buyer_add);
			ps.setString(6, buyer_phone);
			int set = ps.executeUpdate();
			con.close();
			if(set>0) {
				response.sendRedirect("ThankYou.html");
			}
			else {
				response.sendRedirect("Booking.html");
			}
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
