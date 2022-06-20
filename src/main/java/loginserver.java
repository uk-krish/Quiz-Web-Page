

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


/**
 * Servlet implementation class loginserver
 */
public class loginserver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginserver() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		try {
  			PrintWriter out=response.getWriter();
  			Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            PreparedStatement ps;
		      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Unni8664!");
		      String n=request.getParameter("txtName");
		      String p=request.getParameter("txtPwd");
		       ps=con.prepareStatement("select name from user_data where name=? and password=?");
		      ps.setString(1, n);
		      ps.setString(2, p);
		      ResultSet rs=ps.executeQuery();
		      if(rs.next()) {
		    	  RequestDispatcher rd=request.getRequestDispatcher("Quizz.jsp");
		    	  rd.forward(request, response);
		      }
		      else {
		    	  RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		    	  rd.forward(request, response);
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

