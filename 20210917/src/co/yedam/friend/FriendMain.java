package co.yedam.friend;

import java.util.Scanner;

/*
 *  ģ�� ��� ����
 *  �̸�,����ó,e-mail,Ű,������.
 *  1.���, 2.��ȸ(�̸�), 3.���, 4.����, 5.����, 9.����
 */
public class FriendMain {// start of class
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) { // start of main
		Friend[] friends = new Friend[10];

		while (true) {
			System.out.println("1.ģ����� 2.ģ����ȸ 3.ģ����� 4.ģ������ 5.ģ������ 9.����");
			int menu = readInt("�޴��� �����ϼ���>>");
			if (menu == 1) {
				System.out.println("ģ����ϸ޴��Դϴ�.");
				String name = readStr("ģ���� �̸��� �Է��ϼ���.");
				String phone = readStr("ģ���� ����ó�� �Է��ϼ���.");
				String email = readStr("ģ���� �̸����� �Է��ϼ���.");
				double high = readDouble("ģ����   Ű�� �Է��ϼ���.");
				double weight = readDouble("ģ���� �����Ը� �Է��ϼ���");

				Friend friend = new Friend(name, phone, email, high, weight);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");

			} else if (menu == 2) {
				System.out.println("ģ����ȸ�޴��Դϴ�.");
				String search = readStr("��ȸ�� ģ���̸��� �Է��ϼ���.");
				for (Friend friend : friends) {
					if (friend != null && friend.getName().indexOf(search) != -1)
						friend.showInfo();
				}
			
			} else if (menu == 3) {
				System.out.println("ģ����ϸ޴��Դϴ�.");
				for(Friend friend : friends) {
					if(friend !=null)
						friend.showInfo();
				}
			
			} else if (menu == 4) {
				System.out.println("ģ�������޴��Դϴ�.");
				String search = readStr("������ ģ���̸��� �Է��ϼ���.");
				String phone = readStr("������ ����ó�� �Է��ϼ���.[��ġ���� ���,Enter]");
				String email = readStr("������ �̸����� �Է��ϼ���.[��ġ���� ���,Enter]");
				String high = readStr("������ ������ �Է��ϼ���.[��ġ���� ���,Enter]");
				String weight = readStr("������ �����Ը� �Է��ϼ���.[��ġ���� ���,Enter]");
				boolean isExist = false;
				for(int i=0; i<friends.length;i++) {
					if(friends[i] !=null && friends[i].getName().equals(search)) {
						if(!phone.equals("")) {
						friends[i].setPhone(phone);
						}
						if(!email.equals("")) {
						friends[i].setEmail(email);
						}
						if(!high.equals("")) {
						friends[i].setHigh(Double.parseDouble(high));
						}
						if(!weight.equals("")) {
						friends[i].setHigh(Double.parseDouble(weight));
						}
						isExist=true;
						
					}
				}
				if(isExist)
					System.out.println("���������� �����Ǿ����ϴ�.");
				else
					System.out.println("�������� �ʴ� ģ���Դϴ�.");
			
			} else if (menu == 5) {
				System.out.println("ģ�������޴��Դϴ�.");
				String search = readStr("������ ģ���̸��� �Է��ϼ���.");
				for(int i=0; i<friends.length;i++) {
					if(friends[i]!=null&&friends[i].getName().indexOf(search)!=-1)
					friends[i]=null;
				}
				System.out.println("�����Ϸ�.");
				
			
			} else if (menu == 9) {
				System.out.println("�����մϴ�.");
				break;
			
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		System.out.println("-��-");
	} // end of main

	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	public static double readDouble(String msg) {
		System.out.println(msg);
		double result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Double.parseDouble(val);
				break;
			} catch (Exception e) {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		return result;
	}

	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		return result;
	}

}
