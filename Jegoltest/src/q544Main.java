import java.util.Scanner;

public class q544Main {
	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	int inp = sc.nextInt();

	int sum = 0;
	for(int i = inp; i<=100; i++) {
		sum += i;

	}
	System.out.println(sum);

}
}