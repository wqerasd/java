package 연습;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// 배열 
		학생[] 학생배열 = new 학생[100];
		Scanner scanner = new Scanner(System.in);
		int[] Rank = new int[100]; 
		
		while( true ) {
			try {
				System.out.println(" **** 학생 목록 ****");
				// 학생들 점수 출력 [ 모든 배열 출력  ]
				System.out.println(" 1. 학생등록 2.학생삭제 : ");
				System.out.println("---------------------------------------------------------------");
				System.out.println("                           성 적 표                              ");
				System.out.println("---------------------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");			
				for( int j = 0 ; j<학생배열.length; j++ ) {
				
					if( 학생배열[j] != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n" , (j+1),학생배열[j].get이름(),학생배열[j].get국어(),
								학생배열[j].get영어(),학생배열[j].get과학(),학생배열[j].get총점(),학생배열[j].get평균(),Rank[j]);
					 
					
					
					}
					
				}
				
				System.out.println("---------------------------------------------------------------");
				
				int ch = scanner.nextInt();
				if( ch==1 ) {   
					System.out.println(" 이름 : "); String 이름 = scanner.next();
					System.out.println(" 국어점수 : "); int 국어 = scanner.nextInt();
					System.out.println(" 영어점수 : "); int 영어 = scanner.nextInt();
					System.out.println(" 과학점수 : "); int 과학 = scanner.nextInt();
					int 총점 = 국어 + 영어 + 과학;
					double 평균 = (double)총점/3;
					학생 member = new 학생( 이름 , 국어 , 영어 , 과학 , 총점 , 평균 );
					int i = 0;
					
					for( 학생 temp : 학생배열 ) {
						
						if( temp == null) {
							학생배열[i] = member; break;
						} i++;
					}Rank [i] = 1;
					for(int r = 0; r<Rank.length; r++  ) {
						for(int t = 0; r<Rank.length; t++) {
							if(학생배열[r].get총점() < 학생배열[t].get총점()) {
								  Rank[r]++;
							}
						}
					}
					
				
					
				} // 학생 등록 
					
				else if( ch== 2 ) {  // 학생 삭제
					System.out.println(" 삭제할 번호 입력 :");  int 번호 = scanner.nextInt();
					
					학생배열[번호-1] = null;
					
					for( int i = 번호-1; i<학생배열.length-1; i++) {
						if( i == 학생배열.length-1 ) {
							학생배열[i] = null;
						}else {
							학생배열[i]=학생배열[i+1];
						}
					}
				}
				
				else { 
					System.out.println(" 알수없는 명령입니다. ");  
					}
			}
			catch( Exception e ) {     }
		}
	}
}
