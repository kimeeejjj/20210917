package co.yedam.lesson;

/*
 * �̸�,����
 */
public class Teacher { 
	//�ʵ�
	private String name;
	private String major;
	
	//Teacher t1 = new Teacher(); => ��������� �� �ν��Ͻ������̶�� ��.
	public Teacher(String name, String major) {
	//������
		this.name = name;
		this.major = major;
	}
	//�޼ҵ� set�����������ϴ¿뵵��, get����������ϴ� �뵵�� ����
	public void setName(String name) {
		this.name=name;
	} 
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getName() {
		return this.name; //this.name�� �ʵ尪
	}
	
	public String getMajor() {
		return this.major;
	}
}
