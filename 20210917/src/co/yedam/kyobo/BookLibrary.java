package co.yedam.kyobo;

import java.util.Scanner;

/*
 * 1.도서등록 2.도서정보수정 3.도서목록 4.도서조회 5.도서삭제 9.종료
 * 도서정보:도서제목,저자,출판사,가격 -> 클래스생성:Book
 * 
 */
public class BookLibrary { // start of class
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) { // start of main
		Book[] kyoboLib = new Book[100]; // kyoboLib라는 배열변수의 크기를 100개로 지정.
		kyoboLib[0] = new Book("혼자공부하는 자바", "신용권", "한빛출판사", 25000);
		kyoboLib[1] = new Book("이것이 자바다", "신용권", "한빛출판사", 20000);
		kyoboLib[2] = new Book("혼자공부하는 도둑질", "홍길동", "우리출판사", 35000);

		while (true) {
			System.out.println("1.도서등록 2.도서정보수정 3.도서목록 4.도서조회 5.도서삭제 9.종료");
			int menu = readInt("메뉴를 선택하세요>>");
			if (menu == 1) {
				System.out.println("도서등록메뉴입니다.");
				// 도서등록: 제목,저자,출판사,가격.
				String title = readStr("책 제목을 입력하세요.");
				String auth = readStr("저자를 입력하세요.");
				String press = readStr("출판사를 입력하세요.");
				int price = readInt("가격을 입력하세요.");
				// 생성자를 호출 => book변수저장.
				Book book = new Book(title, auth, press, price);
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] == null) { // 배열의 비어있는 위치에 저장(?????설명확실하지않음)
						kyoboLib[i] = book;
						break; // 한개만 저장해야하니 저장하고 바로 빠져나오기
					}
				}
				System.out.println("저장완료.");
			} else if (menu == 2) {
				System.out.println("도서수정메뉴입니다.");
				//도서명으로 찾아와서 => 정확한 도서명으로 수정할 도서 찾기
				//저자,출판사,가격 => 수정가능
				//수정필요없는부분은 엔터치고 넘기는게 가능하게끔. 수정할 부분만 내용입력해도 되도록
				String search = readStr("수정할 도서명을 입력하세요.");
				String author = readStr("변경할 저자를 입력하세요.[원치않을 경우, Enter를 입력하세요]"); //**엔터값은 null값과 같은 게 아님**
				String press = readStr("변경할 출판사를 입력하세요.[원치않을 경우, Enter를 입력하세요]"); //**엔터값은 아무것도 입력 안했지만 그래도 문자열로 취급함**
				String price = readStr("변경할 금액을 입력하세요.[원치않을 경우, Enter를 입력하세요]");
				boolean isExist = false;
				for(int i=0; i<kyoboLib.length;i++) {
					if(kyoboLib[i] !=null && kyoboLib[i].getTitle().equals(search)) { //한 건을 찾아오고
						if(!author.equals("")) { 
						kyoboLib[i].setAuthor(author); 
						}
						if(!press.equals("")) { 
							kyoboLib[i].setPress(press); 
						}
						if(!price.equals("")) { 
							kyoboLib[i].setPrice(Integer.parseInt(price)); 
						}
						isExist = true;
					}
				}
				if(isExist)
					System.out.println("정상적으로 수정되었습니다.");
				else
					System.out.println("존재하지 않는 책입니다.");
			} else if (menu == 3) {
				System.out.println("도서목록메뉴입니다.");
				for (Book book : kyoboLib) {
					if (book != null)
						book.showInfo();
				}
			
			} else if (menu == 4) {
				System.out.println("도서조회메뉴입니다.");
				String search = readStr("조회할 도서명을 입력하세요.");
				for (Book book : kyoboLib) {
					if (book != null && book.getTitle().indexOf(search) != -1) // indexOf(): 값입력해주면()안에문장을출력??
						book.showInfo(); // 자바 만 입력하면 자바가 들어간 책 제목 모두 출력해줌
				}
			
			} else if (menu == 5) {
				System.out.println("도서삭제메뉴입니다.");
				String search = readStr("삭제할 도서명을 입력하세요.");
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().indexOf(search) != -1) // indexOf():
																								// 값입력해주면()안에문장을출력??
						kyoboLib[i] = null;
				}
				System.out.println("삭제완료.");

			} else if (menu == 9) {
				System.out.println("종료합니다.");
				break;
			
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} // end of while
		System.out.println("끝");
	}// end of main

	public static String readStr(String msg) { // ()안에 사용자 입력값이 들어오면 return값 반환.
		System.out.println(msg);
		return scn.nextLine();
	}

	// 사용자 입력값을 반환(int)
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine(); //사용자가 입력한 값을 String타입의 변수 val로 받겠다. 사용자가 문자만 입력한 것은 아닐테지만,
			try {						//숫자를 입력해도 우선 문자로 저장됨 (ex)사용자가 1입력->"1"로 저장됨.	
				result = Integer.parseInt(val);// 사용자가 문자로 입력한 값은 문자로 나가겠지만, 숫자로 입력한 값은 문자로 저장되어있기 때문에
				break;							//Integer.parseInt()를 사용하여 정수로 바꿔줌. (ex)"1000"문자열값으로 저장된 숫자를 -> 1000실제 숫자값으로 바꿔줌
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
			}
		}
		return result;
	}
}
