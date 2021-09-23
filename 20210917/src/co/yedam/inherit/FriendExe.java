package co.yedam.inherit;

import co.yedam.ScanUtil;

public class FriendExe {
	
	private static FriendExe singleton = new FriendExe(); //필드
	private Friend[] friends; //필드
	
	private FriendExe() {//싱글톤 위해 생성자를 private으로
		//친구,학교친구,회사친구=>배열에 저장.
		//CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100]; //Friend클래스상속받는자식클래스도이배열사용가능		
		friends[0]=new UnivFriend("김은지","01083701707","국문학");
		friends[5]=new UnivFriend("김은지","01017078370","국문학");
		friends[1]=new CompFriend("김은혜","01073547359","영업부");
		friends[2]=new Friend("김조선","01084701707");
		friends[3]=new UnivFriend("김인숙","01039994088","수학과");
		friends[4]=new CompFriend("김재기","01077708007","영업부");
	} 
	
	public static FriendExe getInstance() {
		return singleton;
	}
	
	
	public void execute() {
		while(true) {
		System.out.println("----------------------");
		System.out.println("1.친구등록 2.조회 3.수정 4.삭제 5.종료");
		System.out.println("----------------------");
		int menu=ScanUtil.readInt("메뉴를 선택하세요."); //static메소드이므로 new없이도 바로 호출가능
			if(menu==1) {
				System.out.println("친구등록");
				addFriend();
			}else if(menu==2) {
				System.out.println("친구조회");
				showList();
			}else if(menu==3) {
				System.out.println("친구수정");
				modify();
			}else if(menu==4) {
				System.out.println("친구삭제");
				delateFriend();
			}else if(menu==5) {
				System.out.println("종료합니다");
				break;
			}
		}
		System.out.println("끝");
	}
	private void addFriend() {
		//친구,학교친구,회사친구 무얼등록할지에 따라 요구되는 값 다름
		//각각 이름,연락처|+전공정보|+부서정보
		System.out.println("1.친구 2.학교친구 3.회사친구");
		int choice=ScanUtil.readInt("메뉴를 선택하세요>>");
		String name=ScanUtil.readStr("친구이름을 입력하세요");
		String phone=ScanUtil.readStr("연락처를 입력하세요");
		Friend friend =null;
		if(choice==1) {
			friend = new Friend(name,phone);
		}else if(choice==2) {
			String major=ScanUtil.readStr("전공정보를 입력하세요");
			friend = new UnivFriend(name,phone,major);
		}else if(choice==3) {
			String depart=ScanUtil.readStr("부서정보를 입력하세요");
			friend = new CompFriend(name,phone,depart);
		}

		for(int i=0;i<friends.length;i++) {
			if(friends[i] ==null) {
				friends[i]=friend;
				break;
			}
		}
		System.out.println("성공적으로 등록되었습니다");
		
	}
	
	private void showList() {
		//이름,연락처 입력 => 홍길동,김길동->길동.
		//1111-1211, 2222-1211 -> 1211.
		//길동,1211 -> 이름&연락처
		String name = ScanUtil.readStr("조회할 이름을 입력하세요[모를경우 Enter]");
		String phone = ScanUtil.readStr("조회할 연락처를 입력하세요[모를경우 Enter]");
		for(Friend friend : friends) {
			if(name !=null && phone ==null) { //!name.equals("") -> 이름에 값이 ""가 아닙니까? 즉, 값이 있습니까? 
				if(friend !=null && friend.getName().indexOf(name) != -1) {
					System.out.println(friend.toString());
					continue;
				}	
			}else if(name ==null && phone !=null) { //!phone.equals("") -> 연락처 값이 ""가 아닙니까? 즉, 값이 있습니까?
				if(friend !=null && friend.getPhone().indexOf(phone) != -1) {
					System.out.println(friend.toString());
					continue;
				}
			}else if(name !=null && phone !=null) { //!name.equals("")&&!phone.equlas("") :이조건이젤먼저와야함
				if(friend != null && friend.getName().indexOf(name) != -1
						&& friend.getPhone().indexOf(phone) != -1) {
					System.out.println(friend.toString());
				}
			} else {  //이름,연락처 모두 값 없음
				System.out.println(friend.toString());
			}
			
		} //end of for
	}
		
//		for(int i=0;i<friends.length;i++) {		86~104 내가만든코드, 여기서부턴 교수님코드
//			if(friends[i] !=null) {
//				if(!name.equals("") && !phone.equals("")) {
//					if(friends[i].getName().indexOf(name) != -1
//						&& friends[i].getPhone().indexOf(phone) != -1)
//						System.out.println(friends[i].toString());
//				}else if(!phone.equals("")) {
//					if(friends[i].getPhone().indexOf(phone) != -1)
//						System.out.println(friends[i].toString());
//				}else if(!name.equals(""))	{
//					if(friends[i].getName().indexOf(name) != -1)
//						System.out.println(friends[i].toString());
//				}else {
//					System.out.println(friends[i].toString());
//				}		
//			}
//		}

	private void modify() {
		System.out.println("[친구목록]");
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null) {
			System.out.println("["+i+"] "+friends[i].toString());
			}
		}
		int num = ScanUtil.readInt("수정할 친구를 선택하세요");
		String phone=ScanUtil.readStr("수정할 연락처를 입력하세요[원치않을경우, Enter]");
		if(!phone.equals("")) {
			friends[num].setPhone(phone);			
		}
		if(friends[num] instanceof UnivFriend) {
			String major=ScanUtil.readStr("수정할 전공을 입력하세요[원치않을경우, Enter]");
			if(!major.equals("")) {
			((UnivFriend)friends[num]).setMajor(major);
			}
		}else if(friends[num] instanceof CompFriend) {
			String depart=ScanUtil.readStr("수정할 부서를 입력하세요[원치않을경우, Enter]");
			if(!depart.equals("")) {
			((CompFriend)friends[num]).setDepart(depart);
			}
		}
		System.out.println("수정이 완료되었습니다");
	}
	
	private void delateFriend() {
		System.out.println("[친구목록]");
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null) {
			System.out.println("["+i+"] "+friends[i].toString());
			}
		}
		String num = ScanUtil.readStr("삭제할 친구를 선택하세요");
		if(!num.equals("")) {
		if(friends[Integer.parseInt(num)] != null) {
			friends[Integer.parseInt(num)] = null;
			System.out.println("삭제가 완료되었습니다");
		} else if(friends[Integer.parseInt(num)] == null) {
			System.out.println("삭제할 값이 없습니다");
		}
	}
  }
}
