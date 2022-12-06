import java.util.Scanner;

public class Hamsu1 {
	int min(int x, int y, int z) {
		
		for (int i = 0; i < y; i++) {
			z *= x;
		}
		return z;
	}

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hamsu1 h = new Hamsu1();

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = 1;

		
		int a = h.min(x, y, z);
		System.out.println(a);
	}
}
