package co.yedam.account;

import java.util.Scanner;

public class AppMain {
	
	//�̱���: new������ =>���ο� �ν��Ͻ� ����, �޸� �����
	private static AppMain singleton = new AppMain();
	//�ѹ� ������� �ν��Ͻ��� ��� Ȱ���ϰڴ� = �̱���
	
	//�����ڸ� private�� ����
	private AppMain() {}
	
	//method getInstance(),�����ڴ�private�̴Ͼ������̸޼ҵ常�̿밡��
	public static AppMain getInstance(){
		return singleton;
	}
	
	Scanner scanner = new Scanner(System.in);
	Account[] accounts = new Account[100];

	public void createAccount() {
		System.out.println("------");
		System.out.println("���� ����");
		System.out.println("------");
		// ���¹�ȣ,������,�ʱ��Աݾ�
		String ano = readStr("���¹�ȣ:");
		String owner = readStr("������:");
		int balance = readInt("�ʱ��Աݾ�:");

		Account account = new Account(ano, owner, balance);
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				break;
			}
		}
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
	}

	public void accountList() {
		System.out.println("------");
		System.out.println("���� ���");
		System.out.println("------");
		for (Account account : accounts) {
			if (account != null) {
				account.showInfo();
			}
		}
	}

	public void deposit() {
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");
		String search = readStr("���¹�ȣ:");// ������ ���¹�ȣ�� ã�� ���� search
		int nowDe = readInt("���ݾ�:");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAno().equals(search)) {
				accounts[i].setBalance(accounts[i].getBalance() + nowDe);
			}
		}
		System.out.println("��� : ������ �����Ǿ����ϴ�.");
	}

	public void withdraw() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		String search = readStr("���¹�ȣ:");// ����� ���¹�ȣ�� ã�� ���� search
		int nowWi = readInt("��ݾ�:");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= nowWi && accounts[i] != null && accounts[i].getAno().equals(search)) {
				accounts[i].setBalance(accounts[i].getBalance() - nowWi);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
				break;
			}
		}
	}

	public Account findAccount(String ano) {
		return null;
	}

	public void execute() {
		boolean run = true;
		System.out.println("----------");
		System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
		System.out.println("----------");
		System.out.println("����>>");
		int selectNo = scanner.nextInt();
		if (selectNo == 1) {
			createAccount();
		} else if (selectNo == 2) {
			accountList();
		} else if (selectNo == 3) {
			deposit();
		} else if (selectNo == 4) {
			withdraw();
		} else if (selectNo == 5) {

		}

	}

	public String readStr(String msg) {
		System.out.println(msg);
		return scanner.nextLine();

	}

	public int readInt(String msg) {
		System.out.println(msg);
		return scanner.nextInt();
	}

}
