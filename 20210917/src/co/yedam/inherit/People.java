package co.yedam.inherit;
/*
 * ���:�θ�->�ڽ�.
 */
public class People extends Object {
	//�ʵ�
	private String name;
	private String ssn;
	//������2��
	public People() {
		
	}
	public People(String name,String ssc) {
		this.name=name;
		this.ssn=ssn;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public void showInfo() {
		System.out.println("�̸���"+name+",�ֹι�ȣ��"+ssn);
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}
	
	
}
