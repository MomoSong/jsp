package com.webjjang.util;

import java.util.Scanner;

public class InUtil {

	private static Scanner scanner = new Scanner(System.in);

	// 단순히 문자열을 입력받아 리턴한다.
	public static String getString() {
		return scanner.nextLine();
	}
	// 입력 메시지를 출력하고 문자열을 입력받아 리턴한다.
	public static String getMenu(String str) {
		System.out.print(str+":");
		return getString();
	}
	// 메뉴를 출력하고, 입력 메시지를 출력하고 문자열을 입력받아 리턴한다.
	public static String getMenu(String menu, String str) {
		System.out.println("\n\n"+menu);
		return getMenu(str);
	}
	
	// 단순히 숫자만 입력 받아 리턴한다.
	// 숫자가 아닌 데이터가 들어오면 예외처리 해야 한다.
	public static int getInt() throws Exception{
		return Integer.parseInt(getString());
	}
	// 입력데이터 항목 이름과 함께 숫자가 아닌 데이터가 들어오면 예외처리한다.
	public static int getInt(String str) throws Exception{
		return Integer.parseInt(getMenu(str));
	}
	
	// 숫자가 아닌 데이터가 들어오면 숫자를 입력해야 합니다.를 출력하고 다시 입력
	public static int getIntWithCheck(String str) {
		while(true) {
			try {
				// 숫자를 받아서 리턴한다.
				return getInt(str);
			} catch (Exception e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				// 숫자 형식에 안 맞는 경우.
				System.out.println("숫자[0-9]를 입력하셔야 합니다.");
			}
		}
	}
}
