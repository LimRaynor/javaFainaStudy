package javaFainal.operator.conditionalStatemen_조건문;

public class if_만약 {
	public static void main(String[] args) {

		int i = 4;

		if (i < 3){
			System.out.println("True");
		}else if(i > 5){ // else if 중간에 조건문을 추가할때
			System.out.println("false");
		}else { // 조건문에 해당하지 않는 경우
			System.out.println("...");
		}

	}
}
