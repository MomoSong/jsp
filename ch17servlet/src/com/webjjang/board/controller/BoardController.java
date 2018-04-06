package com.webjjang.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardController
 */
//@WebServlet("/BoardController")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("게시판 처리");
		
		System.out.println(request.getContextPath());
		System.out.println(request.getRequestURI());
		System.out.println(request.getServletPath());
		//요청 URI로 실행을 무엇을 할지 결정한다.
		//게시판 리스트 - /ch17servlet/board/list.do
		//게시판 글보기 - /ch17servlet/board/view.do
		//게시판 글쓰기 - /ch17servlet/board/write.do(Get)
		//게시판 글쓰기처리 - /ch17servlet/board/write.do(Post)
		//게시판 수정 - /ch17servlet/board/update.do(Get)
		//게시판 수정처리 - /ch17servlet/board/update.do(Post)
		//게시판 글삭제 - /ch17servlet/board/delete.do
		
		switch (request.getRequestURI()) {
		case "/ch17servlet/board/list.do":
			System.out.println("게시판 글리스트 처리");
			break;
		case "/ch17servlet/board/view.do":
			
			break;
			
		case "/ch17servlet/board/write.do":
			
			break;
			
		case "/ch17servlet/board/update.do":
			
			break;
		
		case "/ch17servlet/board/delete.do":
			
			break;

		default:
			System.out.println("요청하신 자원이 존재하지 않습니다.");
			break;
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
