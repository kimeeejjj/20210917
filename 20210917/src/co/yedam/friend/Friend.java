package co.yedam.friend;

public class Friend {
 //이름,연락처,e-mail,키,몸무게.
	private String name;
	private int phone;
	private String email;
	private double high;
	private double weight;
	
	public Friend(String name,int phone,String email,double high,double weight) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.high = high;
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getPhone() {
		return phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getHigh() {
		return high;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
}
