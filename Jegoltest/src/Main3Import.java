import java.util.Scanner;

 class Num1 {
	int[] x = new int[3];
	int[] y = new int[3];
	double sum1 = 0;
	double sum2 = 0;

	void Num2() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			sum1 += x[i];
			sum2 += y[i];
		}
		sum1 = (double) sum1 / 3;
		sum2 = (double) sum2 / 3;
		
		

	}
}

public class Main3Import  {
	public static void main(String[] args) {
		
		Num1 N = new Num1();
		N.Num2();

		System.out.printf("(%.1f, %.1f)", N.sum1, N.sum2);

	}
}