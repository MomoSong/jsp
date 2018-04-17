package com.webjjang.member.controller;

import java.util.HashMap;
import java.util.Map;

public class Auth {

	
	// uri와 허용 권한을 넣어 두는 map 객체
	private static Map<String, Integer> authMap = new HashMap<>();
	// uri에 대해 권한을 셋팅하는 메서드
	public void addAuth(String uri, Integer grade) {authMap.put(uri, grade);}
	// uri의 등급과 사용자 등급을 비교헤서 사용자 등급이 허용되는 등급이면 true를 리턴한다.
	public boolean isAuth(String uri, Integer grade) {return authMap.get(uri) <= grade;}
	public boolean isGoLogin(String uri, Integer grade)
	{return authMap.get(uri) > 0 && (grade == null || grade == 0);}
}
