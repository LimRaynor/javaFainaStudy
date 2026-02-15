package javaFainal.operator.conditionalStatemen_조건문;

public class LogicalOperator_논리연산자 {
	public static void main(String[] args) {

		boolean isOverWatch = true;
		boolean isTalon = false;
		String str;

		// 조건문이 여러개일때  && == and, || == or

		if (isOverWatch && isTalon) {
			str = "옵치 했다";
		} else {
			str = "옵치 안했다";
		}

		// if문으로
		if (isOverWatch || isTalon) {
			str = "옵치 했다";
		} else {
			str = "옵치 안했다";
		}
		System.out.println(str);
	}
}
