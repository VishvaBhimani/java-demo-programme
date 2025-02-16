import java.util.Scanner;

class Time{
	int m;
	int s;
	int h;
	int rs;
	void SumOfTime(int s){
	 int sum=0;
	 h = s/3600;
	 m = (s%3600)/60;
	 rs = (s%60);
	 System.out.println("time is ="+h+":"+m+":"+rs);
	}
}
public class lab62{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter second =");
          int a = sc.nextInt();
          Time b = new Time();
          b.SumOfTime(a);
      }
}