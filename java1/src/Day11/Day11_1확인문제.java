package Day11;

public class Day11_1Ȯ�ι��� {

	// p.386 Ȯ�ι���
		// 1. 3 [ �������̽��� ��� : 1.����ʵ� 2.�߻�޼ҵ�* 3.����Ʈ�޼ҵ� 4.�����޼ҵ� ]
		// 2. 4 [ �������̽� ���� = ������ü ]
			// ������ü = Ŭ������ implements�� ��ü
	// 3.
	private static void printSound( Soundable soundable) {
//	����������	����		��ȯŸ��	�޼ҵ��	( �μ� [ ����,�迭,��ü,�������̽�] )
		
		System.out.println( soundable.sound() );
	}
	public static void dbwork(DateAccessObject dao) {
		dao.select();
		dao.insert();;
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) { // m s
		printSound( new Cat() );
					//������ü
		printSound( new ������() );
		
		Soundable soundable = new Cat(); //  2
		Soundable[] soundables = new Cat[100]; // 3
		
	// 4.
		// Dao : DB���ٰ�ü     Dto :������ �̵� ��ü
		dbwork( new OracleDao() );
		dbwork( new MysqlDao() );
	
	// 5. �͸�ü [ �������̽��� ���� ���� ]
		// ������ü : �������̽� ��ü�� = new Ŭ������();
		// �͸�ü : �������̽� ��ü�� = new �������̽�(  ){ �����ϱ� }; // 1ȸ�붧 ���̾�
	Action action = new Action() {
		
		@Override
		public void work() {
			System.out.println(" ���縦 �մϴ�.");
			
		}
	}; // ������
		
	action.work();
		
		
		
		
	} // m e		
}
