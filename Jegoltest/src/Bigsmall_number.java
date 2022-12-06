import java.util.Scanner;

public class Bigsmall_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int [] input = new int [10]; 
//		for (int i =0; i < input.length; i++){
//				input[i] =sc.nextInt(); //숫자 입력
//		}
//		int x = 0;  //100미만의 가장 큰수
//		int y = 0; // 100이상의 가장 작은수
//		for (int i =0; i < input.length; i++) { // 입력 받은 값의 길이 만큼 동작
//			int value = input[i]; //입력 받은 값 하나씩 사용
//			if (value <100) {  //입력 받은 값이 100보다 작을 경우 True
//				if (x < value) {// x가 입력 받은 값보다 작을 경우 True
//					x=value; // x 값을 새로 초기화
//				}
//			}
//			else { //입력받은 값이 100보다 크거나 같을 경우 
//				if (y== 0 || y > value) { //y값이 0이거나 입력 값보다 작을경우 True
//					y= value; // y 값을 새로 초기화
//				}
//			}
//		}
//		System.out.print(x +" "+ y); //출력
		int[] inp = new int[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}

		int max = -1, min = 10000;
		for (int i = 0; i < inp.length; i++) {
			if (inp[i] > max && inp[i] < 100) {
				max = inp[i];
			}
			if (inp[i] < min && inp[i] >= 100) {
				min = inp[i];
			}
		}

		if(max == -1) {
			max = 100;
		}
		if(min == 10000) {
			min = 100;
		}

		System.out.println(max + " " + min);
	}
}
