import java.util.Scanner;

public class Test_boolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				boolean d = a > b && a > c ;
				boolean e = b == c && a == c ;
				
				System.out.print(d);
				System.out.println(" " + e);
				sc.close();
					
		}

}
