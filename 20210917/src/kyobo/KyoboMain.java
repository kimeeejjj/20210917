package kyobo;

import java.util.Scanner;

public class KyoboMain {
	public static Scanner scn = new Scanner(System.in);
	public static Kyobo[] books = new Kyobo[100];
	public static void main(String[] args) {

		while (true) {
			System.out.println("--------------------");
			System.out.println("1.�������|2.������ȸ|3.��������|4.�������|5.��������|6.����");
			System.out.println("--------------------");
			System.out.println("�޴��� �����ϼ���>>");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				creatBook();
				continue;
			} else if (menu == 2) {
				cheakBook();
				continue;
			} else if (menu == 3) {
				fixBook();
				continue;
			} else if (menu == 4) {

			} else if (menu == 5) {
				
			} else if (menu == 6) {
				System.out.println("�����մϴ�. �̿��� �ּż� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}

		}
	}
	//å�̸�,������,���ǻ�,����,����⵵
	public static void creatBook() {
		System.out.println("==������� �޴��Դϴ�==");
		String name = readStr("������:");
		String owner = readStr("������:");
		String company = readStr("���ǻ�:");
		int price = readInt("����:");
		int year = readInt("���ǳ⵵:");
		
		Kyobo kyobo = new Kyobo
				(name,owner,company,price,year);
		for(int i=0;i<books.length;i++) {
			if(books[i]==null) {
				books[i] = kyobo;
				break;
			}
		}
		System.out.println("��������� �Ϸ�Ǿ����ϴ�.");
	}
	
	public static void cheakBook() {
		System.out.println("==������ȸ �޴��Դϴ�==");
		String name=readStr("��ȸ�Ͻ� �������� �Է��ϼ���.");
		for(int i=0;i<books.length;i++) {
			if(books[i]!=null && books[i].getName().equals(name)) {
				System.out.println(books[i].showInfo());
				break;
			}
		}
	}

	public static void fixBook() {
		System.out.println("==�������� �޴��Դϴ�==");
		String name=readStr("�����Ͻ� �������� �Է��ϼ���");
		for(int i=0;i<books.length;i++){
			if(books[i].getName().equals(name)) {
				
			}
		}
		
	}
	
	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}
	
	public static int readInt(String msg) {
		System.out.println(msg);
		return scn.nextInt();
	}
}
