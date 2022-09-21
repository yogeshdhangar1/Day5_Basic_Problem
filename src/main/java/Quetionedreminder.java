import java.util.Scanner;

public class Quetionedreminder {
    public static void main(String[] args) {
        int x,y,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divided");
        x = sc.nextInt();
        System.out.println("Enter divisor");
        y = sc.nextInt();
        x = x/y;
        n = x%y;
        System.out.println("Quotient:"+x);
        System.out.println("Remainder:"+n);
    }
}
