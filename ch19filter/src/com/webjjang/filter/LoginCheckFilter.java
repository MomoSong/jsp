package com.webjjang.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LoginCheck
 */
// web.xml에 설정하고 적용한다.
// @WebFilter("/LoginCheck")
public class LoginCheckFilter implements Filter {
	public static List<String> loginUri = new ArrayList<>();

	/**
	 * Default constructor.
	 */
	public LoginCheckFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		// request는 ServletRequest 이므로 getServletPath 같은 메서드가 존재하지 않는다.
		// HttpServletRequest 캐스팅 해서 사용한다.
		HttpServletRequest req = (HttpServletRequest) request;
		String path = req.getServletPath();
		String uri = req.getRequestURI();
		
		String res = uri.substring(uri.indexOf(path));
		
		System.out.println("LoginCheckFilter.doFilter.req.servletPath : " + path);
		System.out.println("LoginCheckFilter.doFilter.req.uri : " + uri);
		System.out.println("LoginCheckFilter.doFilter.res : " + res);
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
