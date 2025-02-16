import java.util.Scanner;

public class Array4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		String ch = sc.nextLine();
         
        int count = 0;
		for(int i=0 ; i<ch.length(); i++){
           count++;
		}
		System.out.println("count length="+count);

		for(int j=count/2 ; j<ch.length(); j++){
			char a =ch.charAt(j);
			System.out.print(a);
		}
	}
}