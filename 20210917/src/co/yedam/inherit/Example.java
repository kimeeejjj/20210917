package co.yedam.inherit;

public class Example {
	public static void main(String[] args) {
		People p1=new People("Hong","20200101-1234567");
		System.out.println("이름:"+p1.getName());
		System.out.println("주민번호:"+p1.getSsn());
		p1.showInfo();
		System.out.println(p1.toString());
		
		Student s1=new Student("Park","20210101-1234567");
		System.out.println("이름:"+s1.getName());
		System.out.println("주민번호:"+s1.getSsn());
		s1.showInfo();
		System.out.println(s1.toString());
		
		Student s2=new Student("Choi","20210202-1234567",110);
		System.out.println("이름:"+s2.getName());
		System.out.println("주민번호:"+s2.getSsn());
		System.out.println("학생번호:"+s2.getStudentNo());
		s2.showInfo();
		
		People p2=new Student("Hwang","20210303-1234567",120); //부모클래스는 자식클래스 사용가능

//		p1 = new Student("Hwang","20210303-1234567",120);
		//앞에서 선언된 부모클래스 객체 p1도 다시 자식클래스 객체로 변경가능
		//부모타입 변수에는 자식클래스 할당 가능, 그러나 자식타입변수에 부모클래스 할당 불가

//		p2.getStudnetNo(); 부모클래스 변수에 자식클래스 메소드 호출 불가능

		if(p2 instanceof Student) {
		Student s3 = (Student)p2; //(Student)입력하여강제타입변환해서는 부모클래스변수를
		s3.getStudentNo();			//자식클래스변수에할당가능함
									//대신전제조건은 23번라인과 같이 부모클래스변수를 자식클래스로 할당해놔야만 가능
									//그리고 p2 instanceof Student 와 같이 p2가 Student클래스에 속해있냐는
							//확인을 한번 거친후에 실행하면 개발자의 실수를 줄여줄 수 있음.
		}
		if(p1 instanceof Student) {
			Student s4=(Student)p1;
			s4.getStudentNo();
		}else {
			System.out.println("형변환 할 수 없습니다.");
		}
	
	}
	
	
}
