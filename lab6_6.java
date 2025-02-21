import java.util.Scanner;
class StaticDemo{
        static int countObj=0;

       public StaticDemo(){
                countObj++;
        }
        public static int display(){
              return  countObj;
        }
    
}
public class lab6_6 {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                StaticDemo s1 = new StaticDemo();
                StaticDemo s2  = new StaticDemo();
                StaticDemo s3 = new StaticDemo();
               
                System.out.println("print the count object :"+StaticDemo.display());

               


        }
    
}
