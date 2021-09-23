package co.yedam.account;

import java.util.Scanner;

public class AppMain {
	
	//싱글톤: new생성자 =>새로운 인스턴스 생성, 메모리 낭비됨
	private static AppMain singleton = new AppMain();
	//한번 만들어진 인스턴스로 계속 활용하겠다 = 싱글톤
	
	//생성자를 private로 만듦
	private AppMain() {}
	
	//method getInstance(),생성자는private이니앞으론이메소드만이용가능
	public static AppMain getInstance(){
		return singleton;
	}
	
	Scanner scanner = new Scanner(System.in);
	Account[] accounts = new Account[100];

	public void createAccount() {
		System.out.println("------");
		System.out.println("계좌 생성");
		System.out.println("------");
		// 계좌번호,계좌주,초기입금액
		String ano = readStr("계좌번호:");
		String owner = readStr("계좌주:");
		int balance = readInt("초기입금액:");

		Account account = new Account(ano, owner, balance);
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				break;
			}
		}
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}

	public void accountList() {
		System.out.println("------");
		System.out.println("계좌 목록");
		System.out.println("------");
		for (Account account : accounts) {
			if (account != null) {
				account.showInfo();
			}
		}
	}

	public void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		String search = readStr("계좌번호:");// 예금할 계좌번호를 찾을 변수 search
		int nowDe = readInt("예금액:");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAno().equals(search)) {
				accounts[i].setBalance(accounts[i].getBalance() + nowDe);
			}
		}
		System.out.println("결과 : 예금이 성공되었습니다.");
	}

	public void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		String search = readStr("계좌번호:");// 출금할 계좌번호를 찾을 변수 search
		int nowWi = readInt("출금액:");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= nowWi && accounts[i] != null && accounts[i].getAno().equals(search)) {
				accounts[i].setBalance(accounts[i].getBalance() - nowWi);
				System.out.println("결과: 출금이 성공되었습니다.");
				break;
			} else {
				System.out.println("잔액이 부족합니다.");
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
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("----------");
		System.out.println("선택>>");
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
