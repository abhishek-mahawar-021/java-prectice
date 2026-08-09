

//hierarchical inheritance is a process where one class acquires the property of multiple classes.

class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class EquilateralTriangle extends Triangle {
   int side;
}


public class _03_Multilevel {
    public static void main(String[] args){
        Shape s1 = new Shape();
       s1.area();
       Triangle t1 = new Triangle();
        t1.area(5, 10);
        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.side = 5;
        System.out.println(e1.side);
    }
}
