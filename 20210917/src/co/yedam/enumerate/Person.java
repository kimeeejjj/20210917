package co.yedam.enumerate;

public class Person {
	String name;
	Gender gender;//남, 남자, 여, 여자, 녀 Gender타입이므로 MAN, WOMAN 두가지값만 가질 수 있음
	String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
