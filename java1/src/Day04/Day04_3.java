package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 { // c s
	
	/*
	 * ��������������
		1. ����ڿ��� ����[0]����[1]��[2] ����[3] �߿�  �Է¹ޱ�
		2. ��ǻ�� �����߻�[0~2] 
		3. ����ڿ� ��ǻ���� �¸��� �Ǵ� [ ����Ǽ� ]
		4. 3�� �����ϱ� ������ ���� ���� 
		5. 3�� ���ý� �������� 
			1. �� ���Ӽ� ���	��) 3��
			2. ���� �¸� ���	��) ��ǻ�� 2  ����� 1
	 */
			 	
	
	public static void main(String[] args) { // m s
		
		// �غ�
		int �÷��̾�; // ����ڰ� ������ �� ����
		int ��ǻ��;  // ��ǻ�Ͱ� ������ ������ �� ����
		int ���Ӽ� = 0; //�� ���������� Ƚ�� ����
		int �÷��̾�¸��� = 0; int ��ǻ�ͽ¸��� = 0; // �� �¸� �� ����
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		while(true) {
			
			System.out.println(" ------- ���������� ���� -------");
			System.out.println(" ����(0) ����(1) ��(2) ����(3) ���� : ");
			�÷��̾� = scanner.nextInt(); // �Է��� �� ����
			
			Random random = new Random(); // ���� ��ü ����
							// random.nextInt() :  int�� ǥ���Ҽ� �ִ� ������ ���� �߻� 
							// random.nextInt(��) + ���۹�ȣ :  0 ~ �� ������ ������ ���� �߻� 
								// random.nextInt(10) : 0~9 �� ���� �߻�
								// random.nextInt(11)+10 : 10~20 �� ���� �߻�
			��ǻ�� = random.nextInt(3); 		// ������ ����(int��)�� ��������
			
			// ��������
			if( �÷��̾� == 3 ) {
				System.out.println(" �˸�)) �������� ");
				System.out.println(" �� ���� Ƚ�� : " + ���Ӽ� );
				if( �÷��̾�¸��� > ��ǻ�ͽ¸��� ) {System.out.println(" ���� �¸��� : �÷��̾� ("+�÷��̾�¸���+")"); }
				else if( �÷��̾�¸��� < ��ǻ�ͽ¸��� ) { System.out.println(" ���� �¸��� : ��ǻ�� ("+��ǻ�ͽ¸���+")"); }
				else { System.out.println(" ���� �¸� : ���º� "); }
				
				break; // �ݺ��� ����;
				
			}else if( �÷��̾� >= 0 && �÷��̾� <=2 ) { // �����Է�
				// �¸��Ǵ�
				if( (�÷��̾�==0 && ��ǻ��==2) || (�÷��̾�==1 && ��ǻ��==0) || (�÷��̾�==2 && ��ǻ��==1) ) {
					// �÷�� �̱�� ����Ǽ�  // �÷��̾� �¸� ����Ǽ� [ 0 -> 2 / 1->0 / 2->1 ]
					System.out.println(" �˸�)) �÷��̾� �¸� ");
					�÷��̾�¸���++; // �¸��� �߰�										
				}else if( (�÷��̾�==0 && ��ǻ��==0) || (�÷��̾�==1 && ��ǻ��==1) || (�÷��̾�==2 && ��ǻ��==2)) { // ���¼�
					System.out.println(" �˸�)) ���º� ");
					}
					else { // �� �ܴ� ��ǻ�� �¸�
						System.out.println(" �˸�)) ��ǻ�� �¸� ");
						��ǻ�ͽ¸���++;
					}
						// ���Ӽ� ����
						���Ӽ�++;	
				
			}else {
				System.out.println(" �˸�)) �˼����� �����Դϴ�. ");
			}
			
																										
			
		}
		
		
	} // m e

} // c e