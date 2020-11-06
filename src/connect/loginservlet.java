package connect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/loginservlet" })
public class loginservlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	   PrintWriter out = response.getWriter();  
	          
	    String u=request.getParameter("uname");  
	    String p=request.getParameter("psw");  
	          
	   try {
		   String driver="org.apache.derby.jdbc.EmbeddedDriver";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(  
			"jdbc:derby:C:\\\\Users\\\\PAVITRA\\\\qdatabase","","");  
			String sql="select * from loginu";
			Statement smt=con.createStatement();
			ResultSet result=smt.executeQuery(sql);
			int flag=0;
			while(result.next()) {
				String uname=result.getString("uname");
				String password=result.getString("psw");
				if(u.equals(uname)&& p.equals(password)) {
					out.println("succesfully log in");
					response.sendRedirect("python.jsp");
					flag=1;
					break;
				}
				if(flag==0) {
					out.println("error");
				}
				con.close();
	   }
	    out.close();  
	    }
	   catch(SQLException e) {
		   e.printStackTrace();
	   }
	   catch(ClassNotFoundException e) {
		   e.printStackTrace();
	   }
	}}  


