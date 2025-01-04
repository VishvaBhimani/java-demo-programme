 import java.util.Scanner;
 public class LargestNum{
	public static void main(String[] args){
		System.out.println("enter three numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
        	if(a>c){
        		System.out.println("larget num="+a);
        	}
        	else{
        		System.out.println("largest num c="+c);
        	}
        }
       else if(b>a){
               if(b>c){
               	System.out.println("largest num b="+b);
               }
               else{
               	System.out.println("largest num c="+c);
               }
        	}
        }
	}
