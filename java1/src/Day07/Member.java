package Day07;

public class Member {
	// ���Ŭ����

	// 1.�ʵ�
		int mno;		// ȸ����ȣ	[ �ڵ���ȣ , �ߺ�x ]
		String id;		// ���̵�		[ �ߺ�x ]
		String password;// ��й�ȣ
		String name;	// �̸�
		String phone;	// ����ó
		// 2.������ [ �����ڸ� == Ŭ������ ]
			// 1. �������[�⺻������]
		public Member() { }
			// 2. ��� �ʵ带 �޴� ������
		public Member(int mno, String id, String password, String name, String phone) {			
			this.mno = mno;
			this.id = id;
			this.password = password;
			this.name = name;
			this.phone = phone;
		}
		
		// 3.�޼ҵ�
			// 1. ȸ������ �޼ҵ� [ �μ�x ��ȯo : ���Լ���TRUE / ���Խ���FALSE]
		boolean ȸ������() {
			System.out.println(" ----- ȸ������ ������ ------");
			// 1. �Է¹޴´� [ id , pw , name , phone ]
			System.out.println(" ���̵� :"); String id = Day07_5_BookApplication.scanner.next();
			
			// * ���̵� �ߺ�üũ
						for( Member temp : Day07_5_BookApplication.members ) {
							if( temp != null && temp.id.equals(id) ) {
								// ���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
								System.out.println(" �˸�)) ���� ������� ���̵� �Դϴ�.");
								return false; // �Լ����� ---> ���̵� �ߺ��Ǿ��� ������ false  [���Խ��� ]
							}
						}
						
			System.out.println(" ��й�ȣ :"); String password = Day07_5_BookApplication.scanner.next();
			System.out.println(" �̸� :"); String name = Day07_5_BookApplication.scanner.next();
			System.out.println(" ����ó :"); String phone = Day07_5_BookApplication.scanner.next();
			
			

			
			// * ȸ����ȣ �ڵ����� [ ���� �ֱٿ� ������ ȸ���� ��ȣ + 1 ]
			int bno = 0; // ȸ����ȣ �����ϴ� ����
			int j = 0; // �ݺ�Ƚ�� [ �ε��� ]
			for( Member temp : Day07_5_BookApplication.members ) {
				if( temp == null ) { // null ã�� [ null�� ã������ null-1�� ������ȸ���� �ε���
					if( j == 0 ) { // ù��° �ε����� null => ùȸ�� => ùȸ����ȣ = 1 �ο�
					bno = 1; break;
					}
					else {
						 bno = Day07_5_BookApplication.members[j-1].mno + 1;
							// null �� [ ������ȸ�� ] ��ȣ�� +1
						 break;
					}
					
				}
				j++;
			}
			
			
			
			
			
			
			// 2. 4������ -> ��üȭ -> 1��
			Member member = new Member( 0 , id , password , name , phone ); // ��� �ʵ带 �޴� �����ڷ� ��ü����			
			// 3. �迭�� �� ������ ã�Ƽ� ���ο� ȸ��[��ü] �ֱ�
			int i = 0;
			for( Member temp : Day07_5_BookApplication.members ) {
				if( temp == null ) { // ������̸�
					Day07_5_BookApplication.members[i] = member; // �� �ε����� ���ο� ȸ�� ����
					return true; // ȸ������ �޼ҵ� ����~~~~ [ ��ȯ : true ]
				}
				i++; // i����
			}
			return false; // ȸ������ �޼ҵ� ���� ~~~~~~ [ ��ȯ : false ]
			// 4. ���� ������ true ��ȯ , ���н� false ��ȯ
				// * scanner ��ü�� �ٸ� Ŭ������ static ����Ǿ�����. // * Ŭ������.�ʵ��
				// * static �ʵ�.�޼ҵ�� ��ü���� ȣ�Ⱑ�� [ Ŭ������.�ʵ��/�޼ҵ�� ]
			
			
		}	
			
		
			
			
		
			
		

		// 2. �α��� �޼ҵ� [ �μ�x��ȯo : ]
				// �α��μ����� ������ ���̵��ȯ / ���н� NULL ��ȯ
		String �α���() {
			System.out.println(" ----- �α��� ������ ------");
			System.out.println(" ���̵� : "); String id =	Day07_5_BookApplication.scanner.next();				
			System.out.println(" ��й�ȣ : "); String password = Day07_5_BookApplication.scanner.next();
			// 2. �迭�� ��ü id�� password�� �Է��� ���� �����ϸ�
			for( Member temp1 : Day07_5_BookApplication.members ) {
				if( temp1 != null && temp1.id.equals(id)
						&& temp1.password.equals(password) ) {
					// * ������ �ƴϸ鼭 id�� password�� �����ϸ�
					return temp1.id; // ������ id ��ȯ
				}
			}
			return "���̵�";
		}
			// 3. ���̵�ã�� �޼ҵ� [ �μ�x��ȯx] : �̸� , ����ó
		void ���̵�ã��() {
			System.out.println(" ----- ���̵�ã�� ������ ------");
			System.out.println(" �̸� :"); String name = Day07_5_BookApplication.scanner.next();
			System.out.println(" ����ó :"); String phone = Day07_5_BookApplication.scanner.next();
			// 2. �Է¹��� ���� �迭�� ã��
			for( Member temp : Day07_5_BookApplication.members ) {
				if( temp != null && temp.name.equals(name) 
						&&temp.phone.equals(phone) ) {
					//* ������ �ƴϸ鼭 �ش� ��ü�� name , phone�� �Է¹��� ���� �����ϸ�
					System.out.println(" �˸�]] ȸ���� ���̵� : " + temp.id);
					return; // ������ ���� ã������ �ش� �޼ҵ� ����
				}
			}
		}
			// 4. ��й�ã�� �޼ҵ� [ �μ�x��ȯx ] : ���̵� , ����ó
		void ��й�ȣã��() {
			System.out.println(" ----- ��й�ȣã�� ������ ------");
			System.out.println(" ���̵� : "); String id = Day07_5_BookApplication.scanner.next();
			System.out.println(" ����ó : "); String password = Day07_5_BookApplication.scanner.next();
			for( Member temp : Day07_5_BookApplication.members) {
				if( temp != null && temp.id.equals(id) &&
						temp.phone.equals(phone) ) {
					System.out.println(" �˸�]] ȸ���� ��й�ȣ : " + temp.password);
					return;
				}
			}
		}
			// 5. ȸ��Ż�� �޼ҵ� 
			// 6. ȸ������ �޼ҵ� 
}
