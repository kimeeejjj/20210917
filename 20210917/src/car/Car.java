package car;


public class Car {
	private String carName;
	private String carModel;
	private int carPrice;
	private int maxSpeed; 
	private Tire tire; //String tire라 하면 값을 한개만 입력할 수 있으니까 걍 Tire라는 클래스를 하나 더 만들자!
	
	//생성자
	public Car(String carName,String carModel,int carPrice,int maxSpeed,Tire tire) {
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.maxSpeed = maxSpeed;
		this.tire = tire;
	}
	
	//메소드
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public String getCarName() {
		return carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public Tire getTire() {
		return tire;
	}
	
		
}
