import java.util.Scanner;

class Cal {

   int num1 = 0;
   int sum1 = 0;
   String sum2;

   public String C(String[] x) {
      for (int i = 0; i < x.length; i++) {
         num1 = Integer.parseInt(x[i]) * Integer.parseInt(x[i]);
         sum1 += num1;
      }
      sum2 = String.valueOf(sum1);
      return sum2;

   }
}

public class Hamsu7 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String b = "";
      String a = sc.next();
      sc.close();
      
      Cal A = new Cal();
      String[] x = a.split(b);
      A.C(x);

      System.out.println(A.sum1);

   }

}