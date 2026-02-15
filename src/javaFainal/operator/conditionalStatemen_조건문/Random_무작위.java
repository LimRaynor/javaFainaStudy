package javaFainal.operator.conditionalStatemen_조건문;

import java.util.Random;

public class Random_무작위 {
	public static void main(String[] args) {
		Random random = new Random();

		int ran = random.nextInt(4) + 5; // 5 ~ 9
		// 5 ~ 9 까지 구하고싶은때
		// 0~4 -> +5 -> 5 ~ 14


		System.out.println(ran);
	}
}
