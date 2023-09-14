package tut01;

public class PrintEx {
	public static void main(String[] args) {
		// 정수 5와 8의 합을 출력하시오.
		// 변수 선언. 초기화 = 선언과 초기화를 동시

		// int num1, num2; // 선언
		// num1 = 5; // 초기화
		// num2 = 8; //

		// 변수이름 첫글자는 소문자 !!
		int num1 = 5;
		int num2 = 8;
		// System.out.println(num1 + num2);

		// 결과값을 저장 후 출력
		int result = num1 + num2;
		System.out.println(result);

		// byte : 메시지 전송, 이미지 처리
		// byte(1) -> int(4) -> float(4) -> double(8)
		// 0, 1 => 1byte = 8bit => 2의8승 => 256 / 2 => byte = 음수(-128) 0 양수(+127)
		// byte b = -128;

		// 사람이 읽는 수 10진수
		// 16진수 => ex)#ffooae
		// 0 ~ 15 : 0 ~ 9, a, b, c, d, e, f

		System.out.println("-----------------------------------------");

		// int 10억이 넘어가면 ~
		// 정수형 : long

		long money = 10000000000L;

		// 실수형 : float 8, double 15

		// float
		// PI는 값이 정해져 있는(고정되어 있는 ) 값 => 상수(final)
		float PI = 3.12345678F;
		System.out.println(PI);

	}

}
