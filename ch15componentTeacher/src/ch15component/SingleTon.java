package ch15component;
/*
 * 싱글톤 패턴 클래스 - 딱한번만 생성이되게해서 다른 클래스에서는 생성된 주소만 가져다 쓸수 있게 한다.
 * 1. 생성자 private으로 선언한다.
 * 2. 같은 클래스에서 생성자를 호출해서 생성한다.
 * 3. private static 변수에 저장해 놓는다.
 * 4. public static getInstance method를 만든다.
 */
public class SingleTon {

	// 2. 같은 클래스에서 생성자를 호출해서 생성한다.
	// 3. private static 변수에 저장해 놓는다
	private static SingleTon instance = new SingleTon();
	//1. 생성자 private으로 선언한다.
	private SingleTon() {}
	
	// 4. public static getInstance method를 만든다.
	public static SingleTon getInstance() {return instance;}
	
	// 5. 처리해야할 메서드
	public void print() {
		System.out.println("싱글톤 패턴의 처리");
	}
}
