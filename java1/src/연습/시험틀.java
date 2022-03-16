package 연습;

import java.util.Scanner;

public class 시험틀 {

	public static void main(String[] args) {
		
		//배열
		Member[] 학생배열 = new Member[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
			System.out.println(" *** 학생 목록 *** ");
			
			// 학생들 점수 출력 [ 모든 배열 출력 ]
			System.out.println(" 이름 : "); String 이름 = scanner.next();
			System.out.println(" 국어점수 : "); int 국어점수 = scanner.nextInt();
			System.out.println(" 영어점수 : "); int 영어점수 = scanner.nextInt();
			System.out.println(" 수학점수 : "); int 수학점수 = scanner.nextInt();
			
			System.out.println(" 1.학생등록 2.학생삭제 :");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				
				
					
			}
			else if( ch == 2 ) {   }
			else {   }
			
		}
		catch( Exception e ) {}
		}
	}
	
}
