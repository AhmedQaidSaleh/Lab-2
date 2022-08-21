import java.util.Scanner;

public class Q3T {
    public static void main(String[] args) {
        int Length , Width ;
        Scanner in = new Scanner(System.in);
        System.out.println("Calculate the Area of Rectangle  ");
        System.out.print("Enter the Length : ");
        Length = in.nextInt();

        System.out.print("Enter the Width : ");
        Width = in.nextInt();
        System.out.println("The Rectangle Area = " +(Length * Width)+" only");


    }
}
