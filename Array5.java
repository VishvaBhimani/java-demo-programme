import java.util.Scanner;
public class Array5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String:");
		String ch = sc.nextLine();
		
		int countvc=0;
		int countvs=0;
		int countcon=0;

		for(int i=0; i<ch.length(); i++){
			char b = ch.charAt(i);
			if(b=='a'|| b=='e' || b=='i' || b=='o' || b=='u'){
				countvs++;
			}
			else if(b=='A'|| b=='E' || b=='I' || b=='O' || b=='U'){
				countvc++;
			}
			else{
				countcon++;
			}
		}
			System.out.println("small vovels="+countvs);
			System.out.println("capital vovels="+countvc);
			System.out.println("constant="+countcon);
		}
	}