package tut01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// Scanner(객체) : 값을 입력 받아서 처리 + System.in
		// 객체 초기화(생성자 초기화) new 를 사용
		// 문자열 입력 받아서 printf()로 화면에 출력

		// 타입 객체명 = new 객체();
		Scanner sc = new Scanner(System.in);
		// 화면 표시 역할
		System.out.print("출력할 문자열 입력 >> ");
		String str = sc.next();
		
		//System.out.println("입력한 문자열 : " + str);
		
		// 출력할 문지열은 코리아아이티입니다.
		System.out.println(String.format("출력할 문지열은 %s 입니다.", str));
		
	}
}
