package javaFainal.data;

public class TypeCasting_형변환 {
	public static void main(String[] args) {

		// 정수형 (Integer)
		byte b = 1;
		short s = 2;
		int x = 4;
		long l = 8L;

		// 형변환(type casting)
		int i = (int)30L; // long큰값을 int작은안에 넣을땐 강제형변환
		long ll = 30; // int작은값을 long큰값안에 넣을땐 자동형변환

		// 실수형 (Floating Point)
		float ff = 4.0f;
		double dd = 8.0;

		// 형변환(type casting)
		ff = (float)dd; // [수정] double큰값을 float작은값안에 넣을땐 강제형변환 (캐스팅 필요)
		dd = ff; // float작은값을 double큰값안에 넣을땐 자동형변환

	}
}
