package co.yedam;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = {1,2,3};
		String[] strAry = {"Hello","World"};
		int num = 10;
		
		Student s1 = new Student(); // name, score값을 저장할 수 있는 우리가 새로 만든 타입
		s1.name = "홍길동"; // s1에 저장된게 아니라 Student클래스에 name이라는 필드에 저장된 것
		s1.score = 80; // 마찬가지
		//s1변수에는 이름과 스코어를 동시에 할당가능. 타입이 서로 다른 값인데도 불구하고!
		
		Student s2 = new Student(); //이런형식으로 써줘야 새로운 타입을 만들 수 있음+물론같은이름의클래스필요
		s2.name = "김민수";
		s2.score = 90;
		
		System.out.println("s1학생이름:" + s1.name);
		System.out.println("s1학생점수:" + s1.score);
		
		Student s3 = new Student();
		s3.name = "최지우";
		s3.score = 85;
		
		Student[] students = {s1,s2,s3};
		System.out.println("배열첫번째 이름:"+students[0].name);
		System.out.println("배열첫번째 점수:"+students[0].score);
		
		System.out.println("배열세번째 이름:"+students[2].name);
		System.out.println("배열세번째 점수:"+students[2].score);
		
		s1.name="박길동";
		s1.score=70;
		
		for(int i=0;i<students.length;i++) {
			System.out.println("학생이름:"+students[i].name);
			System.out.println("학생점수:"+students[i].score);
		}
		}
	}

