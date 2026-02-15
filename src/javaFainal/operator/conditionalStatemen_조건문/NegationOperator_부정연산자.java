package javaFainal.operator.conditionalStatemen_조건문;

public class NegationOperator_부정연산자 {
	public static void main(String[] args) {

		boolean isOverWatch = true;
		boolean isTalon = false;
		String str;

		// ! 부정 연산자 (참 -> 거짓, 거짓 -> 참)
		if (!isOverWatch || !isTalon) {
			str = "옵치 했다";
		} else {
			str = "옵치 안했다";
		}
		System.out.println(str);
	}
}
