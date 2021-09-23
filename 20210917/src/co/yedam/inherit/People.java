package co.yedam.inherit;
/*
 * 상속:부모->자식.
 */
public class People extends Object {
	//필드
	private String name;
	private String ssn;
	//생성자2개
	public People() {
		
	}
	public People(String name,String ssc) {
		this.name=name;
		this.ssn=ssn;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public void showInfo() {
		System.out.println("이름은"+name+",주민번호는"+ssn);
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}
	
	
}
