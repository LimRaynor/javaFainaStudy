package javaFainal.operator.Loop_반복문;

public class Continue_브레이크 {
	public static void main(String[] args) {
		// [수정] 기존 코드가 break로 되어있었음 -> continue로 수정
		// continue는 해당 회차를 건너뛰고 다음 반복으로 진행
		for (int i = 0; i < 10; i++) {
			if (i == 6){
				continue; // [수정] break -> continue: i가 6일때 건너뛰고 다음 반복 진행
			}
			System.out.println(i); // 6을 제외한 0~9 출력
		}
	}
}
