package co.yedam.inherit;

public class Vehicle {
	
	protected Vehicle() {		//�⺻������,����ƮŸ��
		
	}
	
	public Vehicle(String msg) {  //�Ű����ִ»�����
		System.out.println(">>"+msg);
	}
	
	protected void run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
	}
	public void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
