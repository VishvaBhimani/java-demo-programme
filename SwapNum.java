import java.util.Scanner;

public class SwapNum{
	public static void main(String[] args){
		System.out.println("enter number :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
	}
}