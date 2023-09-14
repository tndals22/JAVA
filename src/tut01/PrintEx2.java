package tut01;

public class PrintEx2 {
	public static void main(String[] args) {
		// char : 문자,  ", 2byte, ASCII, 숫자로 변환 가능(타입 캐스팅)
		char  c = 'k';
		System.out.println(c);
		System.out.println( (int)c ); //(정수형) 형변환
		System.out.println( (char)(107 + 1) ); //(문자형) 형변환
		
		System.out.println("============================");
		// boolean : true, false(따옴표 사용x)
		// true면 통과, false면 실패 
		// if와 사용
		// 문자열 값이 같다는 equals() 외에는 같다는 ==
		boolean b = false; //boolean 초기값은 = false;
		
		if ( b == false ) 
			System.out.println("실패");
		
		else 
			System.out.println("성공");
		
		
		boolean run = true;
		
		if ( !run ) // ! 뒤집기 
			System.out.println("실패");
		
		else 
			System.out.println("성공");
		
		char grade = ( !run ) ? 'A' : 'F'; // 삼항 연산자
		System.out.println(grade);


	}
}