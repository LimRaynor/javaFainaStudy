package javaFainal.ob;

public class static_정적인 {
	// static == 처음에 프로그램이 실행될때 항상 메모리에 로드되는 부분
	public static void main(String[] args) {

		System.out.println(add(50, 10));
		add(30, 10)	;
	}
	// 메인메서드가 길게되면 메서드를 추가해서 코드를 분리하는게 좋음
	public static int add(int x, int y){
		return x + y;
	}
}
