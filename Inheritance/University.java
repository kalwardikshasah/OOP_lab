// import javax.print.attribute.standard.MediaSize.Engineering;

class Person {
    String name;
    int ID;

    Person(String name,int ID){
        this.name=name;
        this.ID=ID;
    }
    
}
 class Student extends Person {
    String department;
    double CGPA;
    
    Student(String name, int ID ,String department, double CGPA){
     super(name,ID);
     this.department=department;
     this.CGPA=CGPA;
    }
}

class ResearchScholar extends Student {
    String researchTopic;
    String guideName;

    ResearchScholar(String name, int ID, String department, double CGPA,
                    String researchTopic, String guideName) {

        super(name, ID, department, CGPA); 
        this.researchTopic = researchTopic;
        this.guideName = guideName;
    }

  void displayProfile(){
    System.out.println("-------Research scholar Profile-------");
    System.out.println("Name :" +name);
    System.out.println("ID :" +ID);
    System.out.println("Department :" +department);
    System.out.println("CGPA :" +CGPA);
    System.out.println("Reseacher Topic :" +researchTopic);
    System.out.println("Guide Name :" +guideName);
    System.out.println("-----------------------");
  }
    
 }
public class University {
    public static void main(String[] args) {
        ResearchScholar r1=new ResearchScholar("Liza", 101, "Computer Engineering", 9.65, "AI & DATA science", "ER.Diksha");

     r1.displayProfile();   
    }
}
