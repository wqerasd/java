package Day02;

import java.util.Scanner;

public class Day02_5 {
	
	public static void main(String[] args) {
		
		// 문제2 : 지폐 세기 
				/*
				 * [ 입력조건 ] 
				 * 		금액 
				 * [ 조건 ] 
				 * 		십만원 부터 백원 까지의 개수 세기 
				 * [ 출력조건 ]
				 * 		예) 356789 입력시 
				 * 		십만원 3장 
				 * 		만원 5장
				 * 		천원 6장 
				 * 		백원 7개
				 * 
				 */
		Scanner scanner = new Scanner(System.in);
//		System.out.println("금액 :");  	int 금액 = scanner.nextInt();
//		System.out.println(" 입력한 금액 :" + 금액);
//		System.out.println(" 십만원 :" + (금액/100000) + "장");
//		금액 = 금액 - ( 금액/100000)*100000;
//		System.out.println(" 십만원 제외 :" + 금액 );
//		System.out.println(" 만원 :" + (금액/10000) + "장");
//		금액 = 금액 - ( 금액/10000)*10000;
//		System.out.println(" 만원 제외 :" + 금액 );
//				
				
		
		
		
				
				//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
					// 배수찾기
						// 값 % 수 했을떄 나머지가 0 이면 값은 그 수의 배수
				//System.out.println(" 문제3) 정수 입력:");
				//int 문제3 = scanner.nextInt(); // 하나의 정수를 입력받기
				//System.out.println(" 입력한 정수는 7의 배수 판단 :" + ( 문제3%7 == 0 ));
				
				//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
					// 홀짝 찾기
						// 홀수 : 값 % 2 했을때 나머지가 1 이면 값은 홀수
						// 짝수 : 값 % 2 했을떄 나머지가 0 이면 값은 짝수
				//System.out.println(" 문제4) 정수 입력 :");  	int 문제4 = scanner.nextInt();
				//System.out.println(" 입력한 정수는 홀수 판단 :" + ( 문제4%2 == 1));
				
				
				//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
//				System.out.println(" 문제5) 숫자를 입력하세요"); 	int 문제5 = scanner.nextInt();
//				System.out.println(" 입력한 숫자는 7의배수 이면서 짝수 판단 : " + ( 문제5%7 == 0 && 문제5%2 == 0));
				
				
				
				//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
//				System.out.println(" 숫자를 입력하세요 :");  	int 숫자1 = scanner.nextInt();
//				System.out.println(" 숫자를 입력하세요 :");  	int 숫자2 = scanner.nextInt();
//				System.out.println(" 두 숫자 크기 비교" + (숫자1 > 숫자2 ? 숫자1 : 숫자2) );
//				
				
				//문제7 : 반지름을 입력받아 원 넓이 출력하기 
						// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
//				System.out.println(" 반지름 값을 입력하세요 :");  	int 반지름 = scanner.nextInt();
//				System.out.println("원 넓이 :" + ( 반지름 * 반지름 * 3.14));
				
				//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
						// 예) 54.5   84.3 이면    64.285714%
//				System.out.println(" 문제8) 실수1 입력 :");  	double 문제8_1 = scanner.nextDouble();
//				System.out.println(" 문제8) 실수2 입력 :");  	double 문제8_2 = scanner.nextDouble();
//				
//				double 비율 = ( 문제8_1/문제8_2 ) * 100;
//				System.out.println(" 실수1의 실수2 백분율 : " + 비율 + "%");
//				System.out.printf(" 실수1의 실수2 백분율 : %.1f %% \n" , 비율);
//						// %f : 실수 표현
							// %.숫자f		// %.2f : 소수 2자리 까지 표현
											// %.5f : 소수 5자리 까지 표현
				
				
				
				//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
						//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
//				System.out.println(" 윗변 입력 :");  	int 윗변 = scanner.nextInt();
//				System.out.println(" 밑변 입력 :");  	int 밑변 = scanner.nextInt();
//				System.out.println(" 높이 입력 :");  	int 높이 = scanner.nextInt();				
//				System.out.println("사다리꼴의 넓이는 :" + (윗변 * 밑변) * 높이 /2);  	
				
				//문제10: 키를 정수를 입력받아 표준체중 출력하기
						//표준체중 계산식 = > (키 - 100) * 0.9
//				System.out.println(" 키를 입력하세요 :");  	int 키 = scanner.nextInt();
//				System.out.println(" 표준체중은 :" + (키 - 100)*0.9);
				
				//문제11: 키와 몸무게를 입력받아 BMI 출력하기
						//BMI 계산식 = > 몸무게 / ((키 / 100.0) * (키 / 100.0))
//				System.out.println(" 몸무게를 입력하세요 :");  	double 몸무계 = scanner.nextDouble();
//				System.out.println(" 키를 입력하세요 :");   	double 키 = scanner.nextDouble();
//				System.out.println(" BMI 는 :" + (몸무계 / ((키/100)*(키/100))));
				
				//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ]
//				System.out.println(" 인치를 입력하세요 :");  	int 인치 = scanner.nextInt();
//				System.out.println("cm :" + (인치 * 2.54));
				
				
				
				
				//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
						//소수 둘째 자리 까지 점수 출력하기
						//중간고사 반영비율 => 30 %
						//기말고사 반영비율 => 30 %
						//수행평가 반영비율 => 40 %
//				System.out.print(" 중간고사 :");  	double 중간고사 = scanner.nextDouble();
//				System.out.print(" 기말고사 :");  	double 기말고사 = scanner.nextDouble();
//				System.out.print(" 수행평가 :");  	double 수행평가 = scanner.nextDouble();
//				중간고사 = 중간고사 * 0.3;
//				기말고사 *= 0.3;
//				수행평가 *= 0.4;
//				System.out.printf(" 반영비율별 총점 : %.2f \n" , (중간고사+기말고사+수행평가));
//				
						
				
				//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
					//int x = 10;
					//int y = x-- + 5 + --x;
					//printf(" x의 값 : %d , y의값 : %d ", x, y)
						// x-- + 5 = 15
						// x=9
						// 15 + --x = 23 [ x 먼저 8이됨 ]
						
		
				//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
				System.out.println(" 나이를 입력하세요 :");  	int 나이 = scanner.nextInt();
				String 학생 = scanner.next(); 	
				
				
				
				
				
		
				//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬
				System.out.println(" 정수 1 :"); 	int 정수1 = scanner.nextInt();
				System.out.println(" 정수 2 :"); 	int 정수2 = scanner.nextInt();
				System.out.println(" 정수 3 :");	 	int 정수3 = scanner.nextInt();
				
			
				
						
				
				//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
		
		

			
		
	}

}
