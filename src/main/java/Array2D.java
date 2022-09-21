import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press \n.1 IntArray \n.2 DoubleArray  \n.3 exit");
        boolean t = true ;
        while(t){
            int uservalue = sc.nextInt();
            if(uservalue==1){
                Intarray();
            }
            if(uservalue==2){
                DoubleArray();
            }
            if(uservalue==3){
                t = false;
            }
        }
    }

    private static void DoubleArray() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the row ");
        int row  = sc.nextInt();
        System.out.println("Enter the column");
        int column = sc.nextInt();

        double[][] doubles = new double[row][column];
        for(int i =0 ;i<row;i++){
            for(int j = 0;j<column;j++){
                doubles[i][j] = sc .nextInt();
            }
        }
        // output
        for(int i =0;i<row;i++){
            for(int j = 0;j<column;j++){
                System.out.print(doubles[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void Intarray() {
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
        // output
        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
