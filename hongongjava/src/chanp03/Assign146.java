package chanp03;

public class Assign146 {
	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 3;
		System.out.println(result);
		result /= 5;
		System.out.println(result);
		result %= 3;
		System.out.println(result);
		
		int su = 1;
		int su2 = 2;
		// 이진법 계산
		System.out.println("2진법 : " + (su & su2));
		System.out.println(su | su2);
		System.out.println(su ^ su2);
		
	}
}
