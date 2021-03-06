package Day08;

public class Car {
	
	// 1. 필드
	private int speed;
	private boolean stop;
		
	
	// 2. 생성자
	
	// 3. 메소드
	public int getSpeed() {
		return speed;

	}
	public void setSpeed( int speed ) {
		if( speed < 0 ) {
			// 만약에 인수로 들어온 스피드가 0보다 작으면
			this.speed = 0; // 0아래로 저장 불가능하게 0 대입
			return;
		}else { // 0보다 크면
			this.speed = speed;  // 인수로 들어온 스피드 저장
		}
	}
	public boolean isStop() {
		return stop;
	}
	
	public void setStop( boolean stop ) { // private 필드 변경시 사용되는
		this.stop = stop;
		this.speed = 0;
	}
	
}