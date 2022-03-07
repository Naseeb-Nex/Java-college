import java.util.*;

class Employee{
    String name;
    int age;
    int phn;
    String add;
    int sal;

    Employee(String n, int a, int phn, String add, int sal){
        this.name = n;
        this.age = a;
        this.phn = phn;
        this.add = add;
        this.sal = sal;
    }

    void print_sal(){
        System.out.println("Salary : "+sal);
    }
}

class Manager extends Employee{
    String dep;
    Manager(String n, int a, int phn, String add, int sal, String dep){
        super(n,a,phn,add,sal);
        this.dep = dep;
    }
}

class Officer extends Employee{
    String spec;
    Officer(String n, int a, int phn, String add, int sal, String spec){
        super(n,a,phn,add,sal);
        this.spec = spec;
    }
}
class Empdetails {
    public static void main(String[] args) {
        Manager m = new Manager("XY", 20, 8137, "lol", 10000, "AI");
        Officer o = new Officer("AB", 21, 8138, "loll", 20000, "Dev");
        m.print_sal();
        o.print_sal();
    }   
}