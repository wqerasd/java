package Day6;

import java.util.Scanner;

import javax.swing.border.Border;

public class Day06_6 { // c s
	
	// ��ȸ���� �Խ��� [ Ŭ���� ]
		// 0. �Խù� ���� => Ŭ���� ����
			// �ʵ� : ���� , ���� , �ۼ��� , ��й�ȣ
			// ������ : ������� ����
		
		// 1. ù ȭ�� [ ��� �Խù� ( ��ȣ , �ۼ��� , ����) ��� ]
	
		// 2. �޴� [ 1. �� ���� 2. �� ���� ]
			// 1. �� ���� [ ���� , ���� , �ۼ��� , ��й�ȣ => 4������ -> ��üȭ ]
			// 2. �ۺ��� [ �ش� �� ��ȣ�� �ش� �� ��������( ��ȣ , �ۼ��� , ���� , ����) ǥ�� ]
				// �� ��ȣ�� �迭�� ����Ǵ� ���� [ �ε��� ]
				// �� ���� �޴�
			// 3. �� ���� �޴� [ 1. ��Ϻ��� 2. ���� 3. ���� ]
				// 1. ������ : ��й�ȣ �Է¹޾� �����ϸ� ����
				// 2. ������ : ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ����
	
	public static void main(String[] args) { // m s 
		
			// �غ� [ ��� {} �ȿ��� ���Ǵ� ���� ���� ]
			Scanner scanner = new Scanner(System.in); // 1. �Է°�ü
			Board[] boardlist = new Board[100]; // * Board ��ü�� 100���� �����Ҽ� �ִ� 1���� �迭 ���� 
		
			while(true) { // ���α׷� ���� ���ѷ��� [ �������� : x ]
				System.out.println("--------- Ŀ�´�Ƽ ----------");
				////////////////////////////// ��� �Խù� ��ȸ //////////////////////
				System.out.println("��ȣ\t�ۼ���\t����");
				int index = 0; // �ε��� ���� [ �迭�� ��ü �� üũ ]
				for( Board board : boardlist ) { // �迭�� ��� ��ü(�Խù�) ��� �ݺ��� 
					if( board != null ) { // ���࿡ �ش� board ��ü�� ���빰�� ������ ���
						System.out.printf("%d\t%s\t%s \n" , index , board.writer , board.title);
					}
					index++; // �ε��� ����
				}
				//////////////////////////////////////////////////////////////
				System.out.print("1.�۾��� 2.�ۺ���  ���� : ");
				int ch = scanner.nextInt();
				if( ch== 1 ) { // 1. �۾��� 
					/////////////////////////////////////// �۾��� /////////////////////////////////
					// 1. 4�� ������ �Է¹޴´� 
					System.out.println("----------------- �� ���� ������ ----------------");
					System.out.print(" title : ");		String title = scanner.next();
					System.out.print(" content : ");	String content = scanner.next();
					System.out.print(" writer : ");		String writer = scanner.next();
					System.out.print(" password : ");	String password = scanner.next();
					// 2. 4�� ������ ��üȭ [ ��ü�� ���� 4�������� ��ü�� �ʵ忡 ���� ]
					Board board = new Board( title , content , writer , password ); // 4�� �ʵ带 ���� ������ ���
					// 3. �迭�� ������� ã�Ƽ� ������� ��ü ����
					int i = 0;
					for( Board temp : boardlist ) {
						if( temp == null ) { // ����� ã������ 
							boardlist[i] = board; // �ش� �ε����� ���ο� ��ü ���� 
							break; // �ѹ� ���������� �ݺ��� ���� 
						}
						i++;
					}
					//////////////////////////////////////////////////////////////////////////
				}
			
				else if( ch==2 ) { // 2. �ۺ��� 
					//////////////////////////////////////////// �� ���� //////////////////////////////
					System.out.print(" �Խù� ��ȣ(�ε���) ���� : "); int bno = scanner.nextInt();
				
					System.out.println("------------- �Խù� �������� --------------------");
					// �ݺ��� ��� ����X -> �������ġ[�ε���] �Է� �޾ұ� ������ -> �Է¹��� �ε��� ��ġ�� ��ü ��� 
					System.out.printf("�ۼ���: %s  ���� : %s \n" ,  
							boardlist[bno].writer , boardlist[bno].title );
				
					System.out.printf("���� : %s \n" , boardlist[bno].content );
					System.out.println("----------------------------------------");
					System.out.print(" 1. ��Ϻ���(�ڷΰ���) 2.�ۻ��� 3.�ۼ��� ���� : ");
				
					////////////////////////////////////////////////////////////////////////////////
				
					int ch2 = scanner.nextInt();
					if( ch2 == 1 ) {}
					else if( ch2 == 2 ) {
						////////////////////////////////////////////�� ���� ////////////////////////////////
						System.out.println(" �˸�)) �� �Խù� ��й�ȣ : " );  String password = scanner.next();
						// �ݺ���X �˻�x => ������ �ε��� ��ġ�� �Է¹޾ұ� ������
						if( boardlist[bno].password.equals(password) ) { // �Խù���ü�� ��й�ȣ == �Է��� ��й�ȣ 
							System.out.println(" �˸�)) ���� ���� ");
							boardlist[bno] = null; // �ش� �Խù��� null ���� // ����ó��
							// �����Ŀ� ������ �ε��� �ڷ� ��ĭ�� ������ �̵� 
								// ��???  ���࿡ �ش� �ڵ尡 ������� �迭�� ���̻��� ���� �߻� 
							for( int i = bno ; i< boardlist.length ; i++ ) { // �迭���� = 100  �ε��� : 0~99
								// * �˻��� �Խù��� �ε������� �������ε������� 1������ 
								if( i == boardlist.length-1 ) boardlist[ boardlist.length-1 ] = null;
								// i�� �������ε��� �� ������ �������ε������� null ����
								else boardlist[i] = boardlist[i+1];// ������ �Խù� ���� �Խù�
								// ������ �ε����� �ƴϸ� �ε��� ���� 
									// *  	���࿡ 2�� �ε��� ������ 
									// 		2�ε��� = 3�ε��� 
									//	  	3�ε��� = 4�ε��� 
									//		4�ε��� = 5�ε��� 
									//      ~~~~~~~~~~~
									//		98�ε��� = 99�ε��� [ 0��~99�� -> 100�� �ε��� ]
									//		99�ε��� = null [ 99�� �ε��� : �������ε��� ] 
							}
						}else {
							System.out.println(" �˸�)) ��й�ȣ�� �ٸ��ϴ� [ �������� ]");
						}
					
						///////////////////////////////////////////////////////////////////////////////////
					
					}
					else if( ch2 == 3 ) {
						// 1. ��й�ȣ �Է¹ޱ�
						System.out.println(" �˸�)) �� �Խù� ��й�ȣ : "); String password = scanner.next();
						// 2. bno : ���Խù�(�����ִ°Խù�)�� �ε��� ��ü�� ��й�ȣ�� �Է¹��� ��й�ȣ�� �����ϸ�
						if( boardlist[bno].password.equals(password) ) {
							// �ش� �Խù��� ����� ������ ���� �Է¹޾� �� �Խù���ü�� ����� ���뿡 ����.
							System.out.println(" ������ ���� : "); boardlist[bno].title = scanner.next();
							System.out.println(" ������ ���� : "); boardlist[bno].content = scanner.next();
							
							System.out.println(" �˸�)) ������ �����Ǿ����ϴ�. ");
						}
					}
					else { // ���� ��й�ȣ�� �ٸ��ϴ�.
						System.err.println(" �˸�)) �˼����� ��ȣ�Դϴ�. ");
					}
				
				}
				else {
					System.err.println(" �˸�)) �˼����� ��ȣ�Դϴ�. ");
				}
			
			} // ���α׷� while end  
		
		} // m e 
} // c e 