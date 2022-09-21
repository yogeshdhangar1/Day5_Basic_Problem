import java.util.Scanner;

public class Swapnumber {
    public static void main(String[] args) {
        int x,y,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value og X & Y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Enter the Number Before Swaping:"+x+" "+y);
        t= x;
        x= y;
        y = t;
        System.out.println("After Swaping of:"+x+" "+y);
        System.out.println();
    }
}
