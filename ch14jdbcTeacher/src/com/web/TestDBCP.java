package com.web;

import java.io.IOException;
import java.sql.Connection;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestDBCP
 */
@WebServlet("/testDBCP")
public class TestDBCP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDBCP() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DataSource dataSource
		   = (DataSource) new InitialContext().lookup("java:comp/env/jdbc/OracleDB");
		   Connection con =  dataSource.getConnection();
		   System.out.println("DB 연결 성공");
		   con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DB연결 중 오류");
			e.printStackTrace();
		}
	}

}
