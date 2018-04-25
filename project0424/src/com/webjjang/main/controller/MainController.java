package com.webjjang.main.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainController
 * url 맵핑은 1.web.xml에서 한다. 2.servlet 클래스의 클래스 이름 앞에 어노테이션을 쓴다.
 * 현재 servlet 프로젝트를 개발할때는 1번으로 하기로 한다.
 */
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 * get, post 둘다 받을 때 사용. service.
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + ". service()");
		System.out.println(request.getRequestURI());
		//jsp를 이용해서 HTML을 만들어서 사용자에게 보낸다.
		request.getRequestDispatcher("/WEB-INF/views/main/main.jsp")
		.forward(request, response);
	}

	

}
