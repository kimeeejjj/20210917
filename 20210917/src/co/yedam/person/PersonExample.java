package co.yedam.person;

public class PersonExample { 
	
	public static void main(String[] args) {
	 // p1 => �̸�, Ű, ������, ������, ����
		Person p1 = new Person("������",163.4,50,"AB",25);
		Person p2 = new Person("������",158.8,40,"B",24);
		Person p3 = new Person("������",168,55,"A",18);
		
		Person[] family = {p1,p2,p3};
		
		System.out.println("===�̸�,������,���̸� ��������===");
		
		for (int i=0;i<family.length;i++) {
			System.out.println("�̸�:"+family[i].getName()
								+"������:"+family[i].getBlod()
								+"����:"+family[i].getAge());
		}
		
		System.out.println("===�̸�,Ű,�����Ը� ��������===");
		
		for (int i=0;i<family.length;i++) {
			System.out.println("�̸�:"+family[i].getName()
								+"Ű:"+family[i].getHigh()
								+"������:"+family[i].getWeht());
		}
		
		System.out.println("===p3�� AB������ ����, AB���� ����(�̸�,������)�� ���===");
		
		
		p3.setBlod("AB"); //������������ "�����̸�.�����Ҹ޼ҵ�(�ٲܰ��Է�);"
		for(int i=0;i<family.length;i++) {
			if(family[i] !=null && family[i].getBlod().equals("AB")) {
				System.out.println("�̸�:"+family[i].getName()
						+"Ű:"+family[i].getHigh()
						+"������:"+family[i].getWeht());
				System.out.println("������"+family[i].getBlod());
			}
		}
		
		
		
}
}
