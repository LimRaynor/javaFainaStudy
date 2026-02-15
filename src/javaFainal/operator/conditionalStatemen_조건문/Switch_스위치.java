package javaFainal.operator.conditionalStatemen_조건문;

public class Switch_스위치 {
	public static void main(String[] args) {

		boolean isOverWatch = true;
		boolean isTalon = false;
		String str;

		if (isOverWatch || isTalon) {
			str = "옵치 했다";
		} else {
			str = "옵치 안했다";
		}

		switch (str){
			case "옵치 했다":
				System.out.println("O"); // 맞을때 break
				break; // break가 없으면 전부 실행됨
			case "옵치 안했다":
				System.out.println("X"); // 아닐때 break
				break;
			default:
				System.out.println("?"); // 둘다 아닐때
		}
		System.out.println(str);
	}
}
