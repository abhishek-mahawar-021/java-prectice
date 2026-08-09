class Student{
    String name;
    int age;

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oops_ex1{
    public static void main(String[] args) {
      Student s1 = new Student(); //object of student class
      s1.name = " anhi";//reference variable of student class
      s1.age = 24;
      s1.getInfo();//method of student class

      Student S2 = new Student();//second object of student class
        S2.name = "Ankit";//reference variable of student class with different value
        S2.age = 25;
        S2.getInfo();//method of student class with different value
    }
}