package com.churchapp.churchUtility;

import java.sql.DriverManager;
import java.sql.SQLException;



public class Connection {
	
	
	
	public static Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Exception {
        Connection conn = null;
        String passwords = "piD7S8Xv!xEK";
        String usernames = "teenyou_bolaji";
        String DRIVER = "com.mysql.jdbc.Driver";
	    String URL = "jdbc:mysql://localhost:3306/teenyou_church-app";
	   
        Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
        conn = (Connection) DriverManager.getConnection(URL,usernames,passwords);
        System.out.println("Connected to the database");
        return conn;
    }
	
	
	
	

}
