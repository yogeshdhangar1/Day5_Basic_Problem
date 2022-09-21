import java.util.Scanner;

public class Findlagestint {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1>num2){
            System.out.println("num1 is greater than num2:"+num1);
        }else if(num1>num3){
            System.out.println("num1 is greater than num3:"+num1);
        }else if(num2>num1){
            System.out.println("num2 is greater than num1:"+num2);
        }else if(num3>num1){
            System.out.println("num3 is greater than num1:"+num3);
        }else if(num3>num2){
            System.out.println("Num3 is greater than num2:"+num2);
        }
    }
}
