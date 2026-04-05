// Scenario:
// Class Student:

// Student()
// Student(String name)
// Student(String name, int age)

// Expected Output:

// Default Constructor
// Name: Diksha
// Name: Diksha Age: 20

class Student{

     Student(){
        System.out.println("Default constructor");
    }
      Student(String name){
        System.out.println(" Name : " +name);
    }
     Student(String name , int age){
        System.out.println(" Name : " +name+ " Age : " +age);
    }
}

public class StudentDetail {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student(" Liza ");
        Student S3 = new Student("Liza", 18);
    }
}
