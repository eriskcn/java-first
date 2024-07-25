package w2.laboverriding;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
    }
}
