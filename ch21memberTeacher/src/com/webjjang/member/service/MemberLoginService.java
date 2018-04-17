package com.webjjang.member.service;

import com.webjjang.member.dao.MemberDAO;
import com.webjjang.member.dto.MemberDTO;
import com.webjjang.util.ServiceInterface;

public class MemberLoginService implements ServiceInterface {

	private MemberDAO memberDAO;
	@Override
	public void setDAO(Object obj) {this.memberDAO=(MemberDAO) memberDAO;}
	
	@Override
	public Object excute(Object obj) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(getClass().getName()+".excute()");
		memberDAO.login((MemberDTO) obj);
		System.out.println(obj);
		return obj;
	}

}
