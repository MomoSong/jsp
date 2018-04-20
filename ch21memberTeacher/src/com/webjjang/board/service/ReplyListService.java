package com.webjjang.board.service;

import java.util.List;

import com.webjjang.board.dao.ReplyDAO;
import com.webjjang.board.dto.ReplyDTO;
import com.webjjang.util.ServiceInterface;

public class ReplyListService implements ServiceInterface{
	
	private ReplyDAO replyDAO;
	
	@Override
	public void setDAO(Object obj) {
		this.replyDAO = (ReplyDAO) obj;
	}
	
	@Override
	public List<ReplyDTO> excute(Object obj)  throws Exception{
		System.out.println("BoardListService.process()");
		List<ReplyDTO> list = null;
		// list에 데이터를 가져와서 채우는 프로그램 작성
		// 호출
		list = replyDAO.list((Integer) obj);
		return list;
	}
}
