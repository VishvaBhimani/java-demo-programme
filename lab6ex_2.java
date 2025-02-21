import java.util.Scanner;

class CubeVolum{
    int h;
    int w;
    int d;

    public CubeVolum(int h ,int w,int d){
        this.h = h;
        this.w = w;
        this.d = d;
    }

    public void getter(){
        System.out.println("volum of cub is = "+ h*w*d );
    }

    public String setter(){
        return "volum"+  h*w*d;
    }
}

public class lab6ex_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height = ");
        int a = sc.nextInt();
        System.out.println("enter width = ");
        int b = sc.nextInt();
        System.out.println("enter depth = ");
        int c = sc.nextInt();
        CubeVolum s1 = new CubeVolum(a, b, c);
        s1.setter();
        s1.getter();

        System.out.println("enter height = ");
        int d = sc.nextInt();
        System.out.println("enter width = ");
        int e = sc.nextInt();
        System.out.println("enter depth = ");
        int f = sc.nextInt();
        CubeVolum s2 = new CubeVolum(d, e, f);
        s2.setter();
        s2.getter();
    }
}
