import java.util.Scanner;

public class Max_min2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[6];

		for (int i = 0; i < sum.length; i++) {
			sum[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < sum.length; i++) {
			int max = 0;
			for (int j = 0; j < sum.length; j++) {
				if (max < sum[j]) {
					max = sum[j];

				}
			}
			for (int j = 0; j < sum.length; j++) {
				if (max == sum[j]) {
					sum[j] = -1;
				}
			}
			System.out.print(max + " ");
		}
	}
}