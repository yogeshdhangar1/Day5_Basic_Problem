import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vowel");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'A':  System.out.println();
                       break;
            case 'B':
                System.out.println("B");
                      break;
            case 'C':
                System.out.println("C");
                break;
            case 'U':
                System.out.println("U");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
