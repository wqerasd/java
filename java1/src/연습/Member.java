package 연습;

public class Member {

	// 1. 필드
	private String 이름;
	private int 국어점수;
	private int 영어점수;
	private int 수학점수;
	
	// 2. 생성자
	public Member() {}

	public Member(String 이름, int 국어점수, int 영어점수, int 수학점수) {
		this.이름 = 이름;
		this.국어점수 = 국어점수;
		this.영어점수 = 영어점수;
		this.수학점수 = 수학점수;
	}

	// 3. 메소드
	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public int get국어점수() {
		return 국어점수;
	}

	public void set국어점수(int 국어점수) {
		this.국어점수 = 국어점수;
	}

	public int get영어점수() {
		return 영어점수;
	}

	public void set영어점수(int 영어점수) {
		this.영어점수 = 영어점수;
	}

	public int get수학점수() {
		return 수학점수;
	}

	public void set수학점수(int 수학점수) {
		this.수학점수 = 수학점수;
	}
	
	

	
}
