package com.webjjang.member.exception;

public class DuplicateIdException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DuplicateIdException() {
		super("아이디가 중복되었습니다.");
	}

}
