package javaFainal;

import java.util.ArrayList;

public class ArrayList_리스트배열 {
	public static void main(String[] args) {
		int [] score = /*new int[]*/ {10, 20, 30, 40, 50}; // 선언과 동시에 초기화 5개의 inteser을 담은배열
		int count = score.length;

		String[] names = new String[2];

		ArrayList<Integer> scoreList = new ArrayList<>();
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);

		scoreList.add(2,200); // 중간중간 값을 추가해주기 편하다
		scoreList.remove(2); // 중간중간 값 삭제가능


		System.out.println(scoreList);

	}

}
