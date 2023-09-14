package tut01;

public class DoubleEx {
	public static void main(String[] args) {
		// 실수를 저장하는 변수 => 값을 지정하지 않았을 때
		// 값을 1.0으로 바꿀 때
	
		double d = 0.0;
		System.out.println(d);
		
		// 변수 선언은 기본적으로 overwrite(덮어쓰기)
		
		d = 1.0;
		System.out.println(d);

		double d1, d2;
		d1 = 1.23456;
		d2 = 2.23456;
		
		// 쇼핑몰 -> 1.2 + 2.2 = 3.4
		// 실수 -> 정수로 타입 변환 : (바꿀타입) 형변환
		
		
		// 순수한 숫자를 제외하면 + 연산자는 앞뒤를 연결할 때 사용한다.
		System.out.println( "합계 " + (int)(d1 + d2) + "달러" );
		
		
		// 사칙연산 기호 :  +, -, /, *, %
		// % : 나머지를 구하는 기호
		
//		0012345-1234567 주민번호의 8번째 숫자를 이용하여 남자 여자를 표시하시오
//		단, %, if 사용해서 표시하시오
		
		// 1이면 남자 2면 여자로 표시하시오
		int jumin = 2;
		
		
		String result = (jumin % 2 == 1) ? "남자" : "여자";
		
		System.out.println(result);
		
		
		
		
		
		
		
		
	}
}
