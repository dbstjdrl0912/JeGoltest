import java.util.Scanner;
// 최대값 부터 차례대로 출력 

public class Max_min4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < num.length; i++) {

		}

		for (int i = 0; i < num.length; i++) {
			int max = -1, idx = -1;
			for (int j = 0; j < num.length; j++) {
				if (max < num[j]) {
					max = num[j];
					idx = j;
				}
			}
			System.out.print(max + " ");
			num[idx] = -1;

			for (int j = 0; j < num.length; j++) {

			}

		}
	}
}

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class Main {
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      Integer [] a = new Integer[10];
//      for(int i = 0; i<a.length; i++) {
//         a[i] = sc.nextInt();
//      }
//      sc.close();
//      Arrays.sort(a, Collections.reverseOrder());
//      
//      for(int i = 0; i <a.length; i++) {
//         System.out.print(a[i] + " ");
//      }
//   }
//}