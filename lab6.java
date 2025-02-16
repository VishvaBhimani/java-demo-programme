import java.util.Scanner;
class Circle{
	double radius;
	void  AreaOfCircle(double radius){
		double area = Math.PI*radius*radius;
		System.out.println("print ans = "+area);
	}
}
public class lab6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius :");
		double a = sc.nextDouble();
		Circle b = new Circle();
		b.AreaOfCircle(a);
		

	}
}