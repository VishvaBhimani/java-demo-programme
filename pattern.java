import java.util.Scanner;

public class pattern {// tranengal pattern valo programme(only border)

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

        for(int i=1; i<=n; i++){
          for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
          }
          for(int k=1; k<=i; k++){
            if(i==k || k==1 || i==n){
            System.out.print("* ");
          }
          else{
            System.out.print("  ");
          }
        }
            System.out.println();
        }
    }
}