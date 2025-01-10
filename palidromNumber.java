import java.util.Scanner;

public class palidromNumber{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
         int rem=0,revers=0,num=n;
		
		for(;n!=0; n=n/10){
			rem = n%10;
			revers = revers*10 + rem;
		}

         if(num==revers){
         	System.out.println("number is palidrom="+num);
         }
         else{
         	System.out.println("number is not palidrom="+num);
         }
		
	}
}