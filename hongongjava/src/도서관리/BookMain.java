package 도서관리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// 도서 관리
		
		Scanner sc = new Scanner(System.in);
		Book book = null;
		BookDao dao = new BookDao();
		int cnt = 0;
		
		String bnum;
		String title;
		String writer;
		// 메인메뉴
		
		boolean stop = true;
		
		while(stop) {
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("1. 도서등록 | 2. 도서검색 | 3. 도서 전체조회 | 4. 도서 삭제 | 5. 도서 정보 변경 | 6. 종료");
			System.out.println("---------------------------------------------------------------------------");
			System.out.print("선택 > ");
			int selNo = Integer.parseInt(sc.nextLine());
			
			switch(selNo) {
			// 선택 1번 : 도서등록
			case 1 :
				System.out.println("[도서등록]");
				System.out.println("책번호 : ");
				bnum = sc.nextLine();
				System.out.println("책 제목 : ");
				title = sc.nextLine();
				System.out.println("저자 : ");
				writer = sc.nextLine();
				System.out.println("가격 : ");
				int price = Integer.parseInt(sc.nextLine());
				
				book = new Book(bnum, title, writer, price);
				cnt = dao.insert(book);
				
				if(cnt > 0) {
					System.out.println(cnt + "개 추가 성공");
				} else {
					System.out.println("추가 실패");
				}
				
				break;
				
			// 선택 2번 : 도서검색 => 책제목으로 검색
			case 2 :
				System.out.print("검색할 도서 제목을 입력하세요 > ");
				title = sc.nextLine();
				
				Book result = dao.selectOne(title);
				System.out.println(result.getBnum());
//				if(result != null) {
//					
//					
//				} else {
//					System.out.println("결과가 없습니다. 다시 입력하세요");
//					continue;
//				}
//				
				break;
				
			// 선택 3번 : 도서전체 조회
			case 3 :
				
				break;
				
			// 선택 4번 : 도서 삭제
			case 4 :
				
				break;
				
			// 선택 5번 : 도서 정보 변경
			//			책 제목, 변경할 책 번호, 변경할 책 가격 입력 => 수정
			case 5 :
				
				break;
				
			// 선택 6번 : 프로그램 종료
			case 6:
				System.out.println("Program End");
				stop = false;
				break;
				
			default:
				System.out.println("선택한 메뉴는 존재하지 않습니다. 다시 선택 하세요.");
				break;
			} // End Switch
			
		} // End While
		
	} // End Main

} // End Class
