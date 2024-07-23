package w2.laboop.labconstructor;

public class labc {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(20000.0, "Red", "Sedan");
        car1.displayDetails();
        car2.displayDetails();
    }
}
