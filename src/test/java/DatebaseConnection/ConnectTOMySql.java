package DatebaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectTOMySql {
	@Test
	public void TestDB() throws ClassNotFoundException, SQLException 
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","1302");
	
		System.out.println("Connected to MySql DB");
		Statement smt=con.createStatement();
		ResultSet rs = smt.executeQuery("select * from seleniumuser");
		while (rs.next()) {
			String firstName = rs.getString("firstname");
			System.out.println(firstName);
			
			
		}
		
	
	}

}
