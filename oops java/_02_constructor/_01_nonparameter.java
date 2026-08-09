

   class Student{ String name ;
        int age;

      public void  Student(){
            System.out.println("constructor is called");
        }
    }
    
public class _01_nonparameter {
    public static void main(String[] args){
    Student s1 = new Student();
    s1.age = 24;
    s1.name = "Anhi";
    
    s1.Student();
    }
}
