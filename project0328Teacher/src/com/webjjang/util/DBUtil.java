package com.webjjang.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	// 오라클에 접속할 때 필요한 정보들
	private static String driver 
	= "oracle.jdbc.driver.OracleDriver"; //오라클사에서 제공
	// server 정보
	private static String server 
	= "jdbc:oracle:thin:@192.168.137.201:1521:orcl";
	private static String uid="java00";
	private static String upw = "java00";
	
	static { // 1. 드라이버 확인 --> static으로 자동 초기화 블록실행
		try {
			Class.forName(driver);
			System.out.println
			("정상적으로 jdbc 드라이버가 확인 되었습니다.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// connection 객체를 전달해 주는 프로그램 작성 //2. 연결
	public static Connection getConnection()
			throws SQLException  {
		return DriverManager
		.getConnection(server, uid, upw);
	}
	
	// DB관련 객체를 닫는 메서드 - select
	public static void close
	(Connection con, PreparedStatement pstmt, ResultSet rs)
			throws SQLException {
		close(con,pstmt);
		if(rs != null) rs.close();
	}
	// DB관련 객체를 닫는 메서드 - insert, update, delete
	public static void close
	(Connection con, PreparedStatement pstmt)
			throws SQLException {
		if(con != null) con.close();
		if(pstmt != null) pstmt.close();
	}
}
