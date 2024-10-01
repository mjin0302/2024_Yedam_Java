package 김민진;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean stop = true;
		Account[] accounts = new Account[100];
		String ano;
		String owner;
		int balence;
		
		int money; // 예금, 출금 받는 변수
		
		while (stop) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("선택 > ");
			int selNo = Integer.parseInt(sc.nextLine());
			
			switch (selNo) {
			
			case 1:
				System.out.println("---------------");
				System.out.println("계좌 생성");
				System.out.println("---------------");
				
				System.out.print("계좌 번호 : ");
				ano = sc.nextLine();
				
				System.out.print("계좌주 : ");
				owner = sc.nextLine();
				
				System.out.print("초기 입금액 : ");
				balence = Integer.parseInt(sc.nextLine());
				
				for(int i = 0; i < accounts.length; i++) {
					if(accounts[i] == null) {
						if(!accounts[i].getAno().equals(ano)) {
							accounts[i] = new Account(ano, owner, balence);
							
							System.out.println("계좌가 성공적으로 생성되었습니다.");
							break;
						} else {
							System.out.println("입력하신 계좌가 존재합니다. 다른 계좌번호를 입력하세요.");
						}
					}
				}
				break;
			case 2:
				for(Account acc : accounts) {
					if(accounts != null) {
						System.out.println("계좌번호\t이름\t잔액\t");
						System.out.println("=====================================================");
						System.out.printf("%s\t%s\t%d\n", acc.getAno(), acc.getOwner(), acc.getBalence());
						
					}
					break;
				} 
				break;
				
			case 3:
				System.out.print("입금하실 계좌번호를 입력하세요. > ");
				String inputAno = sc.nextLine();
				
				for(Account acc : accounts) {
					if(acc != null && acc.getAno().equals(inputAno)) {
						
						System.out.print("입금하실 금액을 입력하세요. > ");
						money = Integer.parseInt(sc.nextLine());
						
						acc.setBalence(acc.getBalence() + money);
						break;
					} 
				}
				break;
				
			case 4:
				
				System.out.print("출금하실 계좌번호를 입력하세요. > ");
				inputAno = sc.nextLine();
				
				for(Account acc : accounts) {
					if(acc != null && acc.getAno().equals(inputAno)) {
						
						System.out.print(acc.getOwner() + "님, 출금하실 금액을 입력하세요. > ");
						money = Integer.parseInt(sc.nextLine());
						
						if(acc.getBalence() > money) {
							
							acc.setBalence(acc.getBalence() - money);
							System.out.println(money + "출금 되었습니다. 잔액은 " + acc.getBalence() + "입니다.");
							break;
						} else {
							System.out.println("잔액을 확인하세요.");
							break;
						}
					} else {
						System.out.println("출금하실 계좌가 없습니다. 다시 확인하세요");
						break;
					}
				}
				break;
				
			case 5:
				
				System.out.println("Program End");
				stop = false;
				break;
				
			default:
				System.out.println("선택한 메뉴는 존재하지 않습니다. 다시 선택 하세요.");
				break;
			}
		}
	}

}
