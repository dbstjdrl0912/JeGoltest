import java.util.Scanner;

class Student {
   String name;
   int kl;
   int eng;
   int ksum=0;
   int esum = 0;
   void sum(String name,int kl,int eng) {
      ksum += kl;
      esum +=eng;
      
      System.out.printf("%s %d %d\n",name,kl,eng);
   }
   void avg() {
      System.out.printf("avg %d %d",(ksum/2),(esum/2));
   }
}

public class Studentt{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Student st = new Student();
      for(int i=0; i<2;i++) {
         String name = sc.next();
         int kl=sc.nextInt();
         int eng = sc.nextInt();
         st.sum(name, kl, eng);         
      }
      sc.close();
      st.avg();
   }
}