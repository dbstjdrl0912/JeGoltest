import java.util.Scanner;

public class Small_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] x = new int [10];
	
		for (int y = 0 ; y < x.length; y++) {
			x[y] = sc.nextInt();
		}
		int min = x[0];
		for (int i = 1 ; i < x.length; i++) {
			if (min > x[i])
				min = x[i];
			System.out.println(min);	}
		sc.close();
	}
	 
}
