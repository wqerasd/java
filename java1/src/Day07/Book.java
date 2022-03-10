package Day07;

public class Book {
	
	// 1. 필드
	String ISBN;		// ISBN [ 도서번호 = 식별용 ]
	String bname;		// 도서명
	String bwriter;		// 작가
	boolean brental;	// 도서대여여부
	String mid;			// 대여인ID
	
	// 2. 생성자
		// 1. 빈생성자[기본생성자] : 메소드호출용
	public Book() {}
	
		// 2. 풀생성자[모든필드받는생성자] : 도서등록
	public Book(String iSBN, String bname, String bwriter, boolean brental, String mid) {		
		ISBN = ISBN;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
		
	// 3. 메소드
		// 1. 도서검색
	void 도서검색() {
		System.out.println(" ---------- 도서검색 페이지 ----------");
	}
		// 2. 도서목록
	void 도서목록() {
		System.out.println(" ---------- 도서목록 페이지 ----------");
		System.out.println(" ISBN\t도서명\t작가\t대여가능여부");
		for( Book temp : Day07_5_BookApplication.books) {
			if( temp != null ) {
				if( temp.brental ) 
					System.out.println( temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter +"\t" + "대여가능");
				else // 해당도서의 도서대여여부가 false
					System.out.println( temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter +"\t" + "대여중");
			}
		}
	}
		// 3. 도서대여
	void 도서대여() {
		System.out.println(" ---------- 도서대여 페이지 ----------");
		System.out.println(" 도서 ISBN : "); String ISBN = Day07_5_BookApplication.scanner.next();
		for( Book temp : Day07_5_BookApplication.books) {
			if( temp != null && temp ISBN.equals(ISBN) && temp.brental ) {
				System.out.println(" 알림]] 해당 도서를 대여합니다.");
			}
		}
		
		
	}
		// 4. 도서반납
	void 도서반납() {
		System.out.println(" ---------- 도서반납 페이지 ----------");
	}
		// 5. 도서등록
	void 도서등록() {
		System.out.println(" ---------- 도서등록 페이지 ----------");
		// 1. 입력받아
		System.out.println(" iSBN :"); 	String iSBN = Day07_5_BookApplication.scanner.next();
		System.out.println(" 도서명 :");	String bname = Day07_5_BookApplication.scanner.next();
		System.out.println(" 작가 :");	String bwriter = Day07_5_BookApplication.scanner.next();
		
		//* 중복체크[isbn]
				for( Book temp : Day07_5_BookApplication.books ) {
					if( temp != null && temp.ISBN.equals(iSBN) ) {
						System.out.println(" 알림]] 현재 사용중인 ISBN 입니다. [ 등록실패 ]");
						return; //도서등록 메소드 종료 ( 등록실패 )
					}
				}
		
		
		
		// 2. 객체화
		Book book = new Book(iSBN , bname , bwriter , true , null );			
		// 3. 배열 대입[넣기]
		int i = 0;
		for( Book temp : Day07_5_BookApplication.books ) {
			if(temp == null ) {
				Day07_5_BookApplication.books[i] = book;
				System.out.println(" 알림]] 도서가 등록되었습니다. ");
				return; // 등록 성공시 메소드 종료 ( 등록성공 )
			}
			i++;
		}
		
		
	}
		// 6. 도서삭제
	void 도서삭제() {
		System.out.println(" ---------- 도서삭제 페이지 ----------");
	}
	
	
	
	
}
