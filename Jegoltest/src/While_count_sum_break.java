import java.util.Scanner;

public class While_count_sum_break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0; // count 횟수를 누적하기위한 정수
		int sum = 0; // sum 입력받은 수를 누적하기 위한 정수
		while (true) {	
			int i = sc.nextInt();
			count++; // while true 문으로 반복을 시키며 입력을 받을때마
						// count++ 을 통하여 횟수를 체크한다
			sum += i; // sum 과 i[입력받는정수] 를 += 을 통하여
						// 입력받는수를 모으면서 더해서 sum으로 모은다
			if (i >= 100) {
				sc.close();
				break;
			}
		}
		System.out.println(sum);
		System.out.printf("%.1f", (double) sum / count);
	}

}
