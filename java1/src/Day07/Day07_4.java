package Day07;

public class Day07_4 {
	
	// p.229 : 외부호출
	public static void main(String[] args) {
		
		// 1. ***** 객체 선언 *****
		Car2 myCar = new Car2();
		// 2. 자동차 시동 걸기
		myCar.keyTurnOn(); // 인수x 반환x
		// 3. 자동차 전진
		myCar.run(); // 인수x 반환x// 4.
		int speed = myCar.getSpeed(); // 인수x 반환o
		System.out.println("현재 속도 : "+speed+ "km/h");
		
	}

}
