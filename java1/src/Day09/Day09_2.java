package Day09;

public class Day09_2 { // c s
	
	public static void main(String[] args) { // m s
		
		// ��� 
					// �θ𿡰� �����޴°� 
					// ���� : �θ�---> �ڽ� ����  // ���α׷��� : �ڽ� ---> �θ� ���� 
					// extends : �����ϴ�[ ����ϴ� ] 
					// ���� : ���� ���� [ ���� �ִ� Ŭ������ �����ؼ� ���ο� Ŭ���� ���� ]
					// �θ�Ŭ������ 1�� ���� / �ڽ��� ������ ����
				
				// p.290 ~ 292 ����
				// 1. ����Ŭ������ ��ü ���� 
				DmbCellphone dmbCellPhone = new DmbCellphone("�ڹ���", "����", 10);
				
				// 2. ����Ŭ������ ������� ��ü�� ����Ŭ������ ���[�ʵ�]���� 
				System.out.println(" �� : " + dmbCellPhone.model );
				System.out.println(" ���� : " + dmbCellPhone.color );
				
				// 3. ����Ŭ������ ������� ��ü�� ���� �������
				System.out.println(" ä�� : " + dmbCellPhone.channel );
				
				// 4. ����Ŭ������ ������� ��ü�� ����Ŭ������ ���[�޼ҵ�]���� 
				dmbCellPhone.powerOn(); // ����Ŭ������ ����� �޼ҵ� [ ȣ�� ���� ]
				dmbCellPhone.bell();
				dmbCellPhone.sendVoice("��������");
				dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
				dmbCellPhone.sendVoice("��~~ �� �ݰ��ϴ�.");
				dmbCellPhone.hangUp();
				
				// 5. ����Ŭ������ ������� ��ü�� ���� ������� 
				dmbCellPhone.turnOnDmb();
				dmbCellPhone.changeChannelDmb(12);
				dmbCellPhone.turnOffDmb();
				
			
	} // m e
} // c e
