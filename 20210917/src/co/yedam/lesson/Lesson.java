package co.yedam.lesson;

/*
 * 프로그램=실행클래스(메인클래스:여기선LessonExample)1개
 *        +참고하는클래스여러개(=라이브러리,객체들)
 * 현재 객체구성(학생 정보,선생님 정보,반 정보)이렇게 3개를 만들었음
 * '선생님','학생','반' 이라는 각각의 객체를 각각 클래스로 만들었음
 * 김소영,이바다 와 같은 각각의 실체를 'new 학생()' : 인스턴스로 생성(실체만들기)해서 공간만들어줌.
 * =>클래스 만으로 값을 저장할 수 없으니 클래스 생성후에 실체를 꼭 만들어 줘야함! 즉, 생성자를 꼭 만들어줘야함
 * 학생(객체) -> 학생(클래스)
 * 김소영(실체) -> new 학생() : 인스턴스
 */
public class Lesson {
	private Teacher teacher;
	private String group; // 선생님이 몇학년몇반 담임인지. 3-1이런형식으로넣기
	private Student[] students;

	public Lesson() { // 생성자만들기
		students = new Student[3]; // 크기만 지정. 학생수 3명 들어갈 수 있음
	}

	public void setTeacher(Teacher teacher) { // 값을 가져옴
		this.teacher = teacher;
	}

	public void setGroup(String group) { // 값을 가져옴
		this.group = group;
	}

	public void addStudent(Student student) { // 값을 가져옴
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
				System.out.println("이름:" + students[i].getStudentName() 
						+ "연락처:" + students[i].getStudentPhone() 
						+ "주소:" + students[i].getStudentAddress());
			}

		}
	}
}
