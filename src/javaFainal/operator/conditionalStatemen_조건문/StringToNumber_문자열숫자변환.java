package javaFainal.operator.conditionalStatemen_조건문;

public class StringToNumber_문자열숫자변환 {
	public static void main(String[] args) {
		String str = "100";

		int i = Integer.parseInt(str); // 문자 -> 숫자
		long l = Long.parseLong(str); // 문자 -> 숫자

		String str2 = String.valueOf(i); // 숫자 -> 문자

		System.out.println(i);
		System.out.println(str2);
	}
}
