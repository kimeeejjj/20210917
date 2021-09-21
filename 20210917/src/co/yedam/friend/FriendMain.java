package co.yedam.friend;

import java.util.Scanner;

/*
 *  친구 목록 관리
 *  이름,연락처,e-mail,키,몸무게.
 *  1.등록, 2.조회(이름), 3.목록, 4.수정, 5.삭제, 9.종료
 */
public class FriendMain {// start of class
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) { // start of main
		Friend[] friends = new Friend[10];

		while (true) {
			System.out.println("1.친구등록 2.친구조회 3.친구목록 4.친구수정 5.친구삭제 9.종료");
			int menu = readInt("메뉴를 선택하세요>>");
			if (menu == 1) {
				System.out.println("친구등록메뉴입니다.");
				String name = readStr("친구의 이름을 입력하세요.");
				String phone = readStr("친구의 연락처를 입력하세요.");
				String email = readStr("친구의 이메일을 입력하세요.");
				double high = readDouble("친구의   키를 입력하세요.");
				double weight = readDouble("친구의 몸무게를 입력하세요");

				Friend friend = new Friend(name, phone, email, high, weight);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
				System.out.println("저장이 완료되었습니다.");

			} else if (menu == 2) {
				System.out.println("친구조회메뉴입니다.");
				String search = readStr("조회할 친구이름을 입력하세요.");
				for (Friend friend : friends) {
					if (friend != null && friend.getName().indexOf(search) != -1)
						friend.showInfo();
				}
			
			} else if (menu == 3) {
				System.out.println("친구목록메뉴입니다.");
				for(Friend friend : friends) {
					if(friend !=null)
						friend.showInfo();
				}
			
			} else if (menu == 4) {
				System.out.println("친구수정메뉴입니다.");
				String search = readStr("수정할 친구이름을 입력하세요.");
				String phone = readStr("수정할 연락처를 입력하세요.[원치않을 경우,Enter]");
				String email = readStr("수정할 이메일을 입력하세요.[원치않을 경우,Enter]");
				String high = readStr("수정할 신장을 입력하세요.[원치않을 경우,Enter]");
				String weight = readStr("수정할 몸무게를 입력하세요.[원치않을 경우,Enter]");
				boolean isExist = false;
				for(int i=0; i<friends.length;i++) {
					if(friends[i] !=null && friends[i].getName().equals(search)) {
						if(!phone.equals("")) {
						friends[i].setPhone(phone);
						}
						if(!email.equals("")) {
						friends[i].setEmail(email);
						}
						if(!high.equals("")) {
						friends[i].setHigh(Double.parseDouble(high));
						}
						if(!weight.equals("")) {
						friends[i].setHigh(Double.parseDouble(weight));
						}
						isExist=true;
						
					}
				}
				if(isExist)
					System.out.println("정상적으로 수정되었습니다.");
				else
					System.out.println("존재하지 않는 친구입니다.");
			
			} else if (menu == 5) {
				System.out.println("친구삭제메뉴입니다.");
				String search = readStr("삭제할 친구이름을 입력하세요.");
				for(int i=0; i<friends.length;i++) {
					if(friends[i]!=null&&friends[i].getName().indexOf(search)!=-1)
					friends[i]=null;
				}
				System.out.println("삭제완료.");
				
			
			} else if (menu == 9) {
				System.out.println("종료합니다.");
				break;
			
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		System.out.println("-끝-");
	} // end of main

	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	public static double readDouble(String msg) {
		System.out.println(msg);
		double result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Double.parseDouble(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
			}
		}
		return result;
	}

	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
			}
		}
		return result;
	}

}
