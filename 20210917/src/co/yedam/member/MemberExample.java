package co.yedam.member;

import co.yedam.Student;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1","�ڹ̸�","�뱸�߱� ���ϵ�"); //������ȣ��, ���������� ��� �Ƴĸ� ��Ʈ��Ŭ���غ��� �ش� Ŭ������ �̵�
		m1.showInfo();
		
//		m1.memberId = "user1"; memberId�� private�� �����ؼ� ������
		m1.setMemberId("user2");
//		m1.name = "Hong"; 
		m1.setName("Hong");
//		m1.address = "�߱� ���ϵ�";
		m1.setAddress("�߱� ���ϵ�");
		
//		System.out.println("���̵�:"+m1.memberId);
		System.out.println("���̵�:"+m1.getMemberId());
//		System.out.println("�̸�:"+m1.name);
		System.out.println("�̸�:"+m1.getName());
//		System.out.println("�ּ�:"+m1.address);
		System.out.println("�ּ�:"+m1.getAddress());
		
		Member m2 = new Member("user2");
//		m2.
//		m2.showInfo();
		
		Member m3 = new Member("user3","ȫ�浿","�뱸���� �Ŵ絿");
		m3.showInfo();
//		m3.name = "�ڱ浿";
		m3.setName("�ڱ浿");
		m3.showInfo();
	
		Student s1 = new Student(); //co.yedam StudentŬ���� public�̴� ���ٰ���
//		s1.name="Hong"; co.yedam StudentŬ������ default���� �ʵ��̹Ƿ� ���ٺҰ�
//		s1.score=90; default���� ������ ��Ű�������� ���ٰ���
	}
}
