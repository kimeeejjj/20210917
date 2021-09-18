package co.yedam.kyobo;
//도서정보:도서제목,저자,출판사,가격
public class Book {
	//필드생성-객체의 고유 데이터, 상태
	private String title;
	private String author;
	private String press;
	private int price;
	
	//생성자만들기
	public Book(String title, String author, String press, int price) {
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
	}
	
	//메소드생성(set, get)
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getPress() {
		return press;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	//입력값을 전부 다 보여주는 메소드 생성
	public void showInfo() {
		System.out.printf("[책제목:%s,저자:%s,출판사:%s,가격:%d]\n"
							,title,author,press,price);
	}
	
}
