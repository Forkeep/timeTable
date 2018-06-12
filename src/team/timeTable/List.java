package team.timeTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class List {
	
private static Connection getConn() {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/academic_secretary_system?characterEncoding=utf8&useSSL=true";
	String username = "root";
	String password = "1124";
	Connection conn = null;
	try {
		Class.forName(driver);
		System.out.println("Connecting to a selected database...");
		conn = (Connection) DriverManager.getConnection(url, username, password);
	    System.out.println("Connected database successfully!");
	}catch(ClassNotFoundException e1){
		e1.printStackTrace();
        System.out.println("Connected database NotFound!");
	}catch(SQLException e2){
		e2.printStackTrace();
	}
	return conn;
}

	
}
