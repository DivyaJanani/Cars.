package com.cg.car.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private static	Connection connection=null;
		
		public static Connection getConnection() throws Exception
		{
		
			Properties p=new Properties();
			
			
			FileInputStream fIS=new FileInputStream("resources/db.properties");
				
				p.load(fIS);
				String driver=p.getProperty("driver");
				String url=p.getProperty("url");
				String username=p.getProperty("username");
				String password=p.getProperty("pass");
				
		
		
		
			Class.forName(driver);
			connection=DriverManager.getConnection(url,username,password);
			
	
		
		
		return connection;
		}
		
}
