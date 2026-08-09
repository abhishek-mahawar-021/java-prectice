
//single inheritance is a process where one class acquires the property of another class. 
// Inheritance is used to represent "is-a" relationship between different classes.
//  It provides code reusability and method overriding.

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


public class _01_SingleInheritence {
    public static void main(String[] args){
        Shape s1 = new Shape();
       s1.area();
       Triangle t1 = new Triangle();
        t1.area(5, 10);
    }
}
