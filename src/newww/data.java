package newww;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String jdbcURL="jdbc:derby:qdatabase;create=true";
      try {
		Connection connection=DriverManager.getConnection(jdbcURL);
		System.out.println("database created");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
