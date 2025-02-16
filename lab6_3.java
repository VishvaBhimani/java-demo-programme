// Create a class named Bank_Account with data memebers accountNo, userName, email, 
// accountType and accountBalance, Also create methods getAccountDetails() and 
// displayAccountDetails(). 
import java.util.Scanner;
class Bank_Account{
     String userName;
     String email;
     int acountNum;
     String acountType;
     int acountBalnace;


     public Bank_Account(String userName,String email,int acountNum,String acountType,int acountBalnace){
        this.userName = userName;
        this.email = email;
        this.acountNum = acountNum;
        this.acountType = acountType;
        this.acountBalnace = acountBalnace;
    
     }

     public void displayAccountDetails() {
         System.out.println("this acount no= "+acountNum+" is having "+acountBalnace+" in their account ");
     }

     public String getAccountDetails(){
        return acountNum+" is having "+acountBalnace+" in their Acount ";
     }
    }

 

public class lab6_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username ");
        String a = sc.nextLine();
        System.out.println("enter acouunt num ");
        int b = sc.nextInt();
        System.out.println("enter email ");
        String c = sc.nextLine();
        sc.nextLine();
        System.out.println("enter type ");
        String d = sc.nextLine();
        System.out.println("enter balnce ");
        int e = sc.nextInt();
       Bank_Account b1 = new Bank_Account(a,c,b,d,e);
        
        b1.getAccountDetails();
        b1.displayAccountDetails();
    }
}
