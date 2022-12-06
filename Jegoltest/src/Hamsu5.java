import java.util.Scanner;

public class Hamsu5 {
	int min(int num1, int num2, int num3) {
		int a = 0;
		if (num1 > num2 && num1 > num3) {
			a = num1;
		} else if (num2 > num1 && num2 > num3) {
			a = num2;
		} else {
			a = num3;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		Hamsu5 hi = new Hamsu5();
		hi.min(num1, num2, num3);
		System.out.println(hi.min(num1, num2, num3));

	}
}
