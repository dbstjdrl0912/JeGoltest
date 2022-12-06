import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
	for (int i = 5 ; i >=x;i-- ) {
		System.out.print("*");
		System.out.println();
		for(int j = 0 ; j < x ;j++) { 
			System.out.print("*");
			for(int k = 0; k<x -1; k-- ) {
				System.out.print("*");
			}
		}
		
	}

	}
}