package Day08;

public class Day08_1 { // c s

	public static void main(String[] args) { // m s
		
		// p.238 : static
			// ��������
			// �������� ������ = ���α׷� ���������� ���
		
		// *. Ŭ������ �ʵ� , �޼ҵ�(���) ���ٹ��
			//(static ����� �ƴҶ�)  1. ��ü ���� -> ��ü.���
				// ��ü�� �����ɶ� new �����ڷ� ��ü( �� �������) �޸� �Ҵ�
		Calculator calculator = new Calculator();
		System.out.println(" ��ü�� �̿��� ������� : " + calculator.pi);
			// (static ��� �϶� ) 1. Ŭ������.���
				// Ŭ���� �ε� �ǰ� �޼ҵ念���� static ������ �޸� �Ҵ�
		System.out.println(" ��ü���� ������� : " + calculator.pi );
		
		double result1 = 10 * 10 * calculator.pi;
									// Ŭ������.����������
		int result2 = calculator.puls(10, 5);
		int result3 = calculator.minus(10, 5);
		
		System.out.println(" result1 :" + result1);
		System.out.println(" result2 :" + result2);
		System.out.println(" result3 :" + result3);
	} // m e
} // c e
