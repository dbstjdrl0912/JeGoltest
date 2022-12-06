import java.util.Scanner;

public class Length_for_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] myname = new char [10];
		
		for (int i=0; i <myname.length; i++) {
			char name = sc.next().charAt(0);
			myname[i] = name;
			
		}for (int x = 0; x <myname.length; x++) {
			System.out.print(myname[x]);
			sc.close();
		}
	} 

}
