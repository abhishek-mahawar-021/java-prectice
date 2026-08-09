
// compile time polymorphism is also known as static polymorphism or method overloading.
class student{
    String name;
    int age;

    public void displayinfo(String name){
        System.out.println(name);
    }
    public void displayinfo(int age){
        System.out.println(age);
    }
    public void displayinfo(String name, int age){
        System.out.println("name is: "+name);
        System.out.println("age is: "+age);
    }
}

public class _01_compiletime {
    public static void main(String[] args){
        student s1 = new student();
        s1.displayinfo("Anhi");
        s1.displayinfo(24);
        s1.displayinfo("Anhi", 24);
       // its call all 3 constructors because of method overloading

    }
}
