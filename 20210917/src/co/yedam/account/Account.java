package co.yedam.account;

public class Account {
	//�ʵ�
	private String ano; //���¹�ȣ
	private String owner; //���¼�����
	private int balance; //�ܾ�
	
	//������
	public Account (String ano,String owner,int balance) {
		this.ano=ano;
		this.owner=owner;
		this.balance=balance;
	}
	
	//�޼ҵ�
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano=ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner=owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance=balance;}
	
	public void showInfo() {
		System.out.printf("%s\t%s\t%d\n",ano,owner,balance);
	}
	
}