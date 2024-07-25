package w2.laboverriding;

public class Employee extends Person {
    double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    
    public void printDetails() {
        super.printDetails();
        System.out.println("Salary: " + salary);
    }
}
