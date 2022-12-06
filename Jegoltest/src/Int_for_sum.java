import java.util.Scanner;

public class Int_for_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum1 = 0 ; 
		for (int i = 0 ; i < 10; i++) {
			if (i % 2 == 0) {
				sum1 += sc.nextInt();
			}else {
				
			}
		
		}sc.close();
			System.out.println("sum : " + sum1);
			System.out.printf("avg :  %.1f\n", (double) sum1 /5);

	}
}