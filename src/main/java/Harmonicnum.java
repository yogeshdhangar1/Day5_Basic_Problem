import java.util.Scanner;

public class Harmonicnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        double  harmonic = 1.000;
        for(int i = 1;i<=n;i++){
            harmonic = 1/i+harmonic;
        }
        System.out.println("Harmonic Number is :"+harmonic);
    }
}
