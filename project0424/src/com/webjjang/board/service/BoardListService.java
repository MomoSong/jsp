package com.webjjang.board.service;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.controller.ServiceInterface;

public class BoardListService implements ServiceInterface {
	
	private BoardDAO boardDAO;
	
	@Override
	public void setDAO(Object dao) throws Exception {
		// TODO Auto-generated method stub
		this.boardDAO = (BoardDAO)dao;
	}

	@Override
	public Object excute(Object obj) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName()+"excute()");
		//list() 호출하면 List<BoardDTO> 가 나온다.
		return boardDAO.list((Integer) obj);
	}

}
