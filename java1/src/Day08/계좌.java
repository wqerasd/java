package Day08;

//2. ����

		// �ʵ� 	: 1. �����̸� 2. �ݾ� 3. ���� 4. ������[id] 5. ��ȯ���� 
		// �޼ҵ� : 1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���� 6. ���¸��

public class ���� {
	
	// 1. �ʵ�
		String �ֹε�Ϲ�ȣ;
		String �̸�;
		String ��й�ȣ;
		
	// 2. ������ 
		public ����() {}

		public ����(String �ֹε�Ϲ�ȣ, String �̸�) {		
			this.�ֹε�Ϲ�ȣ = �ֹε�Ϲ�ȣ;
			this.�̸� = �̸�;
		}
		
	// 3. �޼ҵ�
	boolean ���»���()  {
		System.out.println(" ----- ���»��� ������ ----- ");
		System.out.println(" ��й�ȣ ");	 	String ��й�ȣ = Day08_5.scanner.next();
		System.out.println(" �̸� :"); 		String �̸� = Day08_5.scanner.next();
		System.out.println(" �ֹε�Ϲ�ȣ : ");	String �ֹε�Ϲ�ȣ = Day08_5.scanner.next();
		
		//�ߺ�üũ
		for( ���� temp : Day08_5.account ) {
			if( temp != null && temp.equals(�ֹε�Ϲ�ȣ) ) {
				System.err.println(" �˸� )) �̹� �ֹε�Ϲ�ȣ�� ���� ���°� �ֽ��ϴ�.");
				return false;
			}
			else { System.err.println(" ���°� �����Ǿ����ϴ�. "); break; }
		}
		
		���� account = new ����( �ֹε�Ϲ�ȣ , �̸� );
		int i = 0;
		for( ���� temp : Day08_5.account) {
			if( temp == null ) {
				Day08_5.account[i] = account;
			}
		}
		return false;
	}
	
	
	

}
