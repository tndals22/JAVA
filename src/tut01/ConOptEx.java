package tut01;

public class ConOptEx {

	public static void main(String[] args) {
		// 삼항 연산자
		// 정수 두 개를 비교하여 크면 1, 작으면 0을 출력하시오.
		// 데이터 타입 변수명 = (조건) ? "참일 때" : "거짓일 때";
		
		int num1 = 5;
		int num2 = 10;
		
		int result = (num1 < num2) ? 1 : 0;
		System.out.println(result);
		
		
		// 임의의 정수를 생성 후  1이면 홀수, 0이면 짝수를 출력하시오.
		int num3 = 5;
		String str = (num3 %2 == 1) ? "홀수" : "짝수"; // 삼항 연산자
		System.out.println(str);
	
		String msg = "";
		if( num3 %2 == 1 ) 
			msg = "홀수";
		
		else 
			msg = "짝수";
		
		System.out.println(msg);
	}
	

}
