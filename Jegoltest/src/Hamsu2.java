import java.util.Scanner;

public class Hamsu2 {
	void arse(int y) { //메소드
		double x = 3.14;
		double z = y * y * x;
		System.out.printf("%.2f", z);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		sc.close();
		Hamsu2 ma = new Hamsu2(); //인스턴스
		ma.arse(y); //입력
	}
}
