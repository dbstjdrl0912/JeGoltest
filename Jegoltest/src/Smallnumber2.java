import java.util.Scanner;

public class Smallnumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] min = new int[10];
		
		for (int i = 0; i < min.length; i++) {
		  min[i] = sc.nextInt();
		}
		  int x = min[0];
		  for (int i = 0; i < min.length ;i++ ) {
			  if (x > min[i]) {
			  x = min[i];
			  }
		  }sc.close();
		  System.out.println(x);
		}
		
	}


