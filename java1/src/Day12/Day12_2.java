package Day12;

public class Day12_2 {

	public static void main(String[] args) {
		
		// String �޼ҵ�
		// p.499 charAt() : ���ڿ����� Ư������ ����
		String ssn = "010624-1230123"; // �ֹε�Ϲ�ȣ
		char sex = ssn.charAt(7); // 7�� �ε����� ���ڸ� ����
		
		switch( sex ) { // swtich ��� [ switch(�˻���) ]
		case '1' : // sex ������ ���� ���� 1�̸�
		case '3' : System.out.println("����"); break;// sex ������ ���� ���� 2�̸�
		case '2' : // sex ������ ���� ���� 3�̸�
		case '4' : System.out.println("����"); break;// sex ������ ���� ���� 4�̸�
		}
		
		// �ڹ� �޸� [ JVM ]
			// ���� �޸�	 : ���������� ������
			// �� �޸�	 : ��ü�� ������
			// �޼ҵ� �޸� :
		
		
		
		// p.501 equals() : ���ڿ� ��
			// �⺻�ڷ��� ����ϴ� ������ ������ ��밡�� [ == ]
			// String Ŭ������ ����ϴ� ��ü�� == ������ ���Ұ��� [ equals ����Ұ� ]
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö"; // ��ü�� new �����ڰ� �ʼ������� String Ŭ������ �ڵ����� ��ü�� ������
		// 2. ���ڿ� ��
		if( strVar1 == strVar2 ) { // ���ڿ� == �Ұ��� [ == �޸��ּ� �� ]
			System.out.println(" ���� String ��ü�� ����");
		}else {
			System.out.println(" �ٸ� String ��ü�� ���� ");
		}
		// 3.
		if( strVar1.equals(strVar2) ) { // [ equlas �� ���빰 �� ]
			System.out.println(" ���� ���ڿ��� ���� ");
		}else {
			System.out.println(" �ٸ� ���ڿ��� ����");
		}
		
		// p.502 getBytes() : ���ڿ��� ����Ʈ���� ��ȯ
		String str = "�ȳ��ϼ���";
		// ���ڿ� -> ����Ʈ�� ��ȯ
		byte[] bytes1 = str.getBytes(); // ���ڿ����� ����Ʈ���� ��ȯ
		System.out.println(bytes1.length); // �迭��.length : �迭����
		// ����Ʈ�� -> ���ڿ� ��ȯ
		String str1 = new String( bytes1 );
		System.out.println(" ����Ʈ��-> ���ڿ� :" +str1);
		

			// 1. ���ڵ�Ÿ�� [ ���ڵ�/���ڵ� : ��ȯ ��� ]
			// 1. EUC-KR [ �ѱ�/���� : �ѱ� 2����Ʈ ]
		try {
			byte[] bytes2 = str.getBytes(" EUC-KR " ); // �Ϲݿ��� �߻�
			System.out.println(" EUC-KR ���� : " + bytes2.length );
			String str2 = new String( bytes2 , "EUC-KR");
			System.out.println(" ����Ʈ�� -> ���ڿ� : " + str2);
		
		
		// 2. UTF-8 [ �������� : �ѱ� 3����Ʈ] �̰� ���°� ����
			byte[] bytes3 = str.getBytes(" UTF-8" ); // �Ϲݿ��� �߻�
			System.out.println(" EUC-KR ���� : " + bytes3.length );
			String str3 = new String( bytes3 , "UTF-8");
			System.out.println(" ����Ʈ�� -> ���ڿ� : " + str2);
		
		}
		catch(Exception e) {
			
		}
		
		// p.504 indexOf() : ���� ��ġ[�ε���] ã��
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location); // 3���ε������� ���α׷��� ã�� ����
		// ���ڿ��� Ư�����ڿ� ��ġ[�ε���] ã�� / ���࿡ ������ -1[����]
		if( subject.indexOf("�ڹ�") != -1 ) { // �ε����� 0�� ���� [ -1 �ε����� ���� ]
			System.out.println(" �ڹٿ� ���õ� å");
		}else 
			System.out.println(" �ڹٿ� ���� ���� å");
		
		// p.505 length() : ���ڿ� ����
		String ssn2 = "7306241230123";
		int length = ssn.length(); // ���ڿ��� ���� ���� [ ���� ���ϱ� ]
		if( length == 13 ) { // ���࿡ ���ڿ��� 13���ڸ�
			System.out.println(" �ֹι�ȣ �ڸ����� �½��ϴ�. ");
		}else {
			System.out.println(" �ֹι�ȣ �ڸ����� Ʋ���ϴ�. ");
		}

		// p.506 replace( "��������" , "���ο��" ) : ���ڿ� ��ġ[����]	
		String oldstr = " �ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ����API�� �����մϴ�. ";
		String newStr = oldstr.replace("�ڹ�", "JAVA");
							// ���ڿ�.replace(" �������� " , "���ο��" )
		System.out.println(" �������ڿ� : " + oldstr );
		System.out.println(" ���ο�ڿ� : " + newStr );
		
		// p.507 Substring() : �ε����������� �ڸ� vs split() : ���ڿ� �ڸ��� [ ���ڿ��������� �ڸ� ]
		String ssn3 = "880815-1234567";
		
		String firstNum = ssn3.substring(0,6);
		System.out.println(" Ȯ�� : " + firstNum );
		
		String seconNum = ssn3.substring(7); // �ε����� �Ѱ��� ������ �ε������� ������
		System.out.println(" Ȯ�� : " + seconNum);
		// split
			//"880815-1234567" "-" ���� �ڸ���� 2���� -> �迭��ȯ
			// [0] : 880815 [1] : 12341567
		System.out.println(" �պκ� : " + ssn3.split("-")[0] );
		System.out.println(" �޺κ� : " + ssn3.split("-")[1] );
		
		// p.508
			// �������ڿ�.toLowerCase() -> ���� [ �ҹ��ڷ� ��ȯ ]
			// �������ڿ�.toUpperCase() -> ���� [ �빮�ڷ� ��ȯ ]
		
		// p.509
			// ���ڿ�.trim() : �յ� ��������
			// * ���۸� : ���ڿ� ��������
		
		// p.510 valueOf() : �⺻Ÿ��[int , double ��] -> ���ڿ� ��ȯ
		String str2 = String.valueOf(10); // int�� 10 -> String 10���� ��ȯ
		String str3 = String.valueOf(10.5); // double�� 10.5 -> String 10.5�� ��ȯ
		String str4 = String.valueOf(true); // boolean�� true -> String true�� ��ȯ
		String str5 = 10+""; // int���� String������ ���� [�Ұ���]
		
		System.out.println( str2 + 10 ); // ���� + ���� = ����
		System.out.println( str3 + 10 );
		// if( str4 ) ���� : str5���� boolean ���� �ƴ� ������ true ����
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
