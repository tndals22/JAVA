package tut01;

public class ArithmeticEx {

	public static void main(String[] args) {
		// / 몫, % 나머지(나누어지지 않으면 값이 나머지)\
		// 임의의 정수 2개를 선언, 초기화 한 후 산술연산을 수행하시오.
		// 4, 5 초기값으로 설정하시오

		// 선언 초기화
		int num1 = 4;
		int num2 = 5;

		// 합계는 9입니다.
		// Syntax error on token => 특수문자 오류
		System.out.println("합계는: " + (num1 + num2) + "입니다.");

		// 나머지는 4입니다.
		System.out.println("나머지는: " + (num1 % num2) + "입니다.");

		System.out.println("------------------------------------");

		// 홀수 Odd, 짝수 Even
		// 객체지향 언어에서 boolean 타입의 변수이름 is~ 시작.
		// 임의의 숫자를 변수에 저장 후 나머지가 1이면 홀수 0이면 짝수를 출력하시오.

		int num = 6;

		if (num % 2 == 1)
			System.out.println("입력하신 숫자는 홀수입니다.");

		else
			System.out.println("입력하신 숫자는 짝수입니다.");

		System.out.println("------------------------------------");

		// System.out.println( num %2 == 0 );

		boolean isOdd = num % 2 == 1;

		if (isOdd)
			System.out.println("홀수 입니다.");
		else
			System.out.println("짝수 입니다.");

		System.out.println("------------------------------------");
		// 비교 연산자 >
		// 철수와 전체 총점의 점수를 비교해서 출력하시오.

		int sum = 80;
		int std = 85;

		// System.out.println(std > sum);
		boolean isCheck = std > sum;

		// 철수가 총점보다 큰지 작은지.
		if (isCheck)
			System.out.println("철수의 점수가 총점보다 큽니다.");

	}
}
