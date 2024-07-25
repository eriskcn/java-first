package w2.laboverriding;

public class Student extends Person {
    String address;

    public Student(String name, String address) {
        super(name);
        this.address = address;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Address: " + address);
    }
}
