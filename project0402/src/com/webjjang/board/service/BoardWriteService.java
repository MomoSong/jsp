package com.webjjang.board.service;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.board.dto.BoardDTO;

//Controller -> service -> dao 순으로 처리

public class BoardWriteService {
	public void process(BoardDTO boardDTO){
//		System.out.println("BoardViewService.process()");
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.write(boardDTO);
	}
}
