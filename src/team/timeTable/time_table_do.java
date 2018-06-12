package team.timeTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class time_table_do {
	private static Connection getConn() {
		 String driver = "com.mysql.cj.jdbc.Driver";
		    String url = "jdbc:mysql://localhost:3306/academic_secretary_system?characterEncoding=utf8&useSSL=true";
		    String username = "root";
		    String password = "1124";
		    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        System.out.println("Connecting to a selected database...");
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	        System.out.println("Connected database successfully!");
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	        System.out.println("Connected database NotFound!");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	
	
	public static ResultSet getAll() {

		Connection conn = getConn();
		String sql = "select * from time_table";
		PreparedStatement pstmt;
		ResultSet rSet = null;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			rSet = rs;
//			int col = rs.getMetaData().getColumnCount();
//			System.out.println("==========time_table==========");
//			while (rs.next()) {
//				for (int i = 1; i <= col; i++) {//i需要从1开始
//					
//					System.out.print(rs.getString(i)+"\t");
//					if ((i == 2) && (rs.getString(i).length() < 8)) {
//	                    System.out.print("\t");
//				}
//			}
//				System.out.println("");
//			}
//			System.out.println("============================");
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
			System.out.println("query failed!");
		}
		return rSet;
	}
	
}
