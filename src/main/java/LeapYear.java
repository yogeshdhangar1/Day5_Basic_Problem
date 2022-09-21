import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the year");
        int y = sc.nextInt();
        if(y%100==0||y%4!=0){
            if(y%400==0){
                System.out.println("Its Leap Year:"+y);
            }else{
                System.out.println("Not leap year:"+y);
            }
        }
        else{
            System.out.println("its not leap year:"+y);
        }
    }
}
