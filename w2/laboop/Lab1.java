package w2.laboop;

public class Lab1 {
    public static void main(String[] args) {
        Person hoangdz = new Person();
        hoangdz.inputDetails();
        hoangdz.displayDetails();

        Person hoaihh = new Person("Dinh Thanh Hoai", 21, "Bang Liet");
        hoaihh.displayDetails();
    }
}
