package Day07;

public class Car {
	// Ŭ��������
	
	// 1. �ʵ�
	int gas; // ��������
	
	// 2. ������
		// ������ ������ �⺻������ 
	
	// 3. �޼ҵ�
		// 1. gas�� �ܺηκ��� �޾Ƽ� ���ο� �����ϴ� �޼ҵ� ����
	void setGas(int gas) { // �μ�o ��ȯx
// ����x �޼ҵ��( �μ�1) { ���κ��� = �ܺκ��� }
		this.gas = gas;
// ���κ����� �ܺκ����� �̸��� �����Ҷ� �����ϴ� ���
		//this.�ʵ�� : ����(�� Ŭ��������) ����
	}
	// 2. ���κ��� gas�� ������ Ȯ�� [0=��������][1�̻�=�����ִ� true=]
	boolean isLeftGas() {
// 	����ȯ	�޼ҵ��() 
		if( gas == 0 )
		{
			System.out.println(" gas�� �����ϴ�. ");
			return false;
		}
		else {
			System.out.println(" gas�� �ֽ��ϴ�.");
			return true;  //���κ����� gas�� 0�̾ƴԤ� true ��ȯ
		}
	}
	// 3. gas�� 0�϶� ���� �����ϴµ� �����Ҷ� ���� ���� 1������
	// gas 0 �̸� �Լ� ����
	void run() { // �μ�x ��ȯx
		
		while(true) {
			if( gas > 0 ) {
				System.out.println("�޸��ϴ�:(gas�ܷ� : "+gas+")");
				gas--; // gas���� 1������
			}else {
				System.out.println("����ϴ�. (gas�ܷ� : "+gas+")");
				return;
				
			}
		}
	}
	
	
}
