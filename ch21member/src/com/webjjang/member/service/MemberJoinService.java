package com.webjjang.member.service;

import com.webjjang.member.dao.MemberDAO;
import com.webjjang.util.ServiceInterface;

/*
 * MemberJoinService 객체를 한번만 생성하기 위해서 Beans안에서 생성해서 넣어놨다.
 * */
public class MemberJoinService implements ServiceInterface {

	// MemberJoinService가 한번만 생성이 되므로 MemberDAO 객체도 한번만 생성이 된다.
	private MemberDAO memberDAO = new MemberDAO();
	
	@Override
	public Object excute(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(getClass().getName() + ".excute()");
		return null;
	}

}
