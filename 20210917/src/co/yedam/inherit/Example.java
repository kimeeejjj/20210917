package co.yedam.inherit;

public class Example {
	public static void main(String[] args) {
		People p1=new People("Hong","20200101-1234567");
		System.out.println("�̸�:"+p1.getName());
		System.out.println("�ֹι�ȣ:"+p1.getSsn());
		p1.showInfo();
		System.out.println(p1.toString());
		
		Student s1=new Student("Park","20210101-1234567");
		System.out.println("�̸�:"+s1.getName());
		System.out.println("�ֹι�ȣ:"+s1.getSsn());
		s1.showInfo();
		System.out.println(s1.toString());
		
		Student s2=new Student("Choi","20210202-1234567",110);
		System.out.println("�̸�:"+s2.getName());
		System.out.println("�ֹι�ȣ:"+s2.getSsn());
		System.out.println("�л���ȣ:"+s2.getStudentNo());
		s2.showInfo();
		
		People p2=new Student("Hwang","20210303-1234567",120); //�θ�Ŭ������ �ڽ�Ŭ���� ��밡��

//		p1 = new Student("Hwang","20210303-1234567",120);
		//�տ��� ����� �θ�Ŭ���� ��ü p1�� �ٽ� �ڽ�Ŭ���� ��ü�� ���氡��
		//�θ�Ÿ�� �������� �ڽ�Ŭ���� �Ҵ� ����, �׷��� �ڽ�Ÿ�Ժ����� �θ�Ŭ���� �Ҵ� �Ұ�

//		p2.getStudnetNo(); �θ�Ŭ���� ������ �ڽ�Ŭ���� �޼ҵ� ȣ�� �Ұ���

		if(p2 instanceof Student) {
		Student s3 = (Student)p2; //(Student)�Է��Ͽ�����Ÿ�Ժ�ȯ�ؼ��� �θ�Ŭ����������
		s3.getStudentNo();			//�ڽ�Ŭ�����������Ҵ簡����
									//������������� 23�����ΰ� ���� �θ�Ŭ���������� �ڽ�Ŭ������ �Ҵ��س��߸� ����
									//�׸��� p2 instanceof Student �� ���� p2�� StudentŬ������ �����ֳĴ�
							//Ȯ���� �ѹ� ��ģ�Ŀ� �����ϸ� �������� �Ǽ��� �ٿ��� �� ����.
		}
		if(p1 instanceof Student) {
			Student s4=(Student)p1;
			s4.getStudentNo();
		}else {
			System.out.println("����ȯ �� �� �����ϴ�.");
		}
	
	}
	
	
}
