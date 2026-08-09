
class pen{
    String color;
    public void printcolor(){
        System.out.println("the color of the pen is "+this.color);
    }
}

public class oops_ex2 {
    public static void main(String[] args) {
      pen p1 = new pen();
      p1.color =  "blue";

      pen p2 = new pen();
      p2.color = "red";

      pen p3 = new pen();
      p3.color = "green";

      p1.printcolor();
        p2.printcolor();
        p3.printcolor();

    }
}
/*Note : When an object is created using a new keyword, 
then space is allocated for the variable in a heap, 
and the starting address is stored in the stack memory. */
