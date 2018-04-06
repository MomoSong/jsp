package com.webjjang.board.service;

import com.webjjang.board.dao.BoardDAO;

//Controller -> service -> dao 순으로 처리

public class BoardDeleteService {
	public void process(int no){
//		System.out.println("BoardViewService.process()");
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.delete(no);
	}
}
