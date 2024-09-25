package 김민진;

import java.util.Scanner;

public class Doself {

	public static void main(String[] args) {
		// 1. 윤년 계산 프로그램
		// 	  입력된 년도가 윤년인지 계산하는 프로그램 작성 
		// 	  - 4로 나누어 떨어지고, 
		//	    100으로 나누어 떨어지지 않으면 윤년 - 400으로 나누어 떨어지면 윤년
		Scanner sc = new Scanner(System.in);
//		System.out.print("년도를 입력하세요 > ");
//		int year = Integer.parseInt(sc.nextLine());
//		
//		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
//			System.out.printf("%d년은 윤년입니다.\n", year);
//		} else {
//			System.out.printf("%d년은 윤년이 아닙니다.\n", year);
//		}
		
		// 2. 동전 교환 프로그램
		// 	  입력된 액수만큼 500원, 100원, 50원, 10원짜리 동전으로 교환해 주는 프로그램 작성
		// 	  - 동전의 총개수는 최소화 
		// 	  - 고액의 동전 먼저 교환
		int chMoney = 0;
		
		System.out.print("금액을 입력하세요 > ");
		int money = Integer.parseInt(sc.nextLine());
		
//		DecimalFormat df = new DecimalFormat("#,##0.00");
//		System.out.println(df.format(money));
		
		if((money % 500) != 0) {
			System.out.println("잔돈이 남았습니다.");
		}
		
		
		// 3. 숫자 추측 게임
		// 	  1에서 100까지의 수를 발생 시키고 어떤 수인지 알아 맞히는 게임 프로그램 작성
		// 	  숫자 입력 : 20
		// 	  down하세요!!
		// 	  숫자 입력 : 10
		// 	  down하세요!!
		// 	  숫자 입력 : 5
		// 	  up하세요!!
		// 	  숫자 입력 : 7
		// 	  축하합니다.
		int randomNum = (int)(Math.random() * 100) + 1;
		System.out.println(randomNum);
		int count = 0;
		boolean stop = true;
		while(stop) {
			System.out.print("수를 입력하세요 > ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(randomNum > num) {
				System.out.println("Up하세요.");
				count++;
			} else if(randomNum < num) {
				System.out.println("Down하세요");
				count++;
			} else if(randomNum == num) {
				System.out.println("축하합니다.!!");
				count++;
				stop = false;
			}
		}
		System.out.printf("총 %d회.", count);
		
		// 5. 섭씨-화씨 온도 변환 프로그램
		// 	  섭씨 온도(C) = 5 / 9 * (F – 32 )
		// 	  화씨 온도(F) = 9 / 5 * C + 32 
		// 	  1. 화씨 -> 섭씨 
		// 	  2. 섭씨 -> 화씨 
		// 	  3. 종료
		stop = true;
		while(stop) {
			System.out.println("----------------------------------------");
			System.out.println("1. 화씨 -> 섭씨  |  2. 섭씨 -> 화씨  |  3. 종료");
			System.out.println("----------------------------------------");
			System.out.print("선택 > ");
			int no = Integer.parseInt(sc.nextLine());
			
			switch(no) {
				case 1 : 
					System.out.print("화씨 온도 입력 > ");
					double f = Double.parseDouble(sc.nextLine());
					double result = 5.0 / 9.0 * (f - 32);
					System.out.println("섭씨 온도 = " + result);
					break;
				case 2 :
					System.out.print("섭씨 온도 입력 > ");
					double c = Double.parseDouble(sc.nextLine());
					result = 9.0 / 5.0 * c + 32;
					System.out.println("화씨 온도 = " + result);
					break;
				case 3 :
					System.out.println("Program End");
					stop = false;
					break;
			}
		}
		
		// 6. 가위,바위, 보 게임 프로그램
		//    가위 바위 보 중에 하나를 선택하면, 
		//    컴퓨터가 생성한 난수값과 비교하여 누가 이겼는지 화면에 출력하는 프로그램 작성
		// 	  2보다 큰 수 입력하면 game over 출력 => 종료
		
		
		while(true) {
			int hand = (int)(Math.random() * 3) + 0; // 0
			System.out.println(hand);
			System.out.println("----------------------------------------");
			System.out.println("0. 가위  |  1. 바위  |  2. 보  |  3. 종료");
			System.out.println("----------------------------------------");
			System.out.print("선택 > ");
			int no = Integer.parseInt(sc.nextLine());
			
			if(hand == no) {
				System.out.printf("사람: %d, AI: %d\t비겼음", hand, no);
				break;
			} else if(hand < no) {
				System.out.printf("사람: %d, AI: %d\tAI Win", hand, no);
				break;
			} else if(hand > no) {
				System.out.printf("사람: %d, AI: %d\t사람 Win", hand, no);
				break;
			} else {
				System.out.println("Game Over");
				break;
			}
		}
		
		
		
		// 7. 3, 6, 9게임 프로그램
		// 1~50까지 3, 6, 9가 들어가는 숫자마다 3, 6, 9가 들어가 있는 개수 만큼 ♥출력하는 프로그램 작성
		
	} // End Main

} // End Class
