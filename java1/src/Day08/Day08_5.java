package Day08;

import java.util.Scanner;

public class Day08_5 { // c s
	
	// 모바일 뱅크 프로그램 [ 2인 과제 ]
		// 요구사항
		// 회원 주요기능 : 1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기
		// 계좌 주요기능 : 1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 대출 6. 계좌목록
			// 회원이 계좌 만들어서 사용
			// 관리자(은행원이) 대출 상품을 등록하면 등록된 대출상품들을 회원들이 선택해서 대출 사용
		// 설계 : 통장 , 대출 , 회원
			// 대출클래스 = 도서클래스
				// 필드 : 1. 대출이름 2. 금액 3. 이자 4. 대출인[id] 5. 상환여뷰
			// 통장클래스
				// 필드 : 1. 계좌번호(중복x) 2. 예금액 3. 이름[id]
	
	
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] member = new Member[1000];
	static 계좌[] account = new 계좌[1000];
	
	
	

	public static void main(String[] args) { // m s
		
		Day08_5 day08_5 = new Day08_5();
		day08_5.menu();
	
	} // m e
	
	// 1. 초기메뉴
	void menu() {
		while(true) {
		System.out.println("  ---------- 모바일 뱅크 프로그램 ----------");
		System.out.println(" 1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기");
		int ch = scanner.nextInt();
		Member member = new Member();
		if( ch == 1 ) {
			boolean result = member.회원가입();
			
		}
		else if( ch == 2 ) {
		if( ch == 2 ) {
			String result = member.로그인();
			if( result == null ) { // 로그인 실패
				System.out.println(" 회원정보가 다릅니다. ");
				}
			else if( result.equals("admin") ) {
				System.out.println(" 관리자 아이디로 로그인됩니다.");
				adminmenu();
				
				}
			else { System.out.println(" 로그인되었습니다. "); 
					membermenu();
			}
			
		}
		else if( ch == 3 ) {
			member.아이디찾기();
		}
		else if( ch == 4 ) {
			//member.비밀번호찾기();
		}
		else { System.err.println(" 알림)) 알수없는 명령입니다."); }
	}
}	
		
		
		
		
	
	}	
	void adminmenu( ) {
		System.out.println(" ---------- 관리자 메뉴입니다. ---------- ");
		System.out.println(" 1. 대출등록 2. 대출자관리");
	}
	void membermenu( ) {
		System.out.println(" ---------- 회원 메뉴입니다. ---------- ");
		System.out.println(" 1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 대출 6. 내 계좌목록 ");
		int ch1 = scanner.nextInt();
		계좌 account = new 계좌();
		if( ch1 == 1) {
			boolean result = account.계좌생성();					
		}
		else if( ch1 == 2 ) {}
		else if( ch1 == 3 ) {}
		else if( ch1 == 4 ) {}
		else if( ch1 == 5 ) {}
		else if( ch1 == 6 ) {}
		else { System.out.println(" 알수없는 명령입니다. "); }
	}

	
} // c e
