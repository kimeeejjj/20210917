package kyobo;

import java.util.Scanner;

public class KyoboMain {
	public static Scanner scn = new Scanner(System.in);
	public static Kyobo[] books = new Kyobo[100];
	public static void main(String[] args) {

		while (true) {
			System.out.println("--------------------");
			System.out.println("1.도서등록|2.도서조회|3.도서수정|4.도서목록|5.도서삭제|6.종료");
			System.out.println("--------------------");
			System.out.println("메뉴를 선택하세요>>");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				creatBook();
				continue;
			} else if (menu == 2) {
				cheakBook();
				continue;
			} else if (menu == 3) {
				fixBook();
				continue;
			} else if (menu == 4) {

			} else if (menu == 5) {
				
			} else if (menu == 6) {
				System.out.println("종료합니다. 이용해 주셔서 감사합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}

		}
	}
	//책이름,지은이,출판사,가격,발행년도
	public static void creatBook() {
		System.out.println("==도서등록 메뉴입니다==");
		String name = readStr("도서명:");
		String owner = readStr("지은이:");
		String company = readStr("출판사:");
		int price = readInt("가격:");
		int year = readInt("출판년도:");
		
		Kyobo kyobo = new Kyobo
				(name,owner,company,price,year);
		for(int i=0;i<books.length;i++) {
			if(books[i]==null) {
				books[i] = kyobo;
				break;
			}
		}
		System.out.println("도서등록이 완료되었습니다.");
	}
	
	public static void cheakBook() {
		System.out.println("==도서조회 메뉴입니다==");
		String name=readStr("조회하실 도서명을 입력하세요.");
		for(int i=0;i<books.length;i++) {
			if(books[i]!=null && books[i].getName().equals(name)) {
				System.out.println(books[i].showInfo());
				break;
			}
		}
	}

	public static void fixBook() {
		System.out.println("==도서수정 메뉴입니다==");
		String name=readStr("수정하실 도서명을 입력하세요");
		for(int i=0;i<books.length;i++){
			if(books[i].getName().equals(name)) {
				
			}
		}
		
	}
	
	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}
	
	public static int readInt(String msg) {
		System.out.println(msg);
		return scn.nextInt();
	}
}
