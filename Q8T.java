import java.util.Scanner;

public class Q8T {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double   val;

        System.out.print("Enter the  value : ");
        val = input.nextInt();

        System.out.println("the Square is = "+(val * val));


        System.out.println("the Cube is = " +(val * val * val));
          System.out.println("the Fourth is = "+(Math.pow(val , 4)));


    }
}
