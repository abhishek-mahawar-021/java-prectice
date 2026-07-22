import java.util.*;
// it use memory stack more func more memory
// fun store in stack form
// if return function then it free from memory
public class _01_fun {
    public static void PrintMyName(String name){
        System.out.println("abhishek");
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         String name = sc.next();
        PrintMyName(name); // call kiya funceion ko
    }
}
