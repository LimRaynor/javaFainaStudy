package javaFainal.operator.conditionalStatemen_조건문;

import java.util.Random;

public class Random_무작위 {
	public static void main(String[] args) {
		Random random = new Random();

		// [수정] nextInt(4)는 0~3이므로 +5하면 5~8, 5~9를 원하면 nextInt(5) 사용
		int ran = random.nextInt(5) + 5; // 5 ~ 9
		// 5 ~ 9 까지 구하고싶을때
		// nextInt(5) -> 0~4 -> +5 -> 5 ~ 9


		System.out.println(ran);
	}
}
