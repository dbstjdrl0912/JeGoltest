import java.util.Scanner;

public class For_while_do_ {
	public static void main(String[] args) {
		int y = 10;
		// 1
//		for (int x = 10; x <= 20 ; x++) {
//			System.out.printf("%d " ,x);
//		}
        //2	
//		while (true) {
//			if(y <= 20 && y >=10) {
//				System.out.print(y+" ");
//			}
//			y++;
//			if (y== 21) {
//				break;
//			}
		// 3
//		do {
//		System.out.print(y + " ");
//			y++;
//		} while (y <= 20);
//		
		// 4
		int[] z = new int[11];
		for (int i = 0; i < z.length; i++) {
			z[i] = y;
			y++;
			System.out.print(z[i] + " ");
		}
	}
}
