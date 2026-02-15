package javaFainal;

public class ArrayInitialization_배열초기화 {
	public static void main(String[] args) {

		// 똑같은 변수를 여러개 가져야하는 케이스에 사용하면 편리
/*		int[] score; // 배열 선언
		score = new int[5];*/ // 배열 초기회

		int [] score = /*new int[]*/ {10, 20, 30, 40, 50}; // 선언과 동시에 초기화 5개의 inteser을 담은배열
		int count = score.length;
		System.out.println(count); // 배열의 길이

		score[0] = 10; // 0 번째 배열에 10값 입력
/*		score[1] = 20; // 1 번째 배열에 10값 입력
		score[2] = 30; // 2 번째 배열에 10값 입력
		score[3] = 40; // 3 번째 배열에 10값 입력*/

		System.out.println(score[4]); // [5]중에서 마지막 배열 호출
		System.out.println(score[score.length - 1]);// 배열길이에서 -1 번째 호출 -> [5]중에서 마지막 배열 호출

	}
}
