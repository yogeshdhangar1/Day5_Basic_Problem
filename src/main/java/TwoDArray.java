import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the row ");
        int row = sc .nextInt();
        System.out.println("Enter the column");
        int column = sc.nextInt();
        int [][] numbers = new int[row][column];
        // input
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
          int x = sc.nextInt();
         for(int i = 0;i<row;i++){
             // compare with x
            for(int j = 0;j<column;j++){
                if(numbers[i][j]==x){
                    System.out.println("X at location (" +i+" ,"+j+")");
                }
            }
        }
    }
    }

