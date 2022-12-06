import java.util.Scanner;

public class Whileforgugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = 0;
if(y>x) {
		while (true) {
			System.out.println("== " + x + "dan ==");
			for (int i = 1; i <= 9; i++) {
				z = x * i;
				System.out.printf("%d * %d = %2d\n",x,i,z );
			}
			x++;

			if (x > y) {
				break;
			}
		}
}else if (y<x) {
		while (true) {
			System.out.println("== " + y + "dan ==");
			for (int i = 1; i <= 9; i++) {
				z = y * i;
				System.out.printf("%d * %d = %2d\n",y,i,z );
			}
			y++;

			if (x < y) {
				break;
			}
		}
}

	}
}