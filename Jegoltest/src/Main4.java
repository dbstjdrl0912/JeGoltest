import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum0 = 0;
		int sum00 = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		int [][] x = new int [4][4];
		for (int i = 0; i< x.length; i++) { 
			for(int j = 0; j< x.length-1; j++) {
				x[i][j] = sc.nextInt();
			if (j == 2 ) {
				x[i][4] = x[i][1]+x[i][2]+x[i][3];
			}
				if(j == 0) {
					sum0 += x[i][j];
				}
				System.out.print(x[i][j] +" ");
			}
		}

	}
}