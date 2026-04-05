 class Employee {
    String name;
    int Id;
    double salary;

    Employee(String name, int Id, double salary){
        this.name=name;
        this.Id=Id;
        this.salary=salary;
    }
    void display(){
        System.out.println("Employee's Name :" +name);
        System.out.println("Employee's ID :" +Id);
        System.out.println("Base salary :" +salary);
    }
}
 class Teamlead extends Employee {
    int teamsize;
    double bonus;

    Teamlead(String name, int Id, double salary, int teamsize, double bonus){
        super(name,Id,salary);
        this.teamsize=teamsize;
        this.bonus=bonus;
    }
    void display(){
        super.display();
        System.out.println("Team size :" +teamsize);
        System.out.println("Leadership bonus :" +bonus);
    }
    
}
 class  ProjectManager extends Teamlead {
    String projectname;
    double projectbudget;

    ProjectManager(String name,int Id,double salary,int teamsize, double bonus ,String projectname,double projectbudget ){
        super(name, Id, salary,teamsize,bonus);
        this.projectname=projectname;
        this.projectbudget=projectbudget;
    }
       void display(){
        super.display();
        System.out.println("Project Name :" +projectname);
        System.out.println("Project Budget :" +projectbudget);
       }
 }

public class Company {

    public static void main(String[] args) {
        
        ProjectManager pm=new ProjectManager("Liza", 101, 1000000, 8, 100000, "APP", 9000000);
        pm.display();
    }
}