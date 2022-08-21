import java.util.Scanner;

public class Q2T {
    public static void main(String[] args) {
        int a;
        double o = 3.14,area;
        Scanner s =new Scanner(System.in);
        System.out.println("enter radius of circle :");
        a = s.nextInt();
        area = o * a * a ;
        System.out.println("area of circle: "+area);

    }
}
