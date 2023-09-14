package tut01;

public class LoopEx {

	public static void main(String[] args) {
		// 0 ~ 10 미만 출력하는 for문
		for (int i = 0; i < 10; i++) {
			// for를 이용한 출력 0123456789
			System.out.print(i + " ");
		}
		
			System.out.println("");
			
		// 0 ~ 10 미만 출력하는 while문
		int i = 0; 
		while(i < 10) {
			System.out.print(i + " ");
			i++;
		}
		// 10미만 부터 0 까지 출력하는 for문
		
		System.out.println("");
		
		for (int j = 10; j > 0; j--) {
			System.out.print(j + " ");
		}
	}

}
