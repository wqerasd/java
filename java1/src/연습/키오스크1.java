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
		int �ݶ󱸸ż� = 0; int ȯŸ���ż� = 0; int ���̴ٱ��ż� = 0;
		
		 while(true) { // while s
			 System.out.println(" ---------- �޴� ----------");
			 System.out.println(" 1. �ݶ�(300) 2. ȯŸ(200) 3. ���̴�(100) 4. ���� "); 
			 System.out.println(" ���� >>>>>>>>>"); int ���� = scanner.nextInt();
			 
			 if( ���� == 1 ) { // if1 s
				 if( �ݶ���� == 0 ) { // if2 s
					 System.err.println(" �ݶ���� �����մϴ�. ����غ���.");					 					 
				 } // if2 e
				 else { //else s
					 System.err.println(" [[ �ݶ� ��ҽ��ϴ� ]]");
					 �ݶ󱸸ż�++;
					 �ݶ����--;					 
				 } //else e				 
			 } // if1 e
			 
			 else if( ���� == 2 ) { // else if1 s
				 if( ȯŸ��� == 0 ) { // if1 s
					 System.out.println(" ȯŸ��� �����մϴ�. ����غ���.");
				 } // if1 e
				 else {  // else s
					 System.out.println(" [[ ȯŸ�� ��ҽ��ϴ� ]]");
					 ȯŸ���ż�++;
					 ȯŸ���--;
				 } // else e				 				 				 
			 } // else if1 e
			 
			 else if( ���� == 3 ) { // else if1 s
				 if( ���̴���� == 0 ) { // if1 s
					 System.out.println(" ���̴���� �����մϴ�. ����غ���.");
				 } // if1 e
				 else {  // else s
					 System.out.println(" [[ ���̴ٸ� ��ҽ��ϴ� ]]");
					 ���̴ٱ��ż�++;
					 ���̴����--;
				 } // else e
			 } // else if1 e
			 
			 else if( ���� == 4 ) {
				 System.out.println(" ---------- ���� ��ǰ��� ---------- ");
				 System.out.println(" ��ǰ��\t����\t�ݾ�");
				 if( �ݶ󱸸ż� != 0 ) System.out.println(" �ݶ�\t" + �ݶ󱸸ż� + "\t" +(�ݶ󱸸ż�*300) );
				 if( ȯŸ���ż� != 0 ) System.out.println(" ȯŸ\t" + ȯŸ���ż� + "\t" +(ȯŸ���ż�*200) );
				 if( ���̴ٱ��ż� != 0 ) System.out.println(" ���̴�\t" + ���̴ٱ��ż� + "\t" +(���̴ٱ��ż�*100) );
				 int �Ѱ����� = (�ݶ󱸸ż�*300) + (ȯŸ���ż�*200) + (���̴ٱ��ż�*100);
				 System.out.println(" ��ǰ �� ������ : "+ �Ѱ�����);
				 System.out.println("-----------------------------");
				 System.out.println(" 1. ���� 2. ���");
				 
			 }
				 
			 
			 
		 } // while e
				 
		
		
	} // m e
} // c e
