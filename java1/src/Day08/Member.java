package Day08;



public class Member {
	
	// 1. 필드
		String id;
		String password;
		String name;
		String phone;
		
	// 2. 생성자
		// 1. 빈생성자[기본생성자] : 메소드호출용 객체생성시
		public Member() { }
		// 2. 모든 필드를 받는 생성자 : 회원가입용 객체생성시
				public Member( String id, String password, String name, String phone) {
					this.id = id;
					this.password = password;
					this.name = name;
					this.phone = phone;
				}
				
	// 3. 메소드
		// 1. 회원가입 메소드 [ 인수x 반환o : 가입성공TRUE / 가입실패FALSE]
	boolean 회원가입() {
		System.out.println(" ----- 회원가입 페이지 ----- ");
		// 1. 입력받는다 [ id , pw , name, phone ]
		System.out.print(" 아이디 : "); 	String id = Day08_5.scanner.next();
		System.out.print(" 비밀번호 : ");	String password = Day08_5.scanner.next();
		System.out.print(" 이름 : ");		String name = Day08_5.scanner.next();
		System.out.print(" 연락처 : ");	String phone = Day08_5.scanner.next();
		
		//중복체크
		for( Member temp : Day08_5.member ) {
			if( temp != null && temp.equals(id) ) {
				System.err.println(" 알림)) 현재 사용중인 아이디 입니다. ");
				return false;
			}
			else { System.err.println(" 회원가입 완료. "); break; }
		}
		
		// 새로운 회원 회원리스트에 넣기
		Member member = new Member( id , password , name , phone );
		int i = 0;
		for( Member temp : Day08_5.member ) {
			if( temp == null ) {
				Day08_5.member[i] = member;				
			}
		}
		return false;
	}
	String 로그인() {
		System.out.println(" ----- 로그인 페이지 -----");
		System.out.println(" 아이디 : "); String id = Day08_5.scanner.next();
		System.out.println(" 비밀번호 : "); String password = Day08_5.scanner.next();
		for(Member temp : Day08_5.member ) {
			if( temp != null && temp.id.equals(id) && temp.password.equals(password) ) {
				return temp.id;
			}
		}
		return null;
	}
	void 아이디찾기() {
		System.out.println(" ----- 아이디 찾기 페이지입니다. -----");
	}
} // c e




