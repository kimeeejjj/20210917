package co.yedam.enumerate;

public class PersonExample {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="홍길동";
		p1.gender=Gender.MAN; //열겨형타입이 선언된 값만 가능
		p1.address="대구시";
	
		Person p2 = new Person();
		p2.name="김하늘";
		p2.gender=Gender.WOMAN; //열겨형타입이 선언된 값만 가능
		p2.setGender(Gender.WOMAN);
		p2.address="서울시";
		
		Person[] persons = {p1,p2};
		for(Person person : persons) {
			if(person.gender == Gender.WOMAN) {  //참조타입은 equals로, 열거형타입은 ==로 비교가능
				System.out.println("이름:"+person.name);
			}
		}
		
		//열거형 메소드
		Week today = Week.FRIDAY; //열거형 데이터타입.변수 = Week라는 타입에 Friday값이 들어가겠다
		Week[] weeks = Week.values(); //values() 해당타입에 담긴 값 전체를 출력해줌
		for(Week week : weeks) {
			System.out.println(week.name());
		}
		
	}
}
