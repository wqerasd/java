package 연습;

import java.util.Scanner;

public class 성적 { // s 

	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100];
		
		
		while(true) {
		System.out.println(" 이름 : "); String 이름 = scanner.next();
		System.out.println(" 국어점수 : "); int 국어점수 = scanner.nextInt();		
		System.out.println(" 영어점수 : "); int 영어점수 = scanner.nextInt();
		System.out.println(" 수학점수 : "); int 수학점수 = scanner.nextInt();
		Member member = new Member( 이름 , 국어점수 , 영어점수 , 수학점수 );
		int i = 0;
		for( Member temp : memberlist ) {
			
		}
		int 총점 = 국어점수 + 영어점수 + 수학점수;
		double 평균 = 총점/3;
								
		System.out.println("---------------------------------------------------------------");
		System.out.println("                           성 적 표                              ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");		
		
		
	}
		
		
		
		
		
		
		
		
		System.out.printf((j+1) + "\t"+ "%s\t%d\t%d\t%d", 
				학생배열[j].get이름(), 학생배열[j].get국어(), 학생배열[j].get영어(), 학생배열[j].get과학());
		
		
	} // m e
} // c e
