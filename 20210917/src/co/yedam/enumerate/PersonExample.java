package co.yedam.enumerate;

public class PersonExample {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="ȫ�浿";
		p1.gender=Gender.MAN; //������Ÿ���� ����� ���� ����
		p1.address="�뱸��";
	
		Person p2 = new Person();
		p2.name="���ϴ�";
		p2.gender=Gender.WOMAN; //������Ÿ���� ����� ���� ����
		p2.setGender(Gender.WOMAN);
		p2.address="�����";
		
		Person[] persons = {p1,p2};
		for(Person person : persons) {
			if(person.gender == Gender.WOMAN) {  //����Ÿ���� equals��, ������Ÿ���� ==�� �񱳰���
				System.out.println("�̸�:"+person.name);
			}
		}
		
		//������ �޼ҵ�
		Week today = Week.FRIDAY; //������ ������Ÿ��.���� = Week��� Ÿ�Կ� Friday���� ���ڴ�
		Week[] weeks = Week.values(); //values() �ش�Ÿ�Կ� ��� �� ��ü�� �������
		for(Week week : weeks) {
			System.out.println(week.name());
		}
		
	}
}
