import java.util.Scanner;

public class Switch_casetest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		sc.close();
		switch((int)x) {
		case 4 :
			System.out.println("scholarship");
			break;
		case 3 :
			System.out.println("next semester");
			break;
		case 2 :
			System.out.println("seasonal semester");
			break;
		default :
			System.out.println("retake");
			
			}
		}
}
