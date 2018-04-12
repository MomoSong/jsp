package mvc.controller;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class ControllerUsingURI
 */
//@WebServlet("/ControllerUsingURI")
public class ControllerUsingURI extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//처리해야할 서비스 객체를 생성해서 저장하는 Map객체 생성
	//생성할 객체의 정보 web.xml에 정의되어 있는 commandHandler.properties파일에 있다.
	public static Map<String, ServiceInterface> commandHandlerMap =
			new HashMap<>();
	
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		
		/* 설정된 파일을 불러오자 */
		
		System.out.println("ControllerUsingURI.ini()");
		//web.xml에 init-param tag로 정의되어 있는 값을 받아온다.
		String configFile = getInitParameter("configFile");
		System.out.println(configFile);
		
		/*실제적인 위치의 파일을 Properties 객체에 읽어오자*/
		
		//컴퓨터 하드에 위치하는 실제적인 위치가 필요하다.
		String configFilePath = getServletContext().getRealPath(configFile);
		System.out.println(configFile);
		// key = value 값을 받아올 수 있는 객체 Properties를 이용해서 문자열로 받아낸다.
		Properties prop = new Properties();
		//try(자원 선언) -> close()를 생략할 수 있다.
		try(FileReader fis = new FileReader(configFilePath)){
			// properties 파일에서 부터 k = v 형식으로 저장된 모든 정보를 읽어온다. 
			// key: String, value : String -> 지네릭스를 할 필요가 없음 따라서 안함
			prop.load(fis);
		}catch (Exception e) {
			System.out.println("읽기 오류");
		}
		
		/*Properties에 있는 내용으로 객체를 자동생성하게 하자.*/
		
		//prop 객체에서 키 -> set -> iterator : 선언된 모든 객체 생성
		Iterator<Object> keyIter = prop.keySet().iterator();
		while(keyIter.hasNext()) {
			String command = (String) keyIter.next();
			System.out.println(command);
			String handlerClassName = (String) prop.get(command);
			System.out.println(handlerClassName);
			//클래스 이름을 알아내면 자동으로 객체로 생성할 수 있다.
			try {
				Class<?> handlerClass = Class.forName(handlerClassName);
				//자동으로 객체를 생성해서 저장한다. 
				ServiceInterface handlerInstance 
				= (ServiceInterface) handlerClass.newInstance();
				//key:command, value:handlerInstance-생성된 객체
				//Map에 저장
				commandHandlerMap.put(command, handlerInstance);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		commandHandlerMap.get("/board/list.do").excute();
			
	}

}
