package co.yedam;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = {1,2,3};
		String[] strAry = {"Hello","World"};
		int num = 10;
		
		Student s1 = new Student(); // name, score���� ������ �� �ִ� �츮�� ���� ���� Ÿ��
		s1.name = "ȫ�浿"; // s1�� ����Ȱ� �ƴ϶� StudentŬ������ name�̶�� �ʵ忡 ����� ��
		s1.score = 80; // ��������
		//s1�������� �̸��� ���ھ ���ÿ� �Ҵ簡��. Ÿ���� ���� �ٸ� ���ε��� �ұ��ϰ�!
		
		Student s2 = new Student(); //�̷��������� ����� ���ο� Ÿ���� ���� �� ����+���а����̸���Ŭ�����ʿ�
		s2.name = "��μ�";
		s2.score = 90;
		
		System.out.println("s1�л��̸�:" + s1.name);
		System.out.println("s1�л�����:" + s1.score);
		
		Student s3 = new Student();
		s3.name = "������";
		s3.score = 85;
		
		Student[] students = {s1,s2,s3};
		System.out.println("�迭ù��° �̸�:"+students[0].name);
		System.out.println("�迭ù��° ����:"+students[0].score);
		
		System.out.println("�迭����° �̸�:"+students[2].name);
		System.out.println("�迭����° ����:"+students[2].score);
		
		s1.name="�ڱ浿";
		s1.score=70;
		
		for(int i=0;i<students.length;i++) {
			System.out.println("�л��̸�:"+students[i].name);
			System.out.println("�л�����:"+students[i].score);
		}
		}
	}

