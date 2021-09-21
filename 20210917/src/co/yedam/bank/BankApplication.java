package co.yedam.bank;

import java.util.Scanner;
public class BankApplication {
	private static Scanner scanner = new Scanner(System.in); 
	static Account[] accounts = new Account[100];
	
	public static void main(String[] args) {
		
		while(true) {
		System.out.println("---------------------------");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("---------------------------");
		System.out.println("선택 >>");
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
			System.out.println("종료합니다. 이용해 주셔서 감사합니다.");
			break;
		
		} else {
			System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
		}
		}
	} //end of main
	
	public static void createAccount() {
		System.out.println("------");
		System.out.println("계좌 생성");
		System.out.println("------");
		//계좌번호,계좌주,초기입금액
		String ano = readStr("계좌번호:");
		String owner = readStr("계좌주:");
		int balance = readInt("초기입금액:");
		
		Account account = new Account(ano,owner,balance);
		for (int i=0;i<accounts.length;i++) {
			if(accounts[i] == null) {
				accounts[i] = account;
				break;
			}
		}
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
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
		System.out.println("예금");
		System.out.println("------");
		String search=readStr("계좌번호:");//예금할 계좌번호를 찾을 변수 search
		int nowDe=readInt("예금액:");
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i] !=null && accounts[i].getAno().equals(search)) {
				accounts[i].setBalance(accounts[i].getBalance()+nowDe);
			}
		}
	System.out.println("결과 : 예금이 성공되었습니다.");
		
	}
	public static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		String search=readStr("계좌번호:");//출금할 계좌번호를 찾을 변수 search
		int nowWi=readInt("출금액:");
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getBalance()>=nowWi && 
				accounts[i] !=null && accounts[i].getAno().equals(search)) {
				accounts[i].setBalance(accounts[i].getBalance()-nowWi);
				System.out.println("결과: 출금이 성공되었습니다.");
				break;
			}else {
				System.out.println("잔액이 부족합니다.");
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
