package co.yedam.lesson;

/*
 * ���α׷�=����Ŭ����(����Ŭ����:���⼱LessonExample)1��
 *        +�����ϴ�Ŭ����������(=���̺귯��,��ü��)
 * ���� ��ü����(�л� ����,������ ����,�� ����)�̷��� 3���� �������
 * '������','�л�','��' �̶�� ������ ��ü�� ���� Ŭ������ �������
 * ��ҿ�,�̹ٴ� �� ���� ������ ��ü�� 'new �л�()' : �ν��Ͻ��� ����(��ü�����)�ؼ� �����������.
 * =>Ŭ���� ������ ���� ������ �� ������ Ŭ���� �����Ŀ� ��ü�� �� ����� �����! ��, �����ڸ� �� ����������
 * �л�(��ü) -> �л�(Ŭ����)
 * ��ҿ�(��ü) -> new �л�() : �ν��Ͻ�
 */
public class Lesson {
	private Teacher teacher;
	private String group; // �������� ���г��� ��������. 3-1�̷��������γֱ�
	private Student[] students;

	public Lesson() { // �����ڸ����
		students = new Student[3]; // ũ�⸸ ����. �л��� 3�� �� �� ����
	}

	public void setTeacher(Teacher teacher) { // ���� ������
		this.teacher = teacher;
	}

	public void setGroup(String group) { // ���� ������
		this.group = group;
	}

	public void addStudent(Student student) { // ���� ������
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public String getGroup() {
		return this.group;
	}

	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("�̸�:" + students[i].getStudentName() 
						+ "����ó:" + students[i].getStudentPhone() 
						+ "�ּ�:" + students[i].getStudentAddress());
			}

		}
	}
}
