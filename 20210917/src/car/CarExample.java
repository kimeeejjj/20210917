package car;

public class CarExample {
	public static void main(String[] args) {
		// sonata
		Car sonata = new Car("소나타","SonataHybrid",2000,200,new Tire()); //타이어는 Tire라는 클래스로
		sonata.getCarName();
		sonata.getCarModel();
		
		
		
		
	}
}
