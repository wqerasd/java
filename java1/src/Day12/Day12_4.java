package Day12;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Day12_4 {

	// ������ȣ ���� ���α׷�
	// ����
		// 1. ���� 0000 ~ 9999 ������ ���� 10�� �����ؼ� �迭�� ����
		// 2. ��� ���� ��ȣ�� �迭�� ����
		// 3. ���ڸ� ��ȣ�� Ȧ/¦ ����
		// 4. ���� ���ڸ��� ��ȣ�� Ȧ���� ���� �迭�� ����
		// 5. ���� ���ڸ��� ��ȣ�� ¦���� ���� �迭�� ����
		// 6. Ȧ������ �迭 ��� // ¦������ �迭 ���
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü
	
		String[] carlist = new String[10]; // ���ڿ� 10�� �����Ҽ� �ִ� �迭 [ ������ȣ �ִ� 10�� ���� ���� ]
		String[] evenlist = new String[10]; // ¦������ �迭
		String[] oddlist = new String[10];
		while(true) {
			
			// ��� ���� ��ȣ ���
			System.out.println(" \n*** �������� ��� ������ȣ *** ");
			for( String temp : carlist ) {
				if( temp != null ) {
					if(Integer.parseInt(temp) % 2 == 0 ) { // ��%2==0 �������� 0�̸� ¦��
						System.out.print(temp+ "[¦] ");
						for( int i = 0; i<evenlist.length; i++ ) {
							if( evenlist[i] == null) {
								evenlist[i] = temp; break;
							}
						}
						
					}else {				// ��%2 == 1 �������� 1�̸� Ȧ��
						System.out.print(temp+ "[Ȧ] ");
						for( int i = 0; i<oddlist.length; i++ ) {
							if( oddlist[i] == null) {
								oddlist[i] = temp; break;
							}
						}
					}
					
					}
			}
			// Ȧ������ ��ȣ ���
			System.out.println(" \n*** �������� ��� Ȧ�� ���� *** ");
			
			// ¦������ ��ȣ ���
			System.out.println(" \n*** �������� ��� ¦�� ���� *** ");
			
			System.out.print(" 1.��������" ); int ch = scanner.nextInt();
			if( ch == 1 ) {
				// ������ȣ ���� ����
				Random random = new Random(); // ���� ��ü
				int intnum = random.nextInt(10000); // 0~9999 �� ���� �߻�
				String strnum = String.format("%04d", intnum); // %0����d : ���ڸ�ŭ �ڸ��� [
				// �迭�� ������ ã�� ������ȣ ����
				boolean save = false;
											// ����
												// %d : ���� %f : �Ǽ� %s : ����
												// %����d : ���ڸ�ŭ �ڸ���  [ ���� �ش� �ڸ����� ������ ���� ]
												// %0����d : ���ڸ�ŭ �ڸ��� [ ���� �ش� �ڸ����� ������ 0 ]
				for( int i = 0; i<carlist.length; i++ ) {
					if( carlist[i] == null ) { carlist[i] = strnum; save = true; break; }
				}
				// ���࿡ ������� ������ ����
				System.err.println(" ���� [ ���� �Ұ� ] ");
			}
		}
	}
}
