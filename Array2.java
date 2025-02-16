import java.util.Scanner;

public class Array2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
        System.out.println("enter the element:");
        int sum=0;

        for(int i=0 ; i<a.length; i++){
           int b = sc.nextInt();
           a[i]= b;
           sum = sum+a[i];
        }

        System.out.println("sum="+sum);

        double avg = (sum / 5);
        System.out.println("avg="+avg);



	}
}