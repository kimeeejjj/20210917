package co.yedam.lesson;

/*
 * �л��̸�, ����ó, �л��ּ�
 */
public class Student { 
	//�ʵ�
	private String studentName;
	private String studentPhone;
	private String studentAddress;
	
	public Student(String name, String phone,String address) {
		this.studentName = name;
		this.studentPhone = phone;
		this.studentAddress = address;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	public void setStudentPhone(String phone) {
		this.studentPhone = phone;
	}
	public void setStudentAddress(String address) {
		this.studentAddress = address;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	public String getStudentPhone() {
		return this.studentPhone;
	}
	public String getStudentAddress() {
		return this.studentAddress;
	}
	
}	

