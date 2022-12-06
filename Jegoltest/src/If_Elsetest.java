import java.util.Scanner;

public class If_Elsetest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0);
		sc.close();
//		if (x == 'A') {
//			System.out.println("Excellent");
//		} else if (x == 'B') {
//			System.out.println("Good");
//		} else if (x == 'C') {
//			System.out.println("Usually");
//		} else if (x == 'D') {
//			System.out.println("Effort");
//		} else if (x == 'F') {
//			System.out.println("Failure");
//		} else {
//			System.out.println("error");
//		}
		System.out.println(x);
		
		switch (x) {
		case 'A' :
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case'C' :
			System.out.println("Usally");
			break;
		case 'D' :
			System.out.println("Effort");
			break;
		case 'F' :
			System.out.println("Failure");
			break;
			default:
				System.out.println("error");
		}
	}
}
