import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the power");
        int p = sc.nextInt();
        int power = 1;
        for(int i =1;i<=p;i++){
            power = power*n;
        }
        System.out.println("Power is:"+power);

    }
}
