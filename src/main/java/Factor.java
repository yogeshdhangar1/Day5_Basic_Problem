import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int factor = 1;
        for(int i = n;i>1;i--){
            factor = factor * i;
        }
        System.out.println("Factor is :"+factor);

    }
}
