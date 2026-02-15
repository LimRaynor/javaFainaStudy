package javaFainal.Array;

public class NullPointerException_빈칸참조 {
	public static void main(String[] args) {

		// NullPointerException - null인 변수 참조에서 뭔가를 하려하면 생기는 exception
		// null == 비어있다

		String[] names = new String[2];

		System.out.println(names[0].length());

	}
}
