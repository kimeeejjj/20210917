package co.yedam;

public class MemberExample {
	public static void main(String[] args) {
//		Member m1 = null; �� ���� ��Ƶθ� m1�� �Ҵ�� ���������Ƿ� ���Ŀ� ���� ���� �� ����
		Member m1 = new Member(); //�׷��Ƿ� �� new�� �Ἥ �������� �Ҵ�� ������ �����
		m1.memberId = 10;
		m1.name = "�ڹ̸�";
		m1.phone = "010-1111-2222";
				
		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "ȫ�浿";
		m2.phone = "010-3333-4444";
		
		Member[] members = {m1,m2};
		for(Member m : members) {
			System.out.println("���̵�:"+ m.memberId);
			System.out.println("�̸�:"+m.name);
			System.out.println("����ó:"+m.phone);
		}
		
		System.out.println("=====�� �ٲ㺸��=====");
//		m1 ==> members[0]
		m1.name = "��̸�"; //�̷��� �� �ٲ� �� ����
		members[0].phone = "010-5555-6666"; //��������
		for(Member m : members) { // �迭members�� ũ�⸸ŭ MemberŸ�� m�� �ϳ��� ������Ű�鼭 �ݺ��ϰڴ�. => for(Ÿ�� �����̸��ϳ������ : �迭��ũ��) �̷�����!
			System.out.println("���̵�:"+ m.memberId);
			System.out.println("�̸�:"+m.name);
			System.out.println("����ó:"+m.phone);
			
		System.out.println("=====���� �ѹ��� ��������, ���η� ����=====");
		
		for (Member mm : members) {
			mm.showInfo();
		}
		
		Student s1 = new Student();
		s1.name="Hong";
		s1.score=90;
	}
  }
}