package com.webjjang.board.service;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.board.dto.BoardDTO;

public class BoardViewService {
	public BoardDTO process(int no){
		System.out.println("BoardViewService.process()");
		BoardDTO boardDTO = null;
		// list에 데이터를 가져와서 채우는 프로그램 작성
		// 객체 생성하고 호출
		BoardDAO boardDAO = new BoardDAO();
		boardDTO = boardDAO.view(no);
		return boardDTO;
	}
}
