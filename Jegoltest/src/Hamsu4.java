import java.util.Scanner;

public class Hamsu4 {
	Scanner sc = new Scanner(System.in);
	int max = Integer.MIN_VALUE; // -마이너스 최대값

	void min(int num[]) {
		for (int j = 0; j < num.length; j++) {
			num[j] = sc.nextInt();
			for (int i = 0; i < num.length; i++) {
				if (max < num[j]) {
					max = num[j];
				}

			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int[] num = new int[3];
		Hamsu4 hi = new Hamsu4();
		hi.min(num);

	}
}
