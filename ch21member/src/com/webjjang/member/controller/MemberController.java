package com.webjjang.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webjjang.member.dto.MemberDTO;
import com.webjjang.util.Beans;
import com.webjjang.util.ServiceInterface;

/**
 * Servlet implementation class MemberController
 */
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(getClass().getName()+".doGet()");
		String command = Beans.getURI(request);
		String jsp = "";
		System.out.println(command);
		switch (command) {
		// 회원가입 폼
		case "/member/join.do":
			// jsp 이름을 만들어 내고 밑에서 forward 시킨다.
			jsp = Beans.getJsp(command);
			System.out.println(jsp);
			break;

		default:
			System.out.println("존재하지 않는 자원을 요청");
			jsp="/WEB-INF/views/error/404.jsp";
			break;
		}
		// jsp쪽으로 이동한다.
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(getClass().getName()+".doPost()");
		String command = Beans.getURI(request);
		String jsp = "";
		// 처리해야할 서비스 선언
		ServiceInterface service;
		System.out.println(command);
		try {
			switch (command) {
			case "/member/join.do":
				// 넘어오는 데이터를 MemberDTO에 담는다.
				MemberDTO memberDTO = new MemberDTO(
						request.getParameter("id"),
						request.getParameter("name"),
						request.getParameter("password"),
						null);
				service = Beans.getService(command);
				System.out.println(service);
				service.excute(memberDTO);
				jsp = request.getContextPath()+"/main/main.do";
				System.out.println(jsp);
				break;
	
			default:
				System.out.println("존재하지 않는 자원을 요청");
				jsp="/WEB-INF/views/error/404.jsp";
				break;
			}
			// uri쪽으로 이동한다.
			response.sendRedirect(jsp);
		}catch (Exception e) {
			// TODO: handle exception
			throw new ServletException(e);
		}
	}

}
