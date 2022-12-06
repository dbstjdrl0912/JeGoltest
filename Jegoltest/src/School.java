import java.util.Scanner;

public class School {

	String name ; // 멤버변수
	String sch ;
	int Grade ; 
	
void sheep() {
	System.out.println("Name : " + name);
	System.out.println("School : "+ sch);
	System.out.println("Grade : "+ Grade);
}
	
	void index(String name,String sch,int Grade) {//매개변수
		this.name= name; // 매개 변수를 대입하기위해
		this.sch=sch;
		this.Grade=Grade;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		String name = sc.next(); //스캐너 입력위해 지역
		String sch = sc.next();
		int Grade = sc.nextInt(); 
		sc.close();
		
		School shc = new School(); //인스턴스
		shc.index(name,sch,Grade);
		shc.sheep();
	}
}

