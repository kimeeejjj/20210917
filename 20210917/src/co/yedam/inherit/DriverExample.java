package co.yedam.inherit;
/* �Ű������� ������
 * Bus->Vehicle, Taxi->Vehicle
 * 
 */
public class DriverExample {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(v); //�Ű�������VehicleŬ�������ν��Ͻ����;���,�׷��⿡�ڽ�Ŭ������Bus��Taxi������
	}
}
