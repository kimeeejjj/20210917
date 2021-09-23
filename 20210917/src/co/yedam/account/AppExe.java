package co.yedam.account;

public class AppExe {
	public static void main(String[] args) {
		AppMain main= AppMain.getInstance(); //인스턴스 생성.
		main.execute();
		
//		AppMain main2= AppMain.getInstance(); //새로운 인스턴스 생성.
		
//		if(main == main2) { //메모리의 주소값 == 메모리의 주소값
//			System.out.println("같은값");
//		} else {
//			System.out.println("다른값"); //정답은 다른값
//		}
		
		
}
}
