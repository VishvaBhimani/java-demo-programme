import java.util.Scanner;
public class SumNum{
	public static void main(String[] args){
		System.out.println("enter number :");
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;

        System.out.println(sum);
	}
}