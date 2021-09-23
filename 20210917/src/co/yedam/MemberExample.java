package co.yedam;

public class MemberExample {
	public static void main(String[] args) {
//		Member m1 = null; 널 값을 담아두면 m1에 할당된 공간없으므로 이후에 값을 담을 수 없음
		Member m1 = new Member(); //그러므로 꼭 new를 써서 변수에게 할당될 공간을 만들기
		m1.memberId = 10;
		m1.name = "박미림";
		m1.phone = "010-1111-2222";
				
		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "홍길동";
		m2.phone = "010-3333-4444";
		
		Member[] members = {m1,m2};
		for(Member m : members) {
			System.out.println("아이디:"+ m.memberId);
			System.out.println("이름:"+m.name);
			System.out.println("연락처:"+m.phone);
		}
		
		System.out.println("=====값 바꿔보기=====");
//		m1 ==> members[0]
		m1.name = "김미림"; //이렇게 값 바꿀 수 있음
		members[0].phone = "010-5555-6666"; //마찬가지
		for(Member m : members) { // 배열members의 크기만큼 Member타입 m을 하나씩 증가시키면서 반복하겠다. => for(타입 변수이름하나만들기 : 배열의크기) 이런형식!
			System.out.println("아이디:"+ m.memberId);
			System.out.println("이름:"+m.name);
			System.out.println("연락처:"+m.phone);
			
		System.out.println("=====값을 한번에 나오도록, 가로로 나열=====");
		
		for (Member mm : members) {
			mm.showInfo();
		}
		
		Student s1 = new Student();
		s1.name="Hong";
		s1.score=90;
	}
  }
}