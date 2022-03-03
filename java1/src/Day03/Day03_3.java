package Day03;

import java.util.Scanner;

public class Day03_3 { //c s
	
	public static void main(String[] args) { //m s
		
		// 문제6
		// 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 점수를 입력하세요 :" ); 	int 점수 = scanner.nextInt();		
		if( 점수 >= 90 )		 System.out.println("합격");
		else			System.out.println("불합격");
		
		
		//문제7
		// 점수를 입력받아 점수가 90점 이상이면 A등급
		//				점수가 80점 이상이면 B등급
		//				점수가 70점 이상이면 c등급
		//				그외 재시험
		System.out.println("점수를 입력하세요 :");  	int 점수1 = scanner.nextInt();
		if( 점수1 >= 90) System.out.println("A등급");
		else if( 점수1 >= 80 ) System.out.println("B등급");
		else if( 점수1 >= 70 ) System.out.println("C등급");
		else System.out.println("재시험");
		
		//문제8 로그인페이지
		// [ 입력 ] : 아이디와 비밀번호를 입력받기
		// [ 조건 ] : 회원아이디가 admin 이고
		//		 	비밀번호가 1234일 경우에는
		//			로그인 성공 아니면 로그인 실패 출력
		
		System.out.print("아이디를 입력해주세요 :");   String id = scanner.next();
			// char 자료형 [ 문자 1개 저장 ]
			// 자료형으로 문자열을 저장할수 없다.
				// 1. String 클래스 사용하면 문자열 저장가능
				// 2. char 배열/리스트 사용하면 가능
		System.out.print("비밀번호를 입력해주세요 :");	int pw = scanner.nextInt();
			// 객체는 연산불가 (String)
				// 자료형 사용하는 변수는 연산자 사용 가능
				// 클래스 사용하는 객체는 연산자 사용 불가 -> 메소드
					// 문자열 비교시 .equals 
					// 문자열1.equals( 문자열 )
		boolean 로그인성공 = false;
			// boolean : 1비트 true 혹은 false 저장
		
		if( id .equals("admin") ) { //id 는 클래스 객체이기 때문에 == 불가능 // 객체비교시에는 .equals
			// 입력한 id가 admin 이면
			if( pw == 1234 ) {	// pw는 클래스 객체이기 때문에 == 가능
				// 입력한 pw 1234 이면
				System.out.println(" 알림) 로그인 성공 ");
				로그인성공 = true;
			}
			else { // 입력한 pw 1234 dkslaus
				System.out.println(" 알림) 비밀번호 틀렸습니다.");
			}
			
		}else{ // 입력한 id가 admin 이 아니면
			System.out.println(" 알림) 아이디가 틀렸습니다.");
		}
		
		if( 로그인성공 == false ) System.out.println(" 알림) 로그인 실패");
		// 로그인 성공 변수가 false 이면 출력
		
		// 문제9
		// [ 입력 ] : 국어, 영어, 수학 입력받기
		// [ 조건 ] 평균이 90점이상이면서  국어점수 100이면 국어우수 출력
		//							 영어점수 100이면 영어우수 출력
		//							 수학점수 100이면 수학우수 출력
		//         평균이 80점이상이면서  국어점수 100이면 국어장려 출력
		//							 영어점수 100이면 영어장려 출력
		//							 수학점수 100이면 수학장려 출력
		//			그외 재시험
		
		System.out.println(" 국어 점수 :");  	int 국어 = scanner.nextInt();
		System.out.println(" 영어 점수 :"); 	int 영어 = scanner.nextInt();
		System.out.println(" 수학 점수 :");  	int 수학 = scanner.nextInt();
		int 평균 = (국어 + 영어 + 수학)/3; // 평균 구하기
		
		if( 평균 >= 90 ) { // 평균이 90점 이상이면
			
			// if 중첩
			if( 국어 == 100 ) System.out.println("국어우수");
			if( 영어 == 100 ) System.out.println("영어우수");
			if( 수학 == 100 ) System.out.println("수학우수");
			
		}else if( 평균 >= 80 ) { // 평균이 80점 이상이면
			
			// if 중첩
			if( 국어 >= 90 )	System.out.println("국어장려");
			if( 영어 >= 90 ) System.out.println("영어장려");
			if( 수학 >= 90 ) System.out.println("수학장려");
			
		}else System.out.println("재시험"); // 그 외면
		
			
		
		
		
		
		
		
		
		
	} //m e	

} //c e
