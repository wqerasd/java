package Day11;

public class MysqlDao implements DateAccessObject{
	
	@Override
	public void select() {
		System.out.println(" MYSQL DB���� �˻� ");
	}
	@Override
	public void insert() {
		System.out.println(" MYSQL DB���� ���� ");
	}
	@Override
	public void update() {
		System.out.println(" MYSQL DB���� ���� ");
	}
	@Override
	public void delete() {
		System.out.println(" MYSQL DB���� ���� ");
	}
}
