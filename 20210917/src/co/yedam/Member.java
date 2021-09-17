package co.yedam;

public class Member { // 여기선 main메소드 없음
	//필드생성=정보저장
	int memberId; //회원번호
	String name; //회원이름
	String phone; //회원전화번호
	
	//이 세개의 정보를 하나의 변수에 넣을 수 있게끔 함
	
	//메소드생성=기능
public void showInfo() {  //메인메소드가 없는 경우엔 메소드생성시 static안써도됨
	System.out.println("아이디:"+memberId+",이름:"+name+",연락처:"+phone);
		
	}
}
