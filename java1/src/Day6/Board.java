package Day6;

public class Board {
	// * Board Ŭ���� ����
	
	// 1. �ʵ�
	String title ;
	String content ;
	String writer ;
	String password ;
	
	// 2. ������ [ Ŭ���� �̸��� �����ϸ� �����ڸ� ]
		// �ڵ� : ������Ŭ��
	
		// 1. �������
	Board(){}
	
		// 2. 1�� �ʵ带 �޴� ������
	Board( String title ) {
		this.title = title;
		// this.�ʵ�� => ���κ���
		// * �ܺηκ��� ���� ������ ���κ����� ����
	}
	
		// 3. 2�� �ʵ带 �޴� ������
	Board( String title , String content ) {
		this.title = title;
		this.content = content;
	}
	
		// 4. 3�� �ʵ带 �޴� ������
	Board( String title , String content , String writr ) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
		// 5. 4�� �ʵ带 �޴� ������
	Board( String title , String content , String writer , String password ) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}
	
	// 3. �޼ҵ�
}
