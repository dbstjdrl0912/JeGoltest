import java.util.Scanner;

public class Whie_doint {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] ar = new int[10];
		int  i = 0;
		do {
			ar[i] = sc.nextInt();
		}while(ar[i++] !=10);
		
		for (int j = i ; j  >= 0; j--) 
		{
			System.out.print(ar[j]);
		}
	}

}
