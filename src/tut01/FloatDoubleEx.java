package tut01;
import java.util.Scanner;

public class FloatDoubleEx {
	public static void main(String[] args) {
		// 부동소수점 오차 
		
		// float 7자리 초과
		float f1 = 1.0000001F;
		System.out.println(f1);
		
		float f2 = 1.00000001F;
		System.out.println(f2);
		
		// double 15자리 초과
		double d1 = 1.000000000000001;
		System.out.println(d1);
			
		double d2 = 1.0000000000000001;
		System.out.println(d2);
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(str);
		
	}
}
