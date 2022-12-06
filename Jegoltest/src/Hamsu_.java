import java.util.Scanner;

class sg {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	char b = sc.next().charAt(0);
	int c = sc.nextInt();

}

public class Hamsu_ {

	public static void main(String[] args) {
		sg s = new sg();
		if (s.b == '+') {
			System.out.println(s.a + " " + s.b + " " + s.c + " = " + (s.a + s.c));
		} else if (s.b == '-') {
			System.out.println(s.a + " " + s.b + " " + s.c + " = " + (s.a - s.c));
		} else if (s.b == '*') {
			System.out.println(s.a + " " + s.b + " " + s.c + " = " + (s.a * s.c));
		} else if (s.b == '/') {
			System.out.println(s.a + " " + s.b + " " + s.c + " = " + (s.a / s.c));
		} else {
			System.out.println(s.a + " " + s.b + " " + s.c + " = " + "0 ");
		}
	}
}
