package Day08;

import java.util.Scanner;

public class Day08_5 { // c s
	
	// ����� ��ũ ���α׷� [ 2�� ���� ]
		// �䱸����
		// ȸ�� �ֿ��� : 1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��
		// ���� �ֿ��� : 1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���� 6. ���¸��
			// ȸ���� ���� ���� ���
			// ������(�������) ���� ��ǰ�� ����ϸ� ��ϵ� �����ǰ���� ȸ������ �����ؼ� ���� ���
		// ���� : ���� , ���� , ȸ��
			// ����Ŭ���� = ����Ŭ����
				// �ʵ� : 1. �����̸� 2. �ݾ� 3. ���� 4. ������[id] 5. ��ȯ����
			// ����Ŭ����
				// �ʵ� : 1. ���¹�ȣ(�ߺ�x) 2. ���ݾ� 3. �̸�[id]
	
	
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] member = new Member[1000];
	static ����[] account = new ����[1000];
	
	
	

	public static void main(String[] args) { // m s
		
		Day08_5 day08_5 = new Day08_5();
		day08_5.menu();
	
	} // m e
	
	// 1. �ʱ�޴�
	void menu() {
		while(true) {
		System.out.println("  ---------- ����� ��ũ ���α׷� ----------");
		System.out.println(" 1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��");
		int ch = scanner.nextInt();
		Member member = new Member();
		if( ch == 1 ) {
			boolean result = member.ȸ������();
			
		}
		else if( ch == 2 ) {
		if( ch == 2 ) {
			String result = member.�α���();
			if( result == null ) { // �α��� ����
				System.out.println(" ȸ�������� �ٸ��ϴ�. ");
				}
			else if( result.equals("admin") ) {
				System.out.println(" ������ ���̵�� �α��ε˴ϴ�.");
				adminmenu();
				
				}
			else { System.out.println(" �α��εǾ����ϴ�. "); 
					membermenu();
			}
			
		}
		else if( ch == 3 ) {
			member.���̵�ã��();
		}
		else if( ch == 4 ) {
			//member.��й�ȣã��();
		}
		else { System.err.println(" �˸�)) �˼����� ����Դϴ�."); }
	}
}	
		
		
		
		
	
	}	
	void adminmenu( ) {
		System.out.println(" ---------- ������ �޴��Դϴ�. ---------- ");
		System.out.println(" 1. ������ 2. �����ڰ���");
	}
	void membermenu( ) {
		System.out.println(" ---------- ȸ�� �޴��Դϴ�. ---------- ");
		System.out.println(" 1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���� 6. �� ���¸�� ");
		int ch1 = scanner.nextInt();
		���� account = new ����();
		if( ch1 == 1) {
			boolean result = account.���»���();					
		}
		else if( ch1 == 2 ) {}
		else if( ch1 == 3 ) {}
		else if( ch1 == 4 ) {}
		else if( ch1 == 5 ) {}
		else if( ch1 == 6 ) {}
		else { System.out.println(" �˼����� ����Դϴ�. "); }
	}

	
} // c e
