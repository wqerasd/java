package Day03;

public class Day03_1 { // c s
	
	public static void main(String[] args) { // m s
		
		// 1���� : ��� , �Է�
		// 2���� : ���� , ���(����)
		// ���
			// ��ǻ���� �Ǵܷ�~~ => ����Ǽ�
			// ���ǽ��� true �̸� ���๮ ó��
			// ����
				// 1. IF( ���ǽ� [true/false] ) ���๮;
				// 2. IF( ���ǽ� ) ���๮;
				// 	  ELSE ���๮[����];
				// 3. ���๮�� 2�� �̻�( ; 2�� �̻��̸� ) {  } ����ó�� 
				// 4. ����Ǽ� �ټ��϶� [ ������ �ټ��϶� ]
				//    IF( ����1 ) { ���๮[��1]; }
				//    ELSE IF( ����2 ) { ���๮[��2]; }
				//	  ELSE IF( ����3 ) { ���๮[��3]; }
				//	  ELSE IF( ����4 ) { ���๮[��4]; }
				//	  ELSE IF( ����5 ) { ���๮[��5]; }
				//	  ELSE { ���๮[����]; }
				// 5. if ��ø
				//		IF( ���ǽ� ) {
				//			IF( ���ǽ� ){ ���๮; }
				//			ELSE { ���๮; }
				//		}ELSE{		
				//			IF( ���ǽ� ){ ���๮; }
				//			ELSE { ���๮; }
				//		}
				
		
		// ����1
		if( 3>1 ) System.out.println("��) 3�� 1���� ũ��. ");
			// ���࿡ 3�� 1���� ũ�� ���o �ƴϸ� ���x
			// true�̸� ����
		
		//����2 
		if( 3>5 ) System.out.println("��2) 3�� 5���� ũ�� ");
			// ���࿡ 3�� 5���� ũ�� ���o �ƴϸ� ���x
		
		//����3
		if( 3>1 ) System.out.println("��3) 3�� 1���� ũ��.");
		else System.out.println("��3) 3�� 1���� �۴�. ");
		 	// ���࿡ 3�� 1���� ũ�� ��3_1 ���
			// �ƴϸ� ( 3�� 1���� ������ ) ��3_2 ���
		
		//����4
		if( 3>2 ) { // true ���๮ ���� [ ���๮(;) 2�� �̻��϶� ]
			System.out.println("true"); 
			System.out.println("3�� 2���� ũ��");
		} // true ���๮ ��
		else { // false ���๮ ����
			System.out.println("false");
			System.out.println("3�� 2���� �۴�.");
		} //false ���๮ ��
		
		//����5
		if( 3>5 ) System.out.println(" ��5) 3�� 5���� ũ��");
		else if( 3>4 ) System.out.println(" ��5) 3�� 4���� ũ��.");
		else if( 3>3 ) System.out.println(" ��5) 3�� 3���� ũ��.");
		else if( 3>2 ) System.out.println(" ��5) 3�� 2���� ũ��.");
		else System.out.println(" true ����. ");
		
		if( 3>5 ) System.out.println(" ��5) 3�� 5���� ũ��");
		if( 3>4 ) System.out.println(" ��5) 3�� 4���� ũ��.");
		if( 3>3 ) System.out.println(" ��5) 3�� 3���� ũ��.");
		if( 3>2 ) System.out.println(" ��5) 3�� 2���� ũ��.");
		else System.out.println(" true ����. ");
		
		
	
	} // m e
	

} // c e
