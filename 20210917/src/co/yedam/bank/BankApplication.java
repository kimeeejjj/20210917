package co.yedam.bank;

import java.util.Scanner;
public class BankApplication {
	private static Scanner scanner = new Scanner(System.in); 
	static Account[] accounts = new Account[100];
	
	public static void main(String[] args) {
		
		while(true) {
		System.out.println("---------------------------");
		System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
		System.out.println("---------------------------");
		System.out.println("���� >>");
		int selectNo = scanner.nextInt();
		scanner.nextLine();
		
		if(selectNo == 1) {
			createAccount();
			continue;
		
		} else if(selectNo == 2) {
			accountList();
			continue;
			
		} else if(selectNo == 3) {
			deposit();
			continue;
		
		} else if(selectNo == 4) {
			withdraw();
			continue;
		
		} else if(selectNo == 5) {
			System.out.println("�����մϴ�. �̿��� �ּż� �����մϴ�.");
			break;
		
		} else {
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
		}
	} //end of main
	
	public static void createAccount() {
		System.out.println("------");
		System.out.println("���� ����");
		System.out.println("------");
		//���¹�ȣ,������,�ʱ��Աݾ�
		String ano = readStr("���¹�ȣ:");
		String owner = readStr("������:");
		int balance = readInt("�ʱ��Աݾ�:");
		
		Account account = new Account(ano,owner,balance);
		for (int i=0;i<accounts.length;i++) {
			if(accounts[i] == null) {
				accounts[i] = account;
				break;
			}
		}
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		
	}
	public static void accountList() {
		for(Account account : accounts) {
			if(account !=null ) {
				account.showInfo();
			}
		}
		
	}
	public static void deposit() {
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");
		String search=readStr("���¹�ȣ:");//������ ���¹�ȣ�� ã�� ���� search
		int nowDe=readInt("���ݾ�:");
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i] !=null && accounts[i].getAno().equals(search)) {
				accounts[i].setBalance(accounts[i].getBalance()+nowDe);
			}
		}
	System.out.println("��� : ������ �����Ǿ����ϴ�.");
		
	}
	public static void withdraw() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		String search=readStr("���¹�ȣ:");//����� ���¹�ȣ�� ã�� ���� search
		int nowWi=readInt("��ݾ�:");
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getBalance()>=nowWi && 
				accounts[i] !=null && accounts[i].getAno().equals(search)) {
				accounts[i].setBalance(accounts[i].getBalance()-nowWi);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
				break;
			}else {
				System.out.println("�ܾ��� �����մϴ�.");
				break;
			}
		}
		
	}
	
	public static String readStr(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
		
	}
	public static int readInt(String msg) {
		System.out.println(msg);
		return scanner.nextInt();
	}
}
