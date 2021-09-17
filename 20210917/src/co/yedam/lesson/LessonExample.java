package co.yedam.lesson;

public class LessonExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("홍길동","국사");
		
		Student s1 = new Student("김소영","010-1111","대구중구");
		Student s2 = new Student("정혜윤","010-3333","대구동구");

		// 선생님-학생1,2,3,...
		
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3학년1반");
		l1.addStudent(s1);
		l1.addStudent(s2);
		
		Teacher t2 = l1.getTeacher(); //Teacher를 반환해줌
		System.out.println("선생님이름:"+t2.getName());
		System.out.println("선생님과목:"+l1.getTeacher().getMajor());
		
		l1.showStudents();
		
		
	}
}
