


class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class _03_copyconstructor {
    public static void main(String[] args){
        
        Student s1 = new Student("Anhi", 24);
        Student s2 = new Student(s1);

        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
