import java.util.Scanner;

class Time{
	int h,h1;
	int m,m1;
	int s,s2;
	 void SumOfTime(int h, int m, int s,int h1,int m1,int s2){
         int sum1=0;
          sum1 = h+h1;
         int sum2=0;
          sum2 = m+m1;
         int sum3=0;
          sum3 = s+s2;
         System.out.println("time is ="+sum1+":"+sum2+":"+sum3);
        
	 }

}
public class lab622{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values of time 1 :");
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int s1 = sc.nextInt();
		System.out.println("enter values of time 2 :");
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int s2 = sc.nextInt();
		Time a = new Time();
		a.SumOfTime(h1,m1,s1);
		Time b = new Time();
		b.SumOfTime(h2,m2,s2);
	}
}