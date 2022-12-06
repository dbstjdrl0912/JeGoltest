import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		for (int i = 1; i <= N; i++) {
//			for (int j = 1; j <= N; j++) {
//				if (j < N + 1 - i) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // a = 마지막 줄 별 개수
		for (int i = 1; i <= a; i++) { // i가 별 개수가 될 때까지 반복 0 5(4)
			for (int j = 1; j <= a - i; j++) { // 공백개수 점점 줄어듬
				System.out.print(" "); // 공백 출력
			}

			for (int n = 0; n < i; n++) { // a = 별 순서대로 출력
				System.out.print("*"); // 별 개수
			}
			System.out.println();
		}
	}

}