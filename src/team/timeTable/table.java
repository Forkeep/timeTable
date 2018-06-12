package team.timeTable;

import java.awt.print.Printable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;

/**
 * 排课功能，输入：一周内的五天随意选择不上课的天，每天内随意选择不上课的节次
 * 输出：课表+未能成功排课的教师
 * @author lizhe
 * @date Jun 12, 2018
 * @descripe TODO
 */
public class table {
	public static void makeTable(ResultSet rs) throws SQLException {
		String[][] week1 = new String[5][5];//一维星期几，二维第几节
		String[] nottable = new String[10];
		int notableId=0;
	int frequency=0;
	
	for(int j=0; j<5;j++) {
		for(int i=0;i<5;i++) {
			week1[j][i] = null; 
			
		}
	}
	
	
	while(rs.next()) {
		frequency = rs.getInt(14);
		for(int i=1;i<=frequency;i++) {//判断需要一周上几节课
			int intable = 0;
			if(rs.getString(9).equals("1")) {//读取周信息，周一如果愿意上，那么。。。。
				if (rs.getString(4) .equals("1") && week1[0][0]==null ) {//第一节愿意上并且是空着的，那么拍进去
					week1[0][0] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(5) .equals("1")  && week1[0][1] ==null ) {
					week1[0][1] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(6) .equals("1")  && week1[0][2] ==null ) {
					week1[0][2] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(7) .equals("1")  && week1[0][3] ==null ) {
					week1[0][3] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(8) .equals("1")  && week1[0][4] ==null ) {
					week1[0][4] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
			}
			else if (rs.getString(10).equals("1")) {//读取周信息，周二如果愿意上，那么。。。。
				if (rs.getString(4) .equals("1")  && week1[1][0] ==null ) {
					week1[1][0] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(5) .equals("1")  && week1[1][1] ==null ) {
					week1[1][1] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(6) .equals("1")  && week1[1][2] ==null ) {
					week1[1][2] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(7) .equals("1")  && week1[1][3] ==null ) {
					week1[1][3] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(8) .equals("1")  && week1[1][4] ==null ) {
					week1[1][4] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
			}
			else if (rs.getString(11).equals("1")) {//读取周信息，周三如果愿意上，那么。。。。
				if (rs.getString(4) .equals("1")  && week1[2][0] ==null ) {
					week1[2][0] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(5) .equals("1")  && week1[2][1] ==null ) {
					week1[2][1] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(6) .equals("1")  && week1[2][2] ==null ) {
					week1[2][2] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(7) .equals("1")  && week1[2][3] ==null ) {
					week1[2][3] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(8) .equals("1")  && week1[2][4] ==null ) {
					week1[2][4] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
			}
			else if (rs.getString(12).equals("1")) {//读取周信息，周四如果愿意上，那么。。。。
				if (rs.getString(4) .equals("1")  && week1[3][0] ==null ) {
					week1[1][0] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(5) .equals("1")  && week1[3][1] ==null ) {
					week1[3][1] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(6) .equals("1")  && week1[3][2] ==null ) {
					week1[3][2] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(7) .equals("1")  && week1[3][3] ==null ) {
					week1[3][3] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(8) .equals("1")  && week1[3][4] ==null ) {
					week1[3][4] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
			}
			else if (rs.getString(13).equals("1")) {//读取周信息，周五如果愿意上，那么。。。。
				if (rs.getString(4) .equals("1")  && week1[4][0] ==null ) {
					week1[4][0] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(5) .equals("1")  && week1[4][1] ==null ) {
					week1[4][1] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(6) .equals("1")  && week1[4][2] ==null ) {
					week1[4][2] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(7) .equals("1")  && week1[4][3] ==null ) {
					week1[4][3] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
				else if (rs.getString(8) .equals("1")  && week1[4][4] ==null ) {
					week1[4][4] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
					intable=1;
				}
			}
			
			if (intable == 0) {
				nottable[notableId] = "教师："+ rs.getString(1) + "课程："+rs.getString(2) + "班级"+rs.getString(3);
				notableId++;
			}
		}
	}
	
	for(int j=0; j<5;j++) {
		for(int i=0;i<5;i++) {
			System.out.print(week1[j][i]+"\t");
			
		}
		System.out.println("");
	}
	
	for(int i=0;i<notableId;i++) {
		System.out.println("未成功排课的教师     "+nottable[i]);
	}
	
	
	}
}
	

