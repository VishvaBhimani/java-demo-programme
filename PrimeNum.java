import java.util.Scanner;

public class PrimeNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
        
        int count=0;
		for(int i=2; i<n; i++){
			if(n%i==0){
				count++;
			}
		}

		if(count==0){
            System.out.println("number is prime");
		}
		else{
			System.out.println("number is not prime");
		}

	}
}