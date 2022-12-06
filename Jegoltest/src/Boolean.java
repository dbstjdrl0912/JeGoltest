import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		boolean x = num1 > num2 && num1 > num3;
		boolean y = num1 == num2 && num2 == num3;

		System.out.print(x + " " + y);
//		boolean x=  true;
//		if(num1>num2 && num1>num3) {
//			System.out.print(x + " ");
//		}  else {
//			x = false;
//			System.out.print(x + " ");
//		}
//		x=  true;
//		
//		if(num1 == num2 && num2 ==num3 ) {
//			System.out.print(x +" ");
//		}else {
//			x = false;
//			System.out.print(x);
//		}
	}

}
