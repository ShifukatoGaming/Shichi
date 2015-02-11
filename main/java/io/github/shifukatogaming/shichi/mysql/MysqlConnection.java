package io.github.shifukatogaming.shichi.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MysqlConnection {
	public static void init() throws SQLException, ClassNotFoundException 
	{
			Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Cookies1024");
	        String myTableName = "CREATE TABLE swagtest (" 
	                + "idNo INT(64) NOT NULL AUTO_INCREMENT,"  
	                + "initials VARCHAR(2)," 
	                + "agentDate DATE,"  
	                + "agentCount INT(64), "
	                + "PRIMARY KEY(idNo))";  
	        
	      PreparedStatement statement = con.prepareStatement(myTableName);
	      statement.executeUpdate();
	       
		
	}
	

	}

