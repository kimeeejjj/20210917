package co.yedam.inherit;

public class Vehicle {
	
	protected Vehicle() {		//기본생성자,디폴트타입
		
	}
	
	public Vehicle(String msg) {  //매개값있는생성자
		System.out.println(">>"+msg);
	}
	
	protected void run() {
		System.out.println("자동차가 달립니다.");
	}
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
