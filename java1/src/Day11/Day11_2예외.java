package Day11;

public class Day11_2���� {

	// p.422
		// ��ǻ���� �ϵ���� ������ ��������� [ ����Ұ��� ]
		// ������� �߸��� ���� or �������� �߸��� �ڵ��� ������ ���ܶ���
		// ���� : 1.�Ϲݿ��� , 2.���࿹��
			// �Ϲݿ��� : ������[����]���� ���� �˻� [ �����ڿ��� ���� ����ó���� �ȳ� (������) ]
			// ���࿹�� : ������[����]�Ŀ� ���� �˻� [ �������� �������� �Ǵ��ؼ� ����ó�� ]
		// ����ó��
			// ���� : ������ �߻��ϸ� ���α׷��� ����ȴ�. [ ���������� ] 
			// ���࿡ ������ �߻��ϸ� ��ü �ڵ尡 ���� [ ���α׷��� ������� �ʰ� ]
		/* �����
		 * 
		 * try{
		 * 
		 * 		���ܰ� �߻��ҰͰ��� �ڵ�
		 * 
		 * }catch(����Ŭ���� ��ü��){
		 * 		// ���࿡ ���ܰ� �߻��ϸ� ����Ǵ� �ڵ�
		 * }
		 * 
		 */   
		
	public static void main(String[] args) {
		
		
		// p.423[NullPointerException]
	try {
		String data = null;
		System.out.println( data.toString() ); // objectŬ���� �޼ҵ� : toString() : ��ü������� 
			// ���������� ������ ����
		// ������ �߻��ϴ� ���� : null�� �޸� �Ҵ��� ���⶧���� ��ü������� �Ұ���
		} // t e
		catch( NullPointerException ��ü�� ) {
			System.out.println(" ���ܹ߻� : " + ��ü�� );
		} // c e
	
		// p.424
	try {
		String[] �迭 = new String[2]; // String 2���� �����Ҽ� �ִ� �迭
		�迭[0] = "a"; �迭[1] = "b"; �迭[2] = "c";
		
		}catch( ArrayIndexOutOfBoundsException e) {
				// ���ܹ߻��� ����Ŭ������ = ��ü�� ���� ������ �����
			//���࿡ ���ܰ� �߻��ϸ� ����Ǵ��ڵ�
			System.out.println(" ���ܹ߻� : " + e);
		}
	
	// p.426[NumberFormatException]
	try {
		String data1 = "100"; 	// ���ڿ�
		String data2 = "a100"; // ���ڿ�
		int value1 = Integer.parseInt(data1); // "100" -> 100
		int value2 = Integer.parseInt(data2); // "a100" -> x [ a�� ������ ǥ���Ұ��� ]
			// Integer.parseInt( ���ڿ� ); ���ڿ� -> ����
		// ���� �߻� ���� : ���ڿ��� ���������� ��ȯ�� ���������� ���ڿ��� �������� ��ȯ�� �Ұ���
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 +"="+result);
	}catch( NumberFormatException e) {
		System.out.println(" ���� �߻� :" + e);
	}
	
	// p.428
	try {
	String ���ڿ� = "���缮";	// �ڹ� Ŭ������ �ϳ� [ ������ Object ��� ]
	Object ���۰�ü; 			// �ڹ� Ŭ������ �ֻ��� Ŭ����
	
	���۰�ü = ���ڿ�; 			// �ڽ� --> �θ� [ ���� ]
	���ڿ� = (String)���۰�ü;	// �θ� --> �ڽ� [ �Ұ��� ]
		// ��������ȯ
	
	// ����ó�� �Ǵ� 
		// �����(����� ����) ���õ� �ڵ� [ ������ ����ó�� ]
	}catch( Exception e ) {
		System.out.println(" ���� �߻� : " + e);
	}
		
		
		
		
		
		
		
		
		
		
	} // m e
} // c e
