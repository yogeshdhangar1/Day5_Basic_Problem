import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter x1 Point");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 Point");
        int y1 = sc.nextInt();
        System.out.println("Enter x2 Point");
        int x2 = sc.nextInt();
        System.out.println("Enter y2  Point");
        int y2 = sc.nextInt();
        double distance = Math.sqrt((x1*x2)+(y1*y2));
        System.out.println("Calculate Distance "+"("+x1+" , "+y1+"),"+"("+x2+","+y2+")====>"+distance);
    }
}
