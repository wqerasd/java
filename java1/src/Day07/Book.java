package Day07;

public class Book {
	
	// 1. �ʵ�
	String ISBN;		// ISBN [ ������ȣ = �ĺ��� ]
	String bname;		// ������
	String bwriter;		// �۰�
	boolean brental;	// �����뿩����
	String mid;			// �뿩��ID
	
	// 2. ������
		// 1. �������[�⺻������] : �޼ҵ�ȣ���
	public Book() {}
	
		// 2. Ǯ������[����ʵ�޴»�����] : �������
	public Book(String iSBN, String bname, String bwriter, boolean brental, String mid) {		
		ISBN = ISBN;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
		
	// 3. �޼ҵ�
		// 1. �����˻�
	void �����˻�() {
		System.out.println(" ---------- �����˻� ������ ----------");
	}
		// 2. �������
	void �������() {
		System.out.println(" ---------- ������� ������ ----------");
		System.out.println(" ISBN\t������\t�۰�\t�뿩���ɿ���");
		for( Book temp : Day07_5_BookApplication.books) {
			if( temp != null ) {
				if( temp.brental ) 
					System.out.println( temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter +"\t" + "�뿩����");
				else // �ش絵���� �����뿩���ΰ� false
					System.out.println( temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter +"\t" + "�뿩��");
			}
		}
	}
		// 3. �����뿩
	void �����뿩() {
		System.out.println(" ---------- �����뿩 ������ ----------");
		System.out.println(" ���� ISBN : "); String ISBN = Day07_5_BookApplication.scanner.next();
		for( Book temp : Day07_5_BookApplication.books) {
			if( temp != null && temp ISBN.equals(ISBN) && temp.brental ) {
				System.out.println(" �˸�]] �ش� ������ �뿩�մϴ�.");
			}
		}
		
		
	}
		// 4. �����ݳ�
	void �����ݳ�() {
		System.out.println(" ---------- �����ݳ� ������ ----------");
	}
		// 5. �������
	void �������() {
		System.out.println(" ---------- ������� ������ ----------");
		// 1. �Է¹޾�
		System.out.println(" iSBN :"); 	String iSBN = Day07_5_BookApplication.scanner.next();
		System.out.println(" ������ :");	String bname = Day07_5_BookApplication.scanner.next();
		System.out.println(" �۰� :");	String bwriter = Day07_5_BookApplication.scanner.next();
		
		//* �ߺ�üũ[isbn]
				for( Book temp : Day07_5_BookApplication.books ) {
					if( temp != null && temp.ISBN.equals(iSBN) ) {
						System.out.println(" �˸�]] ���� ������� ISBN �Դϴ�. [ ��Ͻ��� ]");
						return; //������� �޼ҵ� ���� ( ��Ͻ��� )
					}
				}
		
		
		
		// 2. ��üȭ
		Book book = new Book(iSBN , bname , bwriter , true , null );			
		// 3. �迭 ����[�ֱ�]
		int i = 0;
		for( Book temp : Day07_5_BookApplication.books ) {
			if(temp == null ) {
				Day07_5_BookApplication.books[i] = book;
				System.out.println(" �˸�]] ������ ��ϵǾ����ϴ�. ");
				return; // ��� ������ �޼ҵ� ���� ( ��ϼ��� )
			}
			i++;
		}
		
		
	}
		// 6. ��������
	void ��������() {
		System.out.println(" ---------- �������� ������ ----------");
	}
	
	
	
	
}
