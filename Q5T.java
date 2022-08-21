import java.util.Scanner;

public class Q5T {
    public static void main(String[] args) {

        Scanner o =new Scanner(System.in);
        int A,B,C;
        System.out.println("Enter Value of A : ");
        A = o.nextInt();
        System.out.println("Enter Value of B : ");
        B = o.nextInt();
            C = B;
            B = A;
            A = C;
        System.out.println("Aftar swapping A = " + A );
        System.out.println( "Aftar swapping B =" + B );
    }
}
