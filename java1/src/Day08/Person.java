package Day08;

public class Person {
	
	// static + final
	static final double pi = 3.14;
	// static : 프로그램 전반적으로 사용되는 변수
	
	// final : 프로그램 전반적으로 사용되는 변수
	static double pi2 = 3.14;
	// final : 객체내에서 사용되는 상수
	final double pui = 3.14;
	
	// 1. 필드
	String nation = "Korea";
	String ssn;
	String name;
	// 2. 생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	//3 . 메소드

}
