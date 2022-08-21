import java.util.Scanner;

public class Q9T
{
    public static void main(String[] args) {

        Scanner inputn = new Scanner(System.in);
        int a,b;
        System.out.println("input 1  :");
        a = inputn.nextInt();

        System.out.println("input 2  :");
        b = inputn.nextInt();
        System.out.println("sum = "+(a+b));
        System.out.println("difference = "+(b-a));
        System.out.println("product = "+(a*b));
        System.out.println("average = "+(double )(a+b)/2);
        System.out.println("distance = "+(Math.abs(a-b)));
        System.out.println("max = "+(Math.max(a,b)));
        System.out.println("min = "+(Math.min(a,b)));



    }
}
