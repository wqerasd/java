package Day08;



public class Member {
	
	// 1. �ʵ�
		String id;
		String password;
		String name;
		String phone;
		
	// 2. ������
		// 1. �������[�⺻������] : �޼ҵ�ȣ��� ��ü������
		public Member() { }
		// 2. ��� �ʵ带 �޴� ������ : ȸ�����Կ� ��ü������
				public Member( String id, String password, String name, String phone) {
					this.id = id;
					this.password = password;
					this.name = name;
					this.phone = phone;
				}
				
	// 3. �޼ҵ�
		// 1. ȸ������ �޼ҵ� [ �μ�x ��ȯo : ���Լ���TRUE / ���Խ���FALSE]
	boolean ȸ������() {
		System.out.println(" ----- ȸ������ ������ ----- ");
		// 1. �Է¹޴´� [ id , pw , name, phone ]
		System.out.print(" ���̵� : "); 	String id = Day08_5.scanner.next();
		System.out.print(" ��й�ȣ : ");	String password = Day08_5.scanner.next();
		System.out.print(" �̸� : ");		String name = Day08_5.scanner.next();
		System.out.print(" ����ó : ");	String phone = Day08_5.scanner.next();
		
		//�ߺ�üũ
		for( Member temp : Day08_5.member ) {
			if( temp != null && temp.equals(id) ) {
				System.err.println(" �˸�)) ���� ������� ���̵� �Դϴ�. ");
				return false;
			}
			else { System.err.println(" ȸ������ �Ϸ�. "); break; }
		}
		
		// ���ο� ȸ�� ȸ������Ʈ�� �ֱ�
		Member member = new Member( id , password , name , phone );
		int i = 0;
		for( Member temp : Day08_5.member ) {
			if( temp == null ) {
				Day08_5.member[i] = member;				
			}
		}
		return false;
	}
	String �α���() {
		System.out.println(" ----- �α��� ������ -----");
		System.out.println(" ���̵� : "); String id = Day08_5.scanner.next();
		System.out.println(" ��й�ȣ : "); String password = Day08_5.scanner.next();
		for(Member temp : Day08_5.member ) {
			if( temp != null && temp.id.equals(id) && temp.password.equals(password) ) {
				return temp.id;
			}
		}
		return null;
	}
	void ���̵�ã��() {
		System.out.println(" ----- ���̵� ã�� �������Դϴ�. -----");
	}
} // c e




