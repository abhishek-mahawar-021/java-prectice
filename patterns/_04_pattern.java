public class _04_pattern {
    public static void main(String args[]){
        /*
        * * * *
        * * *
        * * 
        * 
        */

        // row column same
        // row - outer loop 
        // column is inner loop
        // hear we gose to n to 1 in outer/row loop and i-- 

        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
