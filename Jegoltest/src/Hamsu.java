import java.util.Scanner;

public class Hamsu {

	public static void printStr() { // 구현부 -선언부
		System.out.println("~!@#$^&*()_+|");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //시작부

//		System.out.println(num);
		for (int i = 0; i < num; i++) {
			printStr(); //호출부
		}
	}
}
