package Day05;

import java.util.Scanner;

// 1. ����� 2. ����/�ڷ���/���� 3. ����/�ݺ� 4. ����/�ݺ� 5. �迭

 // ���� �뿩 console ���α׷�

	// 1. �迭
			// 1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ]
			// 2. ���� [ ������(�ߺ�x) , �����뿩����(�뿩���� , �뿩��) , �뿩��(�α��ν� ���̵�) ]

	// 2. �ʱ�޴�
			// 1. ȸ������ 2. �α���
				// 1. ȸ�����Խ� ���̵� �ߺ�üũ

	// 3. �α��ν� �޴�
			// 1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�
				// 1. ���� �˻��� �������� ��ġ�ϸ� ������� �����뿩���� ���
				// 2. ���� ��Ͻ� ��� ������ ���
				// 3. ���� �뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
				// 4. ���� �ݳ��� ������ �뿩�� ������ �ݳ� ó��
				// 5. �α׾ƿ�

	// 4. �α��ν� ���̵� admin�̸� ������ �޴�
			// 1. ������� 2. ������� 3. ��������(����) 4. �α׾ƿ�
				// 1. ���� ��Ͻ� �������� �Է¹޾� ���� ���ó��
				// 2. ���� ��Ͻ� ��� ������ ���
				// 3. ���� ������ ������ �������� �Է¹޾� ������ ������ ���� [null]
				// 4. �α׾ƿ��� �ʱ�޴���

public class Day05_4 { // c s
	
