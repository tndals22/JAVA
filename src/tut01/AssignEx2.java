package tut01;

public class AssignEx2 {

	public static void main(String[] args) {
		// 증감연산자
		// 대입연산자를 줄여서(축약) 사용
		
		int num = 5;
		num++; // 증감 연산자
		System.out.println(num); // 6
		
		System.out.println(++num); // 7

		System.out.println(num++); // 7
		
		System.out.println(num); // 8
		
		num += 1;
		System.out.println(num); // 9
		System.out.println(num += 1); // 10
		System.out.println(num += 5); // 15
		System.out.println(num *= 10); // 150
		System.out.println(num /= 150); // 1
		
		System.out.println("------------------");
		// 0 ~ 9까지 더하는 반복문을 작성하시오. 
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;	
		}
		System.out.println(sum);
	}
}
