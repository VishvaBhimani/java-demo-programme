import java.util.Scanner;

 class SquareArea{
     static int side;

     public SquareArea(int side){
            this.side = side;
     }
     public static int display(){
        return side*side;
     }

    
}

public class lab6_7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        SquareArea s1 = new SquareArea(7);
       

        System.out.println("print rea of Square ="+SquareArea.display());

    }
}
