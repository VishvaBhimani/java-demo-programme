import java.util.Scanner;

 class Student{
     String name;
     int roll_no;
     Double spi;
     String course;

     public Student(String name,int roll_no,Double spi, String course){
        this.name = name;
        this.roll_no = roll_no;
        this.spi = spi;
        this.course = course;

     }

      public void setter(){
        System.out.println("student  "+ this.name +"  and having this roll no "+this.roll_no + "  have this spi  " + this.spi + "  of the student of   " + this.course);
     }

     public String getter(){
        return "student  " + name + "  have this  " + roll_no + "  having spi is  " + spi + "  this courde of student" + course;
     }

    
}

public class lab6ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name = ");
        String a = sc.nextLine();
        System.out.println("enter roll no = ");
        int b = sc.nextInt();
        System.out.println("enter spi = ");
        double c = sc.nextDouble();
        String e = sc.nextLine();
        System.out.println("enter course = ");
        String d = sc.nextLine(); 


        Student s1 = new Student(a,b,c,d);
        s1.setter();
        s1.getter();


    }
    
}
