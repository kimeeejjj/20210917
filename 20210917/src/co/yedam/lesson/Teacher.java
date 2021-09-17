package co.yedam.lesson;

/*
 * 이름,과목
 */
public class Teacher { 
	//필드
	private String name;
	private String major;
	
	//Teacher t1 = new Teacher(); => 공간만드는 걸 인스턴스생성이라고 함.
	public Teacher(String name, String major) {
	//생성자
		this.name = name;
		this.major = major;
	}
	//메소드 set은값을지정하는용도로, get은값을출력하는 용도로 만듦
	public void setName(String name) {
		this.name=name;
	} 
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getName() {
		return this.name; //this.name은 필드값
	}
	
	public String getMajor() {
		return this.major;
	}
}
