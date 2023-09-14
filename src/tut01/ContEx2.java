package tut01;

import java.util.Scanner;

public class ContEx2 {

	public static void main(String[] args) {

		// 학점 91 ~ 100 A등급
		// 학점 81 ~ 90 B등급
		// 학점 71 ~ 80 C등급
		// 나머지는 F등급으로 표시하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력(숫자:0~100) >> ");
		// int jumsu = Integer.parseInt(sc.next());
		// 입력받은 문자열을 정수로 변환

		int jumsu = sc.nextInt();

		String str = "";
		if (jumsu >= 91 && jumsu <= 100)
			str = "A등급";

		else if (jumsu >= 81 && jumsu <= 100)
			str = "B등급";

		else if (jumsu >= 71 && jumsu <= 80)
			str = "C등급";

		else
			str = "F등급";

		System.out.println(str);

	}
}
