import java.util.*;

public class _02_fun {
    // public static int calculateSum(int a, int b){
    //     int sum = a+b;
    //     return sum;
    // }


    // public static int calProduct(int a,int b){
    //     return a*b;
    // }

    public static void printfactorial(int n){
         //loop
        int factorial =1;

        for(int i=n ; i>=1 ; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

//    int sum = calculateSum(a,b);
//    System.out.println(sum);

    // System.out.println("product of 2 no: "+ calProduct(a,b) );

    int n = sc.nextInt();
    printfactorial(n);

  }
}
