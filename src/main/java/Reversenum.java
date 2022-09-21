import java.util.Scanner;
public class Reversenum {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int r,sum=0;
        for(int i =1;i<=n;i++){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        System.out.println(sum);
    }
}
