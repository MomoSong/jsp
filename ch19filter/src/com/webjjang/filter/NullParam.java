package com.webjjang.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class NullParam
 */
//@WebFilter("/NullParam")
public class NullParam implements Filter {

    /**
     * Default constructor. 
     */
    public NullParam() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here - 전처리
		System.out.println("NullParam.doFilter() - 전처리");
		long pretime = System.currentTimeMillis();
		// pass the request along the filter chain
		// 다른 필터를 호출하고 결국 servlet에 가서 실행하게 된다.
		
		chain.doFilter(request, response);
		//후처리
		System.out.println("NullParam.doFilter() - 후처리");
		long posttime = System.currentTimeMillis();
		System.out.println((posttime - pretime));
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
