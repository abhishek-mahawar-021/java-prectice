public class _09_pattern {
    public static void main(String args[]){
        /*
        1
        0 1
        1 0 1
        0 1 0 1 
        1 0 1 0 1
        */
       // 0 and 1 alternate in each row and column
       // so use even and odd sum of row and column to print 1 and 0
       
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


    }     
}
