package javaFainal.operator.conditionalStatemen_조건문;

import java.util.Scanner;

public class Key_키보드입력 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		Long l = scanner.nextLong();

		System.out.println(scanner.next()); // 문자열 입력을 받으면  문자열 출력
	}
}
