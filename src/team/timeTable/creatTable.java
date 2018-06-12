package team.timeTable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class creatTable {
 private static final String NULL = null;

public static void main(String[] args) throws SQLException {
	ResultSet rSet;
	 rSet=time_table_do.getAll();
//	int col = rSet.getMetaData().getColumnCount();
//	while (rSet.next()) {
//		for (int i = 1; i <= col; i++) {//i需要从1开始
//			
//			System.out.print(rSet.getString(i)+"\t");
//			
//	}
//		System.out.println("");
//	}
	
	table(rSet);
	
 }
	
	public static void table(ResultSet rs) throws SQLException {
		String[][] week1 = new String[5][5];//一维星期几，二维第几节
	int frequency=0;
	while(rs.next()) {
		frequency = rs.getInt(14);
		System.out.println(rs.getString(14));
		System.out.println(rs.getString(9));
		for(int i=1;i<=frequency;i++) {//判断需要一周上几节课
			if(rs.getString(9) == "1") {//读取周信息，周一如果愿意上，那么。。。。
				System.out.println(rs.getString(9));
				if (rs.getString(4) == "1" && week1[0][0] == NULL) {//第一节愿意上并且是空着的，那么拍进去
					week1[0][0] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(5) == "1" && week1[0][1] == NULL) {
					week1[0][1] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(6) == "1" && week1[0][2] == NULL) {
					week1[0][2] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(7) == "1" && week1[0][3] == NULL) {
					week1[0][3] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(8) == "1" && week1[0][4] == NULL) {
					week1[0][4] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
			}
			else if (rs.getString(10)=="1") {//读取周信息，周二如果愿意上，那么。。。。
				if (rs.getString(4) == "1" && week1[1][0] == NULL) {
					week1[1][0] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(5) == "1" && week1[1][1] == NULL) {
					week1[1][1] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(6) == "1" && week1[1][2] == NULL) {
					week1[1][2] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(7) == "1" && week1[1][3] == NULL) {
					week1[1][3] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(8) == "1" && week1[1][4] == NULL) {
					week1[1][4] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
			}
			else if (rs.getString(10)=="1") {//读取周信息，周三如果愿意上，那么。。。。
				if (rs.getString(4) == "1" && week1[2][0] == NULL) {
					week1[2][0] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(5) == "1" && week1[2][1] == NULL) {
					week1[2][1] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(6) == "1" && week1[2][2] == NULL) {
					week1[2][2] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(7) == "1" && week1[2][3] == NULL) {
					week1[2][3] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(8) == "1" && week1[2][4] == NULL) {
					week1[2][4] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
			}
			else if (rs.getString(10)=="1") {//读取周信息，周四如果愿意上，那么。。。。
				if (rs.getString(4) == "1" && week1[3][0] == NULL) {
					week1[1][0] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(5) == "1" && week1[3][1] == NULL) {
					week1[3][1] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(6) == "1" && week1[3][2] == NULL) {
					week1[3][2] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(7) == "1" && week1[3][3] == NULL) {
					week1[3][3] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(8) == "1" && week1[3][4] == NULL) {
					week1[3][4] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
			}
			else if (rs.getString(10)=="1") {//读取周信息，周五如果愿意上，那么。。。。
				if (rs.getString(4) == "1" && week1[4][0] == NULL) {
					week1[4][0] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(5) == "1" && week1[4][1] == NULL) {
					week1[4][1] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(6) == "1" && week1[4][2] == NULL) {
					week1[4][2] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(7) == "1" && week1[4][3] == NULL) {
					week1[4][3] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
				else if (rs.getString(8) == "1" && week1[4][4] == NULL) {
					week1[4][4] = rs.getString(1) + rs.getString(2) + rs.getString(3);
				}
			}
			
		}
	}
	
	for(int j=0; j<5;j++) {
		for(int i=0;i<5;i++) {
			System.out.print(week1[j][i]+"   ");
			
		}
		System.out.println("");
	}
	
	}
	
	
	
	
}
