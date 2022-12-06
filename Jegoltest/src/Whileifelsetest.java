import java.util.Scanner;

public class Whileifelsetest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		while (true) {
//			System.out.print("ASCII code =? ");
//			int x = sc.nextInt();
//			char y = (char) x;
//			if ((33 <= x) && (x <= 127)) {
//				System.out.println(y);
//			} else {
//				break;
//			}
//
//		}
		int inp = 0;
		do {
			System.out.printf("ASCII code =? ");
			inp = sc.nextInt();
			if (inp < 33 || inp > 127) {
				break;
			}
			System.out.printf("%c\n", inp);
		} while (33 <= inp && inp <= 127);
		sc.close();
	}

}
