package ����;

import java.util.Scanner;

public class Ű����ũ1 { // c s

	public static void main(String[] args) { // m s
		
		
		// Day01 : �����
				// Day02 : ����[����] ����[���]
				// Day03 : if[���] for[�ݺ���]
				
				// ���Ǳ� ���α׷�
					// 1. �޴��� [ 1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ] 
					// 		// 1.�޴��ǿ��� ��ǰ�����ϸ� ��ٱ��Ͽ� �ֱ� 
					//		// 2.��� �����ϸ� �˸�( ������ )
					// 2. �ʱ� ��� [ ��ǰ �� 10���� ]
					// 3. ������ �ݾ��Է¹޾� ������ ��ŭ ������ �ܵ� ��� 
							// 1. ������ �ݾ׺��� ���ž� �� �� ũ�� ���� ��� [ �ݾ׺��� ]
		
	Scanner scanner = new Scanner(System.in);
	int �ݶ���� = 10; int ȯŸ��� = 10; int ���̴���� = 10;
	int �ݶ󱸸ż� = 0;  int ȯŸ���ż� = 0;  int ���̴ٱ��ż� = 0;
	
	while(true) {
		System.out.println(" 1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.����");
		int ch = scanner.nextInt();
		if( ch == 1 ) {
			if( �ݶ���� == 0 ){
				System.out.println(" ��� �����մϴ�. ");								
			}
			else if( �ݶ���� != 0 ){
				System.out.println(" ��ٱ��Ͽ� �־����ϴ�. ");
				�ݶ����--;
				�ݶ󱸸ż�++;
			}			
		}
		else if( ch == 2 ) {
			if( ȯŸ��� == 0 ){
				System.out.println(" ��� �����մϴ�. ");								
			}
			else if( ȯŸ��� != 0 ){
				System.out.println(" ��ٱ��Ͽ� �־����ϴ�. ");
				ȯŸ���--;
				ȯŸ���ż�++;
			}			
		}
		else if( ch == 3 ) {
			if( ���̴���� == 0 ){
				System.out.println(" ��� �����մϴ�. ");								
			}
			else if( ���̴���� != 0 ){
				System.out.println(" ��ٱ��Ͽ� �־����ϴ�. ");
				���̴����--;
				���̴ٱ��ż�++;
			}			
		}
		else if( ch == 4 ) {
			System.out.println(" ���� ��ǰ ��� ");
			System.out.println("��ǰ��\t����\t�ݾ�");
			if( �ݶ󱸸ż� != 0) {	System.out.println( "�ݶ�\t" + �ݶ󱸸ż� + "\t" + ( �ݶ󱸸ż�*300 ) ); }
			if( ȯŸ���ż� != 0) {	System.out.println( "ȯŸ\t" + ȯŸ���ż� + "\t" + ( ȯŸ���ż�*300 ) ); }
			if( ���̴ٱ��ż� != 0) {	System.out.println( "���̴�\t" + ���̴ٱ��ż� + "\t" + ( ���̴ٱ��ż�*300 ) ); }
			int �ѱ��ž� = ( �ݶ󱸸ż�*300 ) + ( ȯŸ���ż�*300 ) + ( ���̴ٱ��ż�*300 );
			System.out.println(" ��ǰ �� ����� : " + �ѱ��ž� );
			System.out.println("--------------------");
			System.out.println(" 1.���� 2.��� "); int ch2 = scanner.nextInt();
			
			if( ch2 == 1 ) {
				while(true) {
					System.out.println(" �ݾ� : "); int �ݾ� = scanner.nextInt();
					if( �ݾ� < �ѱ��ž� ) {
						System.out.println(" �ݾ��� �����մϴ�.");
					}
					else if( �ݾ� > �ѱ��ž� ) {
						System.out.println(" ���ſϷ� ");
						System.out.println(" �ܵ��� ����մϴ�. " + ( �ݾ� - �ѱ��ž� ) + "��" );
						break;
					}
			else if( ch2 == 2 ) {
				System.out.println(" ���Ÿ���� �ʱ�ȭ �˴ϴ�.");
				�ݶ󱸸ż� += �ݶ����; ȯŸ���ż� += ȯŸ���; ���̴ٱ��ż� += ���̴����;
				�ݶ󱸸ż� = 0; ȯŸ���ż� = 0; ���̴ٱ��ż� = 0 ;
					}
				}
			}
			
		}
		else {
			System.out.println(" �˼����� ����Դϴ�. ");
		}
		
		
		
	}
	
		
		
	} // m e
} // c e
