package util;

import java.text.DecimalFormat;

public class FormatUtil {
	
	//long type의 날짜 정보를 받아서 패턴에 맞는 형태로 리턴해주는 메서드
	public static String number(long number, String pattern) {
		DecimalFormat format = new DecimalFormat(pattern);
		return format.format(number);
	}
}
