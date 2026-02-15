package javaFainal.operator.conditionalStatemen_조건문;

public class TernaryOperator_삼항연산자 {
	public static void main(String[] args) {

		boolean isOverWatch = true;
		boolean isTalon = false;
		String str;

		// 삼항연산자로
		str = isOverWatch ? "옵치 했다" : "옵치 안 했다";

		// if문으로
		if (isOverWatch) {
			str = "옵치 했다";
		} else {
			str = "옵치 안했다";
		}



		System.out.println(str);
	}
}
