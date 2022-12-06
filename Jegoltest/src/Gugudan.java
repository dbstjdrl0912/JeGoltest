import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int base = sc.nextInt();
			int Height =sc.nextInt();
			System.out.println("Base = "+ base);
			
			System.out.println("Height = " + Height);
			double Triangle = (double)base * Height /2;
			System.out.printf("Triangle width = %.1f\n" , Triangle);
			
			System.out.print("Continue? ");
			String x = sc.next();
			if (x != "Y" && x !="y") {
		
			
			}
	}
}
}