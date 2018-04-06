package com.webjjang.board.service;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.board.dto.BoardDTO;

//Controller -> service -> dao 순으로 처리

public class BoardViewService {
	//1.글번호에 맞는 글의 조회수를 1 증가 시킨다.
	//2.글번호를 받아서 알맞은 데이터를 가져온다.
	public BoardDTO process(int no){
		//글번호를 받아서 알맞는 데이터를 가져온다.
//		System.out.println("BoardViewService.process()");
		BoardDTO boardDTO = new BoardDTO();
		//글번호에 맞는 boardDTO에 데이터를 가져와서 채우는 프로그램 작성
		//객체 생성하고 호출
		BoardDAO boardDAO = new BoardDAO();
		// 1. 1증가 시킨다.
		boardDAO.increase(no);
		// 2. 글을 가져온다.
		boardDTO = boardDAO.view(no);
		
		
		return boardDTO;
	}
}
