package Day03;

import java.util.Scanner;

public class Day03_3 { //c s
	
	public static void main(String[] args) { //m s
		
		// ����6
		// ������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���հ�
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ������ �Է��ϼ��� :" ); 	int ���� = scanner.nextInt();		
		if( ���� >= 90 )		 System.out.println("�հ�");
		else			System.out.println("���հ�");
		
		
		//����7
		// ������ �Է¹޾� ������ 90�� �̻��̸� A���
		//				������ 80�� �̻��̸� B���
		//				������ 70�� �̻��̸� c���
		//				�׿� �����
		System.out.println("������ �Է��ϼ��� :");  	int ����1 = scanner.nextInt();
		if( ����1 >= 90) System.out.println("A���");
		else if( ����1 >= 80 ) System.out.println("B���");
		else if( ����1 >= 70 ) System.out.println("C���");
		else System.out.println("�����");
		
		//����8 �α���������
		// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
		// [ ���� ] : ȸ�����̵� admin �̰�
		//		 	��й�ȣ�� 1234�� ��쿡��
		//			�α��� ���� �ƴϸ� �α��� ���� ���
		
		System.out.print("���̵� �Է����ּ��� :");   String id = scanner.next();
			// char �ڷ��� [ ���� 1�� ���� ]
			// �ڷ������� ���ڿ��� �����Ҽ� ����.
				// 1. String Ŭ���� ����ϸ� ���ڿ� ���尡��
				// 2. char �迭/����Ʈ ����ϸ� ����
		System.out.print("��й�ȣ�� �Է����ּ��� :");	int pw = scanner.nextInt();
			// ��ü�� ����Ұ� (String)
				// �ڷ��� ����ϴ� ������ ������ ��� ����
				// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� -> �޼ҵ�
					// ���ڿ� �񱳽� .equals 
					// ���ڿ�1.equals( ���ڿ� )
		boolean �α��μ��� = false;
			// boolean : 1��Ʈ true Ȥ�� false ����
		
		if( id .equals("admin") ) { //id �� Ŭ���� ��ü�̱� ������ == �Ұ��� // ��ü�񱳽ÿ��� .equals
			// �Է��� id�� admin �̸�
			if( pw == 1234 ) {	// pw�� Ŭ���� ��ü�̱� ������ == ����
				// �Է��� pw 1234 �̸�
				System.out.println(" �˸�) �α��� ���� ");
				�α��μ��� = true;
			}
			else { // �Է��� pw 1234 dkslaus
				System.out.println(" �˸�) ��й�ȣ Ʋ�Ƚ��ϴ�.");
			}
			
		}else{ // �Է��� id�� admin �� �ƴϸ�
			System.out.println(" �˸�) ���̵� Ʋ�Ƚ��ϴ�.");
		}
		
		if( �α��μ��� == false ) System.out.println(" �˸�) �α��� ����");
		// �α��� ���� ������ false �̸� ���
		
		// ����9
		// [ �Է� ] : ����, ����, ���� �Է¹ޱ�
		// [ ���� ] ����� 90���̻��̸鼭  �������� 100�̸� ������ ���
		//							 �������� 100�̸� ������ ���
		//							 �������� 100�̸� ���п�� ���
		//         ����� 80���̻��̸鼭  �������� 100�̸� ������� ���
		//							 �������� 100�̸� ������� ���
		//							 �������� 100�̸� ������� ���
		//			�׿� �����
		
		System.out.println(" ���� ���� :");  	int ���� = scanner.nextInt();
		System.out.println(" ���� ���� :"); 	int ���� = scanner.nextInt();
		System.out.println(" ���� ���� :");  	int ���� = scanner.nextInt();
		int ��� = (���� + ���� + ����)/3; // ��� ���ϱ�
		
		if( ��� >= 90 ) { // ����� 90�� �̻��̸�
			
			// if ��ø
			if( ���� == 100 ) System.out.println("������");
			if( ���� == 100 ) System.out.println("������");
			if( ���� == 100 ) System.out.println("���п��");
			
		}else if( ��� >= 80 ) { // ����� 80�� �̻��̸�
			
			// if ��ø
			if( ���� >= 90 )	System.out.println("�������");
			if( ���� >= 90 ) System.out.println("�������");
			if( ���� >= 90 ) System.out.println("�������");
			
		}else System.out.println("�����"); // �� �ܸ�
		
			
		
		
		
		
		
		
		
		
	} //m e	

} //c e
