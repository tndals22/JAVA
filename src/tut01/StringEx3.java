package tut01;

public class StringEx3 {

	public static void main(String[] args) {
		// 같은 타입을 이름 하나로 많은 데이터를 다루기 위해 필요 -> 배열[] : for문이랑 꼭 같이 쓴다
		// 다른 타입을 다루기 위해서는 객체를 사용 - for
		
		// 소문자 -> 대문자  toUpperCase();
		// 대문자 -> 소문자  toLowerCase();
		// 변수명.toupperCase();
		
		String title = "korea it academy";
		System.out.println(title.toUpperCase());

		System.out.println("----------------------");
		
		String menus = "Home:Company:Contact:Help";
		String[] s = menus.split(":"); // 특수문자를 기준으로 쪼개기.	
		
		// for(데이터타입 별명 : 배열이름)
		// 			출력코드(별명)

		for(String result : s) { // 자바 방식
			System.out.println(result);			
		}
		
		System.out.println("----------------------");
		
		// 정수 생성 후 초기값은 100
		// 출력 : 생성된 변수의 초기값은 100입니다.
		
		int num = 100;
		System.out.println("생선된 변수의 초기값은 " + num + "입니다.");
		
		// %d = decimal
		System.out.printf("생선된 변수의 초기값은 %d입니다.", num );
		
		System.out.println("");
		
		// %s = String(문자열)
		String str = "부산";
		System.out.printf("내가 사는 곳은 %s입니다.", str);
		
		// 2진수 -> binary => 01010101
		// 8진수 -> Oct => 01 010 101
		// 16진수 -> hex => 0101 0101 => 0 ~ 9, a(10), b(11), c, d, e, f
		// 10진수 -> dec 
	
	}
}
