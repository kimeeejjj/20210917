package co.yedam.inherit;
/* 매개변수의 다형성
 * Bus->Vehicle, Taxi->Vehicle
 * 
 */
public class DriverExample {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(v); //매개값으로Vehicle클래스의인스턴스가와야함,그렇기에자식클래스인Bus와Taxi도가능
	}
}
