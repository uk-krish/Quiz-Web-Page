

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		try {
  			PrintWriter out=response.getWriter();

  			Class.forName("com.mysql.jdbc.Driver");
            Connection con;
		      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Unni8664!");
		      String n=request.getParameter("txtName1");
		      String p=request.getParameter("txtPwd1");
		      String e=request.getParameter("txtemail");
		      PreparedStatement ps= con.prepareStatement("insert into user_data values(?,?,?)");
              ps.setString(1,n);
              ps.setString(2,p);
              ps.setString(3,e);
		      if(ps.executeUpdate()>0) {
		    	  RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		    	  rd.forward(request, response);
		      }
		      else {
		    	  out.println("Fuck not Connection");
			}
		      
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
	}

}
