import java.util.Scanner;

public class Asccode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			char x = sc.next().charAt(0); 
			if(x>47 && x <58) {
				System.out.printf("%d\n",(int)x);
		}else  if (x>64 && x<=90|| x>96 && x<=122) {
			System.out.printf("%c\n",x);
		} else {
			break;
		}
	}

}
}