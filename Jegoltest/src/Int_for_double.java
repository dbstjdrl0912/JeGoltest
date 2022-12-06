import java.util.Scanner;

public class Int_for_double {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		int z = 0;
		double a = 0;
		for (int y = 0; y< x.length; y++ ) {
			x[y]= sc.nextInt();
		
			z = x[1]+x[3]+x[5]+x[7]+x[9] ;
			a = (double)(x[0]+x[2]+ x[4]+ x[6]+x[8]) / 5 ;
		}sc.close();
		System.out.println("sum : " + z);
		System.out.printf("avg : %.1f" , a);
	}
}