import java.util.Scanner;
public class FerToCel{
	public static void main(String[] args){
		System.out.println("enter tem :");
        Scanner sc = new Scanner(System.in);
        Double f = sc.nextDouble();
        Double c = (((f-32)*5)/9);

        System.out.println("cel="+c);
	}
}