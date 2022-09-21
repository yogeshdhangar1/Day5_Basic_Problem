import java.util.*;
public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Enter no of times you want to toss");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = 0, h = 0;
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5) {
                t++;
            } else {
                h++;
            }
        }
        double headspercentage = (h * 100) / n;
        double tailpercentage = (t * 100) / n;

        System.out.println(+h + "head percentage:" + headspercentage);
        System.out.println(+t + "tail percentage is:" + tailpercentage);
    }
}

