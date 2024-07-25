package w2.labaccess;

public class testAccess {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John Doe", "123 Main St.", 5000);

        System.out.println("Name: " + employee.name); // default access
        System.out.println("Address: " + employee.address); // public access
        System.out.println("Balance: " + employee.balance); // protected access

        employee.display(); // public method
    }
}
