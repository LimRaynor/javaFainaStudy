package javaFainal.Array;

public class Array_배열 {
	public static void main(String[] args) {

		// 똑같은 변수를 여러개 가져야하는 케이스에 사용하면 편리
/*		int[] score; // 배열 선언
		score = new int[5];*/ // 배열 초기회

		int [] score = new int[5]; // 선언과 동시에 초기화 5개의 inteser을 담은배열
		int count = score.length;
		System.out.println(count);

		score[0] = 10; // 0 번째 배열에 10값 입력
		System.out.println(score[0]); // 0번째배열 호출

	}
}
