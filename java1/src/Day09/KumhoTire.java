package Day09;

public class KumhoTire extends Tire {
			// ����Ŭ���� extends ����Ŭ����
	// 1. �ʵ�
	// 2. ������
	public KumhoTire( String location , int maxRotation ) {
		super( location, maxRotation);
		// ����Ŭ������ ������ [ �ڵ� ���̱� ]
	}
	
	// 3. �޼ҵ�
	@Override // ����Ŭ������ �޼ҵ带 ������[����]
	public boolean roll() {
	
	
		accumulatedRotation++;
		if( accumulatedRotation < maxRotaion ) {
			System.out.println(location+" ��ȣŸ�̾� ���� : " + ( maxRotaion - accumulatedRotation));
			return true;
		}else {
			System.out.println("*** " + location+" ��ȣŸ�̾� ��ũ ***");
			return false;
		}
	}
}
