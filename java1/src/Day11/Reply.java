package Day11;

public class Reply {

	// 1. �ʵ�
	private String contents;
	private String password;
	private String writer;
	private String date;
	
	// 2. ������
	
		// 1. �������
	public Reply() {}
		// 2. Ǯ������

	public Reply(String contents, String password, String writer, String date) {
		this.contents = contents;
		this.password = password;
		this.writer = writer;
		this.date = date;
	}
		// 3. ��� ��Ͻ� ���Ǵ� ������

	public Reply(String contents, String password, String writer) {
		this.contents = contents;
		this.password = password;
		this.writer = writer;
	}
	
	// 3. �޼ҵ�
	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
			

	
	
	
	
	
}
