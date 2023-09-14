package tut01;

public class BooleanEx {

	public static void main(String[] args) {
		// 컴퓨터는 0, 1 => false(거짓) 0
					 //=> true(참) 0을 제외한 양수는 참
		
		// 기본타입의 초기값 설정
		byte i = 0; // => 초기값 0
		double d = 0.0; // 실수형 => 초기값 0.0
		boolean b = false; // 불리안 초기값 => false
		String s = "";
		
		// 참이면 통과, 아니면 재평가
		// 문자열(String)비교할 때는 .equals()를 사용
		// 그 외 값을 비교할 때는 ==
	
//		if( b ) 
//			System.out.println("통과");
//			
//		else 
//			System.out.println("재평가");
		
		// 문자열(String) 삼항 연산자 
		String str = ( b ) ? "통과" : "재평가";
		System.out.println(str);
		
		// 정수(int) 조건이 참이면 1 아니면 0을 출력하시오
		int i1 = (b) ? 1 : 0;
		System.out.println(i1);
		
		// 실수형(double, float) 조건이 참이면 1.0 아니면 0.0을 출력하시오
		double d1 = ( b ) ? 1.0 : 0.0;
		System.out.println(d1);
		
		// 논리형(boolean) 조건이 참이면 true 아니면 false 을 출력하시오
		boolean b1 = ( b ) ? true : false;
		System.out.println(b1);
		
}
}