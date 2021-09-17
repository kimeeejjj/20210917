package co.yedam.person;

public class PersonExample { 
	
	public static void main(String[] args) {
	 // p1 => 이름, 키, 몸무게, 혈액형, 나이
		Person p1 = new Person("김은지",163.4,50,"AB",25);
		Person p2 = new Person("김은혜",158.8,40,"B",24);
		Person p3 = new Person("김조선",168,55,"A",18);
		
		Person[] family = {p1,p2,p3};
		
		System.out.println("===이름,혈액형,나이만 나오도록===");
		
		for (int i=0;i<family.length;i++) {
			System.out.println("이름:"+family[i].getName()
								+"혈액형:"+family[i].getBlod()
								+"나이:"+family[i].getAge());
		}
		
		System.out.println("===이름,키,몸무게만 나오도록===");
		
		for (int i=0;i<family.length;i++) {
			System.out.println("이름:"+family[i].getName()
								+"키:"+family[i].getHigh()
								+"몸무게:"+family[i].getWeht());
		}
		
		System.out.println("===p3을 AB형으로 변경, AB형인 가족(이름,혈액형)만 출력===");
		
		
		p3.setBlod("AB"); //변수값변경은 "변수이름.참조할메소드(바꿀값입력);"
		for(int i=0;i<family.length;i++) {
			if(family[i] !=null && family[i].getBlod().equals("AB")) {
				System.out.println("이름:"+family[i].getName()
						+"키:"+family[i].getHigh()
						+"몸무게:"+family[i].getWeht());
				System.out.println("혈액형"+family[i].getBlod());
			}
		}
		
		
		
}
}
