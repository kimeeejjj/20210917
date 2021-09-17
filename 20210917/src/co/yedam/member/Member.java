package co.yedam.member;

public class Member {  //public ���µǾ��ִ�-->MemberŬ���� �ܿ� �ٸ� Ŭ�������� ��������
	//user1(���̵�), ȫ�浿(�̸�), �뱸�߱��Ŵ絿(�ּ�)
	private String memberId;  //private ���-->�ٸ�Ŭ�������� ���� �Ұ�
	private String name;
	private String address;

	// ������: �ʵ忡 ���� �ʱ�ȭ��Ŵ. Ŭ���� �̸��� �����ϰ� ������ ��.
	// ���ϰ��� ���� void�� ���� return�� ����
	public Member() {
//		memberId="user1";
//		name = "������";
//		address ="�뱸�߱� ���ϵ�";
	}
	
	public Member(String mId) {
		memberId = mId;
	}
	
	public Member(String mId, String n, String a){
		memberId=mId;
		name = n;
		address = a;
	}
	
	//�޼ҵ�
	public void setMemberId(String mId) {
		memberId = mId;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAddress(String ad) {
		address = ad;
	}
	
	public String getMemberId() {
		return memberId; //��ȯ���ִ� �ʵ� : ���̵�
	}
	
	public String getName() {
		return name; //��ȯ���ִ� �ʵ� : �̸�
	}
	
	public String getAddress() {
		return address;  //��ȯ���ִ� �ʵ� : �ּ�
	}
	
	public void showInfo() { //�޼ҵ�� Ŭ���� �ȿ� ���ԵǾ��־�� ��
	System.out.println("���̵�:"+memberId+",�̸�:"+name+",�ּ�:"+address);
	}

	public void showMemberId() {
	System.out.println("���̵�:"+memberId);
	}

	public void showName() {
	System.out.println("�̸�:"+name);
	}

	public void showaddress() {
	System.out.println("�ּ�:"+address);
	}

}