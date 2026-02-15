package javaFainal.operator.Loop_반복문;

public class Continue_브레이크 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 6){
				break; // if문 조건까지만 실행하고 멈추겠다
			}
		}
	}
}
