package co.yedam.friend;

public class Friend {
 //�̸�,����ó,e-mail,Ű,������.
	private String name;
	private String phone;
	private String email;
	private double high;
	private double weight;
	
	public Friend(String name,String phone,String email,double high,double weight) {
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
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
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
	
	public void showInfo() {
		System.out.printf("[�̸�:%s,����ó:%s,�̸���:%s,Ű:%f,������:%f]\n",
							name,phone,email,high,weight);
	}
	
}
