                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               package tut01;

import java.util.Scanner;

public class ContEx {

	public static void main(String[] args) {
		// if
		// 비교 연산자 > < => true, false
		int num1 = 3;
		int num2 = 5;

		// 사용자 Level 0(손님), 1(회원), 2(관리자)
		// 출력을 하는 프로그램
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();

		if (level == 0) {
			System.out.println("Gest로 로그인 하셨습니다.");
			System.out.println("관리자가 승인 후에 사이트 이용이 가능합니다.");

		} else if (level == 1) {
			System.out.println("회원으로 로그인 하셨습니다.");
			System.out.println("웹 사이트 메인 페이지로 이동합니다.");

		} else {
			System.out.println("관리자로 로그인했습니다."
					+ "\n관리자페이지로 이동합니다.");

		}

	}

}
