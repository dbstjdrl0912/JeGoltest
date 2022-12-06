import java.util.Scanner;

public class Choice {
	void blue(int x, int y) {

		if (x < y) {
			System.out.println(y - x);

		} else {
			System.out.println(x - y);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		Choice ci = new Choice();
		ci.blue(x, y);
	}
}
