import java.util.Scanner;

public class Array3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of Array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter element:");

		for(int i=0 ; i<a.length ; i++){
			int b = sc.nextInt();
			a[i]=b;
		}
        
        System.out.println("print in revers order:");
		for(int j=a.length; j>0 ; j--){
			System.out.println(j);
		}
	}
}