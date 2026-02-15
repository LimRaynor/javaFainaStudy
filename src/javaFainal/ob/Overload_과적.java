package javaFainal.ob;

public class Overload_과적 {
	public static void main(String[] args) {

		System.out.println(add(50, 10));
		add(30, 10);
		add(30, 10, 30);
		addAll(10, 20, 30, 40); // [수정] 가변인자 메서드는 이름을 addAll로 변경
	}

	// 메인메서드가 길게되면 메서드를 추가해서 코드를 분리하는게 좋음
	public static int add(int x, int y) {
		return x + y;
	}

	public static int add(int x, int y, int z) { // 파라미터 int z 추가
		return x + y + z;
	}

	// 이방식 대로하면 내가 원하는 개수만큼 넣을 수 있음
	// [수정] 가변인자(int...)는 add(int, int)와 시그니처가 충돌하므로 메서드명을 분리
	public static int addAll(int... numbers) { // ... == 0개이상의 수를 넣는데 [] 방식으로 들어옴
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i]; // [수정] i(인덱스)가 아니라 numbers[i](실제 값)를 더해야 함
		}
		return sum;
	}
}
