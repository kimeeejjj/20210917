package co.yedam.person;
/*
 * 이름,키,몸무게,혈액형,나이
 */
public class Person {
	private String name;
	private double high;
	private double weht;
	private String blod;
	private int age;

	public Person(String name,double high,double weht,String blod,int age) {
		this.name = name;
		this.high = high;
		this.weht = weht;
		this.blod = blod;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHigt(double high) {
		this.high = high;
	}
	public void setWeht(double weht) {
		this.weht = weht;
	}
	public void setBlod(String blod) {
		this.blod = blod;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getHigh() {
		return this.high;
	}
	
	public double getWeht() {
		return this.weht;
	}
	public String getBlod() {
		return this.blod;
	}
	public int getAge() {
		return this.age;
	}
}


	
