package kyobo;

public class Kyobo {
	//å�̸�,������,���ǻ�,����,����⵵
	private	String name;
	private String owner;
	private String company;
	private int price;
	private int year;
	
	//�ʵ�� private�� �ܺο��� �������� ���ܳ�����, �ܺο��� Kyobo��ü�� ����� ���ؼ� KyoboŬ������
	//�޼ҵ带 �̿��Ͽ� �����ڸ� ���� ��ü�� ����� �� �ۿ� ����.
	//�ܺο��� ��ü�� ����� ���� ���� �Ű���(name,owner,company,price,year)�� �����ڿ��� ���޵Ǹ�,
	//�����ڴ� �ʵ尪�� �Ű������� ������� ��ü�� ����� ��.
	//�����ڴ� �ʵ�� ���� Ŭ�������� �����Ƿ� �ʵ尪 ������ ����.
	//�������� �Ű������� ���� �ʵ�� �̸��� �����ѵ�, ȥ���� ���� ���� �ʵ�� �տ��� this�� �ٿ� �ʵ������ ǥ��
	public Kyobo (String name,String owner,String comapany,int price,int year) {
		this.name=name;
		this.owner=owner;
		this.company=company;
		this.price=price;
		this.year=year;	
	}
	
	//set�޼ҵ�: �Ű����� ������ �ʵ尪 ��������
	//get�޼ҵ�: ���� ��������. returnŸ�� ���
	public void setName(String name) {this.name=name;}
	public void setOwner(String owner) {this.owner=owner;}
	public void setCompany(String company) {this.company=company;}
	public void setPrice(int price) {this.price=price;}
	public void setYear(int year) {this.year=year;}
	
	public String getName() {return name;}
	public String getOwner() {return owner;}
	public String getCompany() {return company;}
	public int getPrice() {return price;}
	public int getYear() {return year;}
	
	public String showInfo() {
		System.out.printf("å�̸�:%s ����:%s ���ǻ�:%s ����:%d ���ǳ⵵:%d"
				,name,owner,company,price,year);
	}
	
	
	
}
