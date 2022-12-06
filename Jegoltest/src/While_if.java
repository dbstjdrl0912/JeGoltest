import java.util.Scanner;

public class While_if {
	Scanner sc = new Scanner(System.in);

	void year() {
		while (true) {
			int num = sc.nextInt();
			if (num % 3 == 0) {
				System.out.println(num / 3);
			} else if (num == -1) {
				break;
			}
		}
		sc.close();
	}

	public static void main(String[] args) {

		While_if v = new While_if();
		v.year();
	}
}
