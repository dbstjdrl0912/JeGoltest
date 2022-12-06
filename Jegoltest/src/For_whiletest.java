import java.util.Scanner;

public class For_whiletest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		System.out.println(x);
		int y = 0;
		for (int i = 1; i <= x; i++) {
			y = y + i;
		}
		System.out.println(y);

//		int y = 0, j = 1;
//		while (j <= x) {
//			y += j++;
//		}
//		System.out.println(y);
	}
}
