package co.yedam.lesson;

public class LessonExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("ȫ�浿","����");
		
		Student s1 = new Student("��ҿ�","010-1111","�뱸�߱�");
		Student s2 = new Student("������","010-3333","�뱸����");

		// ������-�л�1,2,3,...
		
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3�г�1��");
		l1.addStudent(s1);
		l1.addStudent(s2);
		
		Teacher t2 = l1.getTeacher(); //Teacher�� ��ȯ����
		System.out.println("�������̸�:"+t2.getName());
		System.out.println("�����԰���:"+l1.getTeacher().getMajor());
		
		l1.showStudents();
		
		
	}
}
