import java.util.*;

public class _01_Array {
    public static void main(String args[]){
    // syntex =       type arrayname = new type[size];

//   type 1 :  declaration  
//   int[] marks = new int[3];
//  type 2 :
 //  int marks[] = {97,98,95};
//     marks[0] = 97;
//     marks[1]= 98;
//     marks[2] = 95;

//     // System.out.println(marks[0]);
//     //   System.out.println(marks[1]);
//     //     System.out.println(marks[2]);
//    // or
//         for(int i=0;i<3;i++){
//             System.out.println(marks[i]);
//         }


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
         int numbers[] = new int[size];
        //inpit
        for(int i=0;i<size; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }

    }
}
