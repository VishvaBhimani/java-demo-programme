import java.util.Scanner;
public class Array1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String:");
		String ch = sc.nextLine();
		
		int countv=0;
		int countc=0;

		for(int j=0; j<ch.length(); j++){
			char a =ch.charAt(j);
			if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u'){
				countv++;
			}
			else{
				countc++;
			}
		}
		System.out.println("vovels="+countv);
		System.out.println("constant="+countc);

	}
}