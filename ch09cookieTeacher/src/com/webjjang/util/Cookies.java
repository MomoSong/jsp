package com.webjjang.util;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;

public class Cookies {

	
	//쿠키를 생성하는 메서드
	// 이름, 값을 받아서 쿠키를 생성
	public static Cookie createCookie
	(String name, String value) throws IOException {
		return new Cookie(name,
				URLEncoder.encode(value,"utf-8"));
	}
	// 이름, 값, 경로, 유효시간을 받아서 쿠키를 생성
	public static Cookie createCookie
	(String name, String value, String path, int maxAge)
	throws IOException {
		Cookie c = createCookie(name, value);
		c.setPath(path);
		c.setMaxAge(maxAge);
		return c;
	}
	// 이름, 값, 도메인, 경로, 유효시간을 받아서 쿠키를 생성
	public static Cookie createCookie
	(String name, String domain, String value, String path, int maxAge)
			throws IOException {
		Cookie c = createCookie(name, value, path, maxAge);
		c.setDomain(domain);
		return c;
	}
	
	// 쿠키를 삭제되는 쿠키로 만들어서 리턴한다.
	// respons.addCookie(Cookies.deleteCookie("id"));
	public static Cookie deleteCookie
	(Cookie[] cookies,String name) throws IOException {
		if(cookies != null && cookies.length >0){
			for(Cookie c : cookies){
				if(c.getName().equals(name)) {
					return createCookie(name, "", "/", 0);
				}
			}
		}
		return null;
	}
	
	// 쿠키 값을 리턴
	public static String getValue
	(Cookie[] cookies,String name) throws IOException {
		if(cookies != null && cookies.length >0){
			for(Cookie c : cookies){
				if(c.getName().equals(name)) {
					return c.getValue();
				}
			}
		}
		return null;
	}
	
}
