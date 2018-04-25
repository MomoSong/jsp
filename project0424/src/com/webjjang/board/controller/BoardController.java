package com.webjjang.board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.board.service.BoardListService;
import com.webjjang.controller.ServiceInterface;


/**
 * Servlet implementation class BoardController
 *  url 맵핑은 1.web.xml에서 한다. 2.servlet 클래스의 클래스 이름 앞에 어노테이션을 쓴다.
 * 현재 servlet 프로젝트를 개발할때는 1번으로 하기로 한다.
 */

public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private static Map<String, ServiceInterface> serviceMap
	= new HashMap<>();
	private static Map<String, Object> daoMap
	= new HashMap<>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * 여기가 제일먼저 실행이 되서 모든 객체를 생성한다.
     * 서버가 실행될 때 같이 실행되도록 하려면 web.xml에 sevlet tag안에 load-on-startup을 설정한다
     * 없으면 맨처음 요청이 들어올 때 init()가 실행된다.
     * */
    
	public void init() throws ServletException {
		// 1. command.properties 파일을 사용해서 자동생성하게 할 수 있고
		// 2. new 생성하고 저장하게 만들면된다.
		System.out.println("dao 생성");
		// dao 생성 
		daoMap.put("boardDAO", new BoardDAO());
		System.out.println("service 생성");
		// service 생성
		serviceMap.put("/board/list.do", new BoardListService());
		// service의 dao setter에 dao를 넣어준다.
		try {
			System.out.println("서비스에 dao를 넣었다.");
			serviceMap.get("/board/list.do").setDAO(daoMap.get("boardDAO"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException(e);
		}
	}// end of init()
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + ".doGet()");
		//게시판 리스트:/board/list.do, 게시판 글쓰기 폼: /board/write.do, 
		//게시판 글수정 폼 : /board/update.do, 게시판 글보기: /board/view.do, 
		//게시판 글삭제 : /board/delete.do 
		System.out.println(request.getServletPath());//위치-프로젝트 밑의 
		String uri = request.getRequestURI();
		System.out.println(uri);
		// String.substring(begin) - begin 위치에서 마지막 까지 잘라낸다.
		// "testing servlet".substring(5) -> "ng servlet"
		System.out.println(request.getRequestURI()); //localhost를 제외한 나머지 주소
		String command = request.getRequestURI().substring(uri.indexOf(request.getServletPath()));
		System.out.println(command);
		
		try {
			
	
		//게시판 리스트:/board/list.do --> 물어본다. : if switch 문으로 물어본다.
		switch (command) {
		case "/board/list.do":
			System.out.println("게시판 리스트 처리하라고 시켰다.");
			//controller -> service -> dao 
			//-> Oracle(board) list 가져오기(select .... from board)
			// service를 생성하고 호출 --> 문제 ) 서버인 경우 동시 접속자가 100명이면 똑같은 프로그램이
			// 서버의 메모리로 들어와 존재하게 된다. -> 해결) 미리 1개만 생성하고 처리해야하는 사람을 주소를 
			// 받아서 같은 프로그램을 사용하게 한다. 1개의 프로그램만 사용하게 한다. -> 서버가 실행될때 딱 한번만
			// 실행이되는 init() 메서드를 사용한다.
			request.setAttribute("list", serviceMap.get(command).excute(null));
			request.getRequestDispatcher("/WEB-INF/views/board/list.jsp").forward(request, response);
			break;

		default:
			System.out.println("잘못된 요청");
			break;
		}
		}catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 반드시 method가 post라고 지정한 경우만
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + ".doPost()");
	}
	


}
