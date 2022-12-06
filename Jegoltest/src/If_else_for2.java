import java.util.Scanner;

public class If_else_for2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number?");
			int x = sc.nextInt();
			System.out.println();
			if (x == 1) {
				System.out.println("Seoul");

			} else if (x == 2) {
				System.out.println("Washington");

			} else if (x == 3) {
				System.out.println("Tokyo");

			} else if (x == 4) {
				System.out.println("Beijing");

			} else {
				System.out.println("none");
				break;
			}System.out.println();
		}
	}
}
