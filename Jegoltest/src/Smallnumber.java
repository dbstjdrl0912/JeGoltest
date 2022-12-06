import java.util.Scanner;

public class Smallnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum[] = new int [10];
		
		
		for (int i = 0 ; i < sum.length; i++) {
			sum[i] = sc.nextInt();
		} 
		int min = sum[0];
		for (int j = 0; j < sum.length; j++) {
			if (min > sum[j]) {
				min = sum[j];
				
			}
		}sc.close();
		System.out.println(min);
		

	}

}
