
import java.util.*;
public class _02_2DArray {
    public static void main(String args[]){

        // syntex  type[][] arrayName = new type[row][column];
        // eg  int[][] numbers = new int[3][5];

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[row][cols];

        // 2d array input take and print
        // //inputs
        // //rows
        // for(int i=0;i<row;i++){
        //     //columns
        //     for(int j=0;j<cols;j++){
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }

        // //output
        // for(int i=0; i<row; i++){
        //     for(int j=0;j<cols;j++){
        //         System.out.print(numbers[i][j]+" ");
        //     }
        //     System.out.println();
        // }



        // x found a number on array
        //inputs
        //rows
        for(int i=0;i<row;i++){
            //columns
            for(int j=0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        
        int x = sc.nextInt();

        for(int i=0;i<row;i++){
        for(int j=0; j<cols;j++){
            // compare with x
            if(numbers[i][j]== x){
                System.out.println("x fount at location ("   + i +    ","    + j +    ")"  );
            }
        }
    }



    }
}
