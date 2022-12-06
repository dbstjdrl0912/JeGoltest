import java.util.Scanner;

public class If_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp = sc.nextDouble();
		sc.close();
		if (inp>=4.0) {
			System.out.println("scholarship");
		} else if (inp >=3.0) {
			System.out.println("next semester");
		}
		else if (inp >=2.0) {
			System.out.println("seasonal semester");
		}else {
			System.out.println("retake");
		}
	}

}
