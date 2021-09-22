package kyobo;

public class Kyobo {
	//책이름,지은이,출판사,가격,발행년도
	private	String name;
	private String owner;
	private String company;
	private int price;
	private int year;
	
	//필드는 private로 외부에서 못보도록 숨겨놨으니, 외부에서 Kyobo객체를 만들기 위해선 Kyobo클래스의
	//메소드를 이용하여 생성자를 통해 객체를 만드는 수 밖에 없음.
	//외부에서 객체를 만들기 위해 적은 매개값(name,owner,company,price,year)이 생성자에게 전달되면,
	//생성자는 필드값을 매개값으로 변경시켜 객체를 만들어 줌.
	//생성자는 필드와 같은 클래스내에 있으므로 필드값 변경이 가능.
	//생성자의 매개변수는 보통 필드와 이름이 동일한데, 혼란을 막기 위해 필드명 앞에는 this를 붙여 필드명임을 표시
	public Kyobo (String name,String owner,String comapany,int price,int year) {
		this.name=name;
		this.owner=owner;
		this.company=company;
		this.price=price;
		this.year=year;	
	}
	
	//set메소드: 매개변수 값으로 필드값 변경해줌
	//get메소드: 값을 전달해줌. return타입 명시
	public void setName(String name) {this.name=name;}
	public void setOwner(String owner) {this.owner=owner;}
	public void setCompany(String company) {this.company=company;}
	public void setPrice(int price) {this.price=price;}
	public void setYear(int year) {this.year=year;}
	
	public String getName() {return name;}
	public String getOwner() {return owner;}
	public String getCompany() {return company;}
	public int getPrice() {return price;}
	public int getYear() {return year;}
	
	public String showInfo() {
		System.out.printf("책이름:%s 저자:%s 출판사:%s 가격:%d 출판년도:%d"
				,name,owner,company,price,year);
	}
	
	
	
}
