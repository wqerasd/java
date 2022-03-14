package Day08;

//2. 계좌

		// 필드 	: 1. 대출이름 2. 금액 3. 이자 4. 대출인[id] 5. 상환여부 
		// 메소드 : 1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 대출 6. 계좌목록

public class 계좌 {
	
	// 1. 필드
		String 주민등록번호;
		String 이름;
		String 비밀번호;
		
	// 2. 생성자 
		public 계좌() {}

		public 계좌(String 주민등록번호, String 이름) {		
			this.주민등록번호 = 주민등록번호;
			this.이름 = 이름;
		}
		
	// 3. 메소드
	boolean 계좌생성()  {
		System.out.println(" ----- 계좌생성 페이지 ----- ");
		System.out.println(" 비밀번호 ");	 	String 비밀번호 = Day08_5.scanner.next();
		System.out.println(" 이름 :"); 		String 이름 = Day08_5.scanner.next();
		System.out.println(" 주민등록번호 : ");	String 주민등록번호 = Day08_5.scanner.next();
		
		//중복체크
		for( 계좌 temp : Day08_5.account ) {
			if( temp != null && temp.equals(주민등록번호) ) {
				System.err.println(" 알림 )) 이미 주민등록번호로 만든 계좌가 있습니다.");
				return false;
			}
			else { System.err.println(" 계좌가 생성되었습니다. "); break; }
		}
		
		계좌 account = new 계좌( 주민등록번호 , 이름 );
		int i = 0;
		for( 계좌 temp : Day08_5.account) {
			if( temp == null ) {
				Day08_5.account[i] = account;
			}
		}
		return false;
	}
	
	
	

}
