public class _03_pattern {
    public static void main(String args[]){
        /*
        *
        * *
        * * *
        * * * *
        */
        // hear row ans column are same 
        // in decrese order so in column are use j<=i
        // raw - outer loop
        // clumn - inner loop
       
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