	public static void main(String[] args) { // m s
				
		// �غ�
				Scanner scanner = new Scanner(System.in);
				String[][] memberlist = new String[100][2]; // ȸ��
				String[] booklist = new String[100]; // ���� -> ������ 
				
				while(true) {// w1 s
					System.out.println("-------------------------");
					System.out.println("1. ȸ������\t 2. �α���");
					System.out.println("-------------------------");
					int select1 = scanner.nextInt();
					if(select1 == 1) { // if1 s
						boolean check = true;
						System.out.println("ȸ�������� ȯ���մϴ�");
						System.out.println("�����Ͻ� ���̵� �Է����ּ���"); String id = scanner.next();
						System.out.println("���̵��� ��й�ȣ�� �Է����ּ���"); String pw = scanner.next();
						for(int i = 0; i < memberlist.length; i++) {// for1 s
							if(memberlist[i][0] == null) { // if2 s
								// i��° �࿡ id�� ������ = �����
								memberlist[i][0] = id;
								memberlist[i][1] = pw; // i��° �� ���� ������ ����
								check = true;
								break; // ���������� �� [1���� �����ؾ� �ϱ� ����]
									}  // if2 e
						
						// ���̵� �ߺ�üũ
						for(int j = 0; j<memberlist.length; j++) { // for 2 s
							if(memberlist[j][0] != null && memberlist[j][0].equals(id) ) { // if 2 s
								// 2. �Է¹��� ���� j��° �ε������� ������ ��
								System.err.println(" �˸�)) �̹� �ִ� ���̵� �Դϴ�.[���Է�]");
								check = false; // ����x ȸ������ �Ұ����ϰ� save ������ false�� ����
								break;
								} // if 2 e
							}// for 2 e
						}// for 1 e
					} // if1 e
					// ���̵� ��� �´��� ���� üũ
					
					// �α��� ������
					else if(select1 ==2) {// if2 s
						System.out.println("-------------�α��� ������-------------");
						System.out.println("���̵� : "); String id = scanner.next();
						System.out.println("��й�ȣ : "); String pw = scanner.next();
						
						boolean logincheck = false;
						for(int i = 0 ; i<memberlist.length;i++) { // �α��� for 1 s
						if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw))
							{ System.out.println("�˸�)) �α��� ����");
							logincheck = true; } // if2 e
						else {System.out.println("�˸�)) ���̵� Ȥ�� ��й�ȣ ���� ");}
						// �α��� ������ ������
						if (memberlist[i][0] != null && memberlist[i][0].equals("admin") && memberlist[i][1].equals(pw))
								while(true) { // w3 s ������ ��� �α��ν�
									System.out.println("-------------������ ������-------------");
									System.out.println("1. ���� ���\t 2. ���� �޴� \t3. ���� ����\t 4. �α׾ƿ�");
									System.out.println(">>>>>>>>> ���� : ");
									int �����ڼ��� = scanner.nextInt();
									if(�����ڼ��� == 1) { // ���� ���
										boolean bookcheck = true;
										System.out.println("-------------���� ���-------------");
										System.out.println("����� �������� �Է����ּ���");
										String ������ = scanner.next();
										// �������
										for(int j = 0; j < booklist.length; j++) {// for1 s
											if(booklist[j]== null) { // if2 s
												// i��° �࿡ id�� ������ = �����
												booklist[j] = ������;
												bookcheck = true;
												break; // ���������� �� [1���� �����ؾ� �ϱ� ����]
													}  // if2 e
										// ����üũ
										for(int x = 0; x<booklist.length; x++) { // for 2 s
											if(booklist[x] != null && booklist[x].equals(������) ) { // if 2 s
												// 2. �Է¹��� ���� j��° �ε������� ������ ��
												System.err.println(" �˸�)) �̹� �ִ� ���� �Դϴ�.[���Է�]");
												bookcheck = false; // ����x 
												break;
												} // if 2 e
											}// for 2 e
										} // for 1 e
									}
									
									else if(�����ڼ��� == 2) { // ���� �޴�
										for( int j = 0 ; j<booklist.length; j++ ) { // for1 s
											if(booklist[j] != null)
											System.out.printf(" ��ϵ� ���� ��� : %s\n" , booklist[j] );
											
										} // for1 e
										
									}
									else if(�����ڼ��� == 3) { // ���� ����
										
									}
									else if(�����ڼ��� == 4) { // �α׾ƿ�
										break;
									}
									else System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���");
								} //  w3 e ������ ��� �α׾ƿ�
						else
							while(true) { // w2 s
									System.out.println("-------------�α��� ������-------------");
									System.out.println("1. ���� �˻�\t 2. ���� ��� \t3. ���� �뿩\t 4. ���� �ݳ�\t 5. �α׾ƿ�");
									int select2 = scanner.nextInt();
									if( select1 == 1) { // ���� �˻�
										System.out.println("------������ �˻��մϴ�------");
										System.out.println("�˻��� ������ : ");
										String title1 = scanner.next(); // �����
										
										for(int j = 0; j < booklist.length; j++) {
											if(booklist[j] != null && booklist[j].equals(title1))
												
										{System.out.println("�˻��� ����" + booklist[j] +"�� �����մϴ�.");}
										}
									}
								
									else if (select2 == 2) { // ���� ��� ���
										System.out.println("------���� ���------");
										for(int j = 0; j < booklist.length; j++) {
											if(booklist[j] != null ) {
											System.out.printf("���� ��ȣ : %d ������ : %s\n", j, booklist[i]); }
										}
									}
									else if (select2 == 3) { // ���� �뿩
										System.out.println("------���� �뿩------");
										System.out.println("�뿩�� �������� �Է��ϼ��� : ");
										String title2 = scanner.next(); // �뿩�� ������
										for(int j = 0; j < booklist.length; j++) 
												{ // ���� �뿩 ����
											if(booklist[j] == null) {
												System.out.println("������ �뿩�Ǿ����ϴ�."); }
											if (booklist[j] != null) {
													System.out.println("������ �뿩�� �Ұ����մϴ�.");
														}	
												}
										}
									else if (select2 == 4) { // ���� �ݳ�
										System.out.println("------���� �ݳ�------");
										System.out.println("�ݳ��� �������� �Է��ϼ��� : ");
										String title3 = scanner.next();
										for(int j = 0; j < booklist.length; j++) {
											if(booklist[j] != null && booklist[j].equals(title3))
											{System.out.println("������ �ݳ��Ǿ����ϴ�");}
										}
									}
									else if (select2 == 5) { // �α� �ƿ�
										break;
										}
									
								
								else System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���");
									} // w2 e
								} // �α��� for e
						} // if 2 e
						else System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���");
					} // w1 e
			} // m  e
		} // c e
		