package co.yedam.kyobo;
//��������:��������,����,���ǻ�,����
public class Book {
	//�ʵ����-��ü�� ���� ������, ����
	private String title;
	private String author;
	private String press;
	private int price;
	
	//�����ڸ����
	public Book(String title, String author, String press, int price) {
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
	}
	
	//�޼ҵ����(set, get)
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
	
	//�Է°��� ���� �� �����ִ� �޼ҵ� ����
	public void showInfo() {
		System.out.printf("[å����:%s,����:%s,���ǻ�:%s,����:%d]\n"
							,title,author,press,price);
	}
	
}
