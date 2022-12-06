import java.util.Scanner;

class School2 {
	String Name1 = "Jejuewlementary";
	String Name2;
	int grade1 = 6;
	int grade;

}

public class School1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School2 sch = new School2();
		sch.Name2 = sc.next();
		sch.grade = sc.nextInt();

		System.out.println(sch.grade1 + " grade in " + sch.Name1 + " School");
		System.out.println(sch.grade + " grade in " + sch.Name1 + " School");
	}
}