import java.util.Scanner;

public class While_if_else_count_break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while (true) {
			int x = sc.nextInt();
			count++;
			if (x >= 100) {
				sum = sum + x;
				sc.close();
				break;
			} else {
				sum = sum + x;
			}
		}

		System.out.println(sum);
		System.out.printf("%.1f", (double) sum / count);
	}
}
