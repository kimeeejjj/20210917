package co.yedam.inherit;
/*
 * PeopleŬ������ ��ӹ޴� Student
 */
public class Student extends People {
	private int studentNo;
	
	Student(String name, String ssn){
		super(name,ssn);
	}
	
	Student(String name, String ssn, int studentNo){
		super(name,ssn);
		this.studentNo=studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}

	//�޼ҵ� ������ Override
	@Override
	public void showInfo() {
		System.out.println("Name:"+super.getName()
		+",SSN:"+this.getSsn()
		+",SNO:"+this.getStudentNo());
	}

	//Student -> People -> Object ���Ŭ������ObjectŬ��������ӹ���(�⺻������)
	@Override
	public String toString() {
		return "�л�[�̸� "+this.getName()
		+"�ֹι�ȣ "+this.getSsn()
		+"�й� "+this.getStudentNo()+"]";
	}
	
	
	
}
