import java.util.Scanner;

public class Double_z_1a_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int z = sc.nextInt();
		int a = sc.nextInt();
		
		double[] x = {85.6,79.5,83.1,80.0,78.2,75.0 };
		double y = (x[z-1]+x[a-1]) ;
		System.out.printf("%.1f" , y);
		sc.close();
	}

}
