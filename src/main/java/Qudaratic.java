import java.util.Scanner;
public class Qudaratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a");
        double a = sc.nextInt();
        System.out.println("Enter the value of b");
        double b = sc.nextInt();
        System.out.println("Enter the value c");
        double c = sc.nextInt();
        double delta = b*b-4.0*a*c;
        if(delta>0.5){
            double r1 = (-b+Math.pow(delta,0.5)/2.0*a);
            double r2 = (-b-Math.pow(delta,0.5)/2.0*a);
            System.out.println("The roots are"+r1+"and"+r2);
        } else if (delta==0.0) {
            double r1 = (-b/(2.0*a));
            System.out.println("the roots are:"+r1);
        }else{
            System.out.println("the roots are not equal");
        }

    }
}
