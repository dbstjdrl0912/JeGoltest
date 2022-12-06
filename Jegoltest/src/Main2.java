import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int m =sc.nextInt();
		int count = 0;
		switch(m) {
		case 1 :
			for (int i = 1; i <= num1; i++) {
				for (int j =0; j<num1; j++) {
					System.out.print(i + " ");
				}System.out.println();
							}
		
		case 2 :
			while (count <=num1 ) {
			for(int i = 1; i<=num1; i++) {
			System.out.print(i + " ");
			if( i == num1) {
				System.out.println();
				for (int j = num1; j >= 1; j-- ) {
					System.out.print(j + " ");
				}
			}
			}
		}
		
		case 3 :
			
		
			
		}

		}
	}


