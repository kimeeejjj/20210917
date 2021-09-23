package co.yedam.inherit;

import co.yedam.ScanUtil;

public class FriendExe {
	
	private static FriendExe singleton = new FriendExe(); //�ʵ�
	private Friend[] friends; //�ʵ�
	
	private FriendExe() {//�̱��� ���� �����ڸ� private����
		//ģ��,�б�ģ��,ȸ��ģ��=>�迭�� ����.
		//CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100]; //FriendŬ������ӹ޴��ڽ�Ŭ�������̹迭��밡��		
		friends[0]=new UnivFriend("������","01083701707","������");
		friends[5]=new UnivFriend("������","01017078370","������");
		friends[1]=new CompFriend("������","01073547359","������");
		friends[2]=new Friend("������","01084701707");
		friends[3]=new UnivFriend("���μ�","01039994088","���а�");
		friends[4]=new CompFriend("�����","01077708007","������");
	} 
	
	public static FriendExe getInstance() {
		return singleton;
	}
	
	
	public void execute() {
		while(true) {
		System.out.println("----------------------");
		System.out.println("1.ģ����� 2.��ȸ 3.���� 4.���� 5.����");
		System.out.println("----------------------");
		int menu=ScanUtil.readInt("�޴��� �����ϼ���."); //static�޼ҵ��̹Ƿ� new���̵� �ٷ� ȣ�Ⱑ��
			if(menu==1) {
				System.out.println("ģ�����");
				addFriend();
			}else if(menu==2) {
				System.out.println("ģ����ȸ");
				showList();
			}else if(menu==3) {
				System.out.println("ģ������");
				modify();
			}else if(menu==4) {
				System.out.println("ģ������");
				delateFriend();
			}else if(menu==5) {
				System.out.println("�����մϴ�");
				break;
			}
		}
		System.out.println("��");
	}
	private void addFriend() {
		//ģ��,�б�ģ��,ȸ��ģ�� ������������ ���� �䱸�Ǵ� �� �ٸ�
		//���� �̸�,����ó|+��������|+�μ�����
		System.out.println("1.ģ�� 2.�б�ģ�� 3.ȸ��ģ��");
		int choice=ScanUtil.readInt("�޴��� �����ϼ���>>");
		String name=ScanUtil.readStr("ģ���̸��� �Է��ϼ���");
		String phone=ScanUtil.readStr("����ó�� �Է��ϼ���");
		Friend friend =null;
		if(choice==1) {
			friend = new Friend(name,phone);
		}else if(choice==2) {
			String major=ScanUtil.readStr("���������� �Է��ϼ���");
			friend = new UnivFriend(name,phone,major);
		}else if(choice==3) {
			String depart=ScanUtil.readStr("�μ������� �Է��ϼ���");
			friend = new CompFriend(name,phone,depart);
		}

		for(int i=0;i<friends.length;i++) {
			if(friends[i] ==null) {
				friends[i]=friend;
				break;
			}
		}
		System.out.println("���������� ��ϵǾ����ϴ�");
		
	}
	
	private void showList() {
		//�̸�,����ó �Է� => ȫ�浿,��浿->�浿.
		//1111-1211, 2222-1211 -> 1211.
		//�浿,1211 -> �̸�&����ó
		String name = ScanUtil.readStr("��ȸ�� �̸��� �Է��ϼ���[�𸦰�� Enter]");
		String phone = ScanUtil.readStr("��ȸ�� ����ó�� �Է��ϼ���[�𸦰�� Enter]");
		for(Friend friend : friends) {
			if(name !=null && phone ==null) { //!name.equals("") -> �̸��� ���� ""�� �ƴմϱ�? ��, ���� �ֽ��ϱ�? 
				if(friend !=null && friend.getName().indexOf(name) != -1) {
					System.out.println(friend.toString());
					continue;
				}	
			}else if(name ==null && phone !=null) { //!phone.equals("") -> ����ó ���� ""�� �ƴմϱ�? ��, ���� �ֽ��ϱ�?
				if(friend !=null && friend.getPhone().indexOf(phone) != -1) {
					System.out.println(friend.toString());
					continue;
				}
			}else if(name !=null && phone !=null) { //!name.equals("")&&!phone.equlas("") :���������������;���
				if(friend != null && friend.getName().indexOf(name) != -1
						&& friend.getPhone().indexOf(phone) != -1) {
					System.out.println(friend.toString());
				}
			} else {  //�̸�,����ó ��� �� ����
				System.out.println(friend.toString());
			}
			
		} //end of for
	}
		
//		for(int i=0;i<friends.length;i++) {		86~104 ���������ڵ�, ���⼭���� �������ڵ�
//			if(friends[i] !=null) {
//				if(!name.equals("") && !phone.equals("")) {
//					if(friends[i].getName().indexOf(name) != -1
//						&& friends[i].getPhone().indexOf(phone) != -1)
//						System.out.println(friends[i].toString());
//				}else if(!phone.equals("")) {
//					if(friends[i].getPhone().indexOf(phone) != -1)
//						System.out.println(friends[i].toString());
//				}else if(!name.equals(""))	{
//					if(friends[i].getName().indexOf(name) != -1)
//						System.out.println(friends[i].toString());
//				}else {
//					System.out.println(friends[i].toString());
//				}		
//			}
//		}

	private void modify() {
		System.out.println("[ģ�����]");
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null) {
			System.out.println("["+i+"] "+friends[i].toString());
			}
		}
		int num = ScanUtil.readInt("������ ģ���� �����ϼ���");
		String phone=ScanUtil.readStr("������ ����ó�� �Է��ϼ���[��ġ�������, Enter]");
		if(!phone.equals("")) {
			friends[num].setPhone(phone);			
		}
		if(friends[num] instanceof UnivFriend) {
			String major=ScanUtil.readStr("������ ������ �Է��ϼ���[��ġ�������, Enter]");
			if(!major.equals("")) {
			((UnivFriend)friends[num]).setMajor(major);
			}
		}else if(friends[num] instanceof CompFriend) {
			String depart=ScanUtil.readStr("������ �μ��� �Է��ϼ���[��ġ�������, Enter]");
			if(!depart.equals("")) {
			((CompFriend)friends[num]).setDepart(depart);
			}
		}
		System.out.println("������ �Ϸ�Ǿ����ϴ�");
	}
	
	private void delateFriend() {
		System.out.println("[ģ�����]");
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null) {
			System.out.println("["+i+"] "+friends[i].toString());
			}
		}
		String num = ScanUtil.readStr("������ ģ���� �����ϼ���");
		if(!num.equals("")) {
		if(friends[Integer.parseInt(num)] != null) {
			friends[Integer.parseInt(num)] = null;
			System.out.println("������ �Ϸ�Ǿ����ϴ�");
		} else if(friends[Integer.parseInt(num)] == null) {
			System.out.println("������ ���� �����ϴ�");
		}
	}
  }
}
