package w2.laboverriding;

public class testPerson {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        Employee employee = new Employee("Jane Smith", 50000);
        Student student = new Student("Alice Johnson", "123 Main St.");
        person.printDetails();
        System.out.println();
        employee.printDetails();
        System.out.println();
        student.printDetails();
    }
}
