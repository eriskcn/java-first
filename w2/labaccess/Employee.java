package w2.labaccess;

public class Employee {
    private int id;
    String name; // default access modifier
    public String address;
    protected double balance;

    // Constructor
    public Employee(int id, String name, String address, double balance) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    // Method to display details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}
