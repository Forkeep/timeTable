package team.timeTable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class creatTable {

public static void main(String[] args) throws SQLException  {
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
	 table.makeTable(rSet);
 }
}

	
	

	
	
	
	

