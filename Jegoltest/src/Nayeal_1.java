import java.util.Scanner;

public class Nayeal_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int n = sc.nextInt();
		sc.close();

//		System.out.println(inp);
//		System.out.println(n);

		for (int i = inp.length() - 1; i > 0 && n> 0; i--, n--) {
			System.out.print(inp.charAt(i));
		}
	}
}