 import java.util.Scanner;
 public class arearec{
	public static void main(String[] args){
		System.out.println("enter side :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();
        int area = a*b;

        System.out.println("area="+area);
	}
}