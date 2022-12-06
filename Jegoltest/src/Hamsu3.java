import java.util.Scanner;

public class Hamsu3 {

	void num(int x) {
		int count = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		Hamsu3 ha = new Hamsu3();
		ha.num(x);
	}
}
