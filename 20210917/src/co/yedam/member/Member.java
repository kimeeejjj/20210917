package co.yedam.member;

public class Member {  //public 오픈되어있다-->Member클래스 외에 다른 클래서에서 참조가능
	//user1(아이디), 홍길동(이름), 대구중구신당동(주소)
	private String memberId;  //private 비밀-->다른클래스에서 참조 불가
	private String name;
	private String address;

	// 생성자: 필드에 값을 초기화시킴. 클래스 이름과 동일하게 만들어야 함.
	// 리턴값이 없음 void도 없고 return도 없음
	public Member() {
//		memberId="user1";
//		name = "박지원";
//		address ="대구중구 내일동";
	}
	
	public Member(String mId) {
		memberId = mId;
	}
	
	public Member(String mId, String n, String a){
		memberId=mId;
		name = n;
		address = a;
	}
	
	//메소드
	public void setMemberId(String mId) {
		memberId = mId;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAddress(String ad) {
		address = ad;
	}
	
	public String getMemberId() {
		return memberId; //반환해주는 필드 : 아이디
	}
	
	public String getName() {
		return name; //반환해주는 필드 : 이름
	}
	
	public String getAddress() {
		return address;  //반환해주는 필드 : 주소
	}
	
	public void showInfo() { //메소드는 클래스 안에 포함되어있어야 함
	System.out.println("아이디:"+memberId+",이름:"+name+",주소:"+address);
	}

	public void showMemberId() {
	System.out.println("아이디:"+memberId);
	}

	public void showName() {
	System.out.println("이름:"+name);
	}

	public void showaddress() {
	System.out.println("주소:"+address);
	}

}