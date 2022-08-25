import java.util.Scanner;

public class bintodec {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      while(n>=0){
          int rem=n%2;
          sum=sum*10+rem;
          n=n/2;
      }
      String s=Integer.toString(sum);
      StringBuffer sb=new StringBuffer(s);
      sb.reverse();
//      sum=Integer.parseInt(sb);
        System.out.println(sb);

    }

}
