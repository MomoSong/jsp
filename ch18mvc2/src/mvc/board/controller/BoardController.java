package mvc.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.controller.ControllerUsingURI;
import mvc.controller.ServiceInterface;

/**
 * Servlet implementation class BoardController
 */
//@WebServlet("/BoardController")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		String uri = request.getRequestURI();
		String command = uri.substring(uri.indexOf(path));
		
		System.out.println("BoardController.doGet().command:" + command);
		
		ServiceInterface service 
		= ControllerUsingURI.commandHandlerMap.get(command);
		if(service == null) System.out.println("요청하신 자원이 없습니다.");
		else service.excute();
		
		
	}

}
