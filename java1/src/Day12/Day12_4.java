package Day12;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Day12_4 {

	// 차량번호 구분 프로그램
	// 조건
		// 1. 난수 0000 ~ 9999 사이의 난수 10개 생성해서 배열에 저장
		// 2. 모든 차량 번호를 배열에 저장
		// 3. 끝자리 번호로 홀/짝 구분
		// 4. 차량 끝자리의 번호가 홀수인 차량 배열에 저장
		// 5. 차량 끝자리의 번호가 짝수인 차량 배열에 저장
		// 6. 홀수차량 배열 출력 // 짝수차량 배열 출력
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 입력객체
	
		String[] carlist = new String[10]; // 문자열 10개 저장할수 있는 배열 [ 차량번호 최대 10개 저장 가능 ]
		String[] evenlist = new String[10]; // 짝수차량 배열
		String[] oddlist = new String[10];
		while(true) {
			
			// 모든 차량 번호 출력
			System.out.println(" \n*** 주차중인 모든 차량번호 *** ");
			for( String temp : carlist ) {
				if( temp != null ) {
					if(Integer.parseInt(temp) % 2 == 0 ) { // 수%2==0 나머지가 0이면 짝수
						System.out.print(temp+ "[짝] ");
						for( int i = 0; i<evenlist.length; i++ ) {
							if( evenlist[i] == null) {
								evenlist[i] = temp; break;
							}
						}
						
					}else {				// 수%2 == 1 나머지가 1이면 홀수
						System.out.print(temp+ "[홀] ");
						for( int i = 0; i<oddlist.length; i++ ) {
							if( oddlist[i] == null) {
								oddlist[i] = temp; break;
							}
						}
					}
					
					}
			}
			// 홀수차량 번호 출력
			System.out.println(" \n*** 주차중인 모든 홀수 차량 *** ");
			
			// 짝수차량 번호 출력
			System.out.println(" \n*** 주차중인 모든 짝수 차량 *** ");
			
			System.out.print(" 1.차량입차" ); int ch = scanner.nextInt();
			if( ch == 1 ) {
				// 차량번호 난수 생성
				Random random = new Random(); // 랜덤 객체
				int intnum = random.nextInt(10000); // 0~9999 중 난수 발생
				String strnum = String.format("%04d", intnum); // %0숫자d : 숫자만큼 자릿수 [
				// 배열내 공백을 찾아 차량번호 저장
				boolean save = false;
											// 형식
												// %d : 정수 %f : 실수 %s : 문자
												// %숫자d : 숫자만큼 자릿수  [ 만일 해당 자릿수가 없으면 공백 ]
												// %0숫자d : 숫자만큼 자릿수 [ 만일 해당 자릿수가 없으면 0 ]
				for( int i = 0; i<carlist.length; i++ ) {
					if( carlist[i] == null ) { carlist[i] = strnum; save = true; break; }
				}
				// 만약에 빈공간이 없으면 만차
				System.err.println(" 만차 [ 주차 불가 ] ");
			}
		}
	}
}
